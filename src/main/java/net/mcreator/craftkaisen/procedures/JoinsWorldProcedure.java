package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JoinsWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		double restrictionrandom = 0;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).JoinsWorld == false) {
			{
				boolean _setval = true;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JoinsWorld = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			random = Mth.nextInt(RandomSource.create(), 1, 100);
			restrictionrandom = Mth.nextInt(RandomSource.create(), 1, 7);
			if (random == 1) {
				{
					boolean _setval = true;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Restricted = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (restrictionrandom == 1) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You were born with Heavenly Restriction!" + " Your body is fragile, but you have a large amount of cursed energy.")), false);
					{
						String _setval = "Fragile";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RestrictedType = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
				if (restrictionrandom == 2) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You were born with Heavenly Restriction!" + "You are very physically gifted")), false);
					{
						String _setval = "Physically Gifted";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RestrictedType = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (random >= 2) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos(x, y, z);
						NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return Component.literal("CustomCTGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new CustomCTGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		}
	}
}
