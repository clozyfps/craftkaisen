package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.CustomCTGUIMenu;
import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModGameRules;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

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
		double ctrandom = 0;
		if (world instanceof Level _level)
			_level.getGameRules().getRule(CraftkaisenModGameRules.CK_ALLOW_CUSTOM_TECHNIQUES).set(false, _level.getServer());
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).JoinsWorld == false) {
			{
				boolean _setval = true;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.JoinsWorld = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			random = Mth.nextInt(RandomSource.create(), 1, 100);
			ctrandom = Mth.nextInt(RandomSource.create(), 1, 7);
			restrictionrandom = Mth.nextInt(RandomSource.create(), 1, 2);
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
				} else if (restrictionrandom == 2) {
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
				if (world.getLevelData().getGameRules().getBoolean(CraftkaisenModGameRules.CK_ALLOW_CUSTOM_TECHNIQUES)) {
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
				} else {
					if (ctrandom == 1) {
						SetLimitlessProcedure.execute(entity);
						{
							double _setval = 7;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 2) {
						SetCursedSpeechProcedure.execute(entity);
						{
							double _setval = 6;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 3) {
						SetFlamesProcedure.execute(entity);
						{
							double _setval = 6;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 4) {
						SetSukunaProcedure.execute(entity);
						{
							double _setval = 6;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 5) {
						SetTransfigurationProcedure.execute(entity);
						{
							double _setval = 5;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 6) {
						SetPlantsProcedure.execute(entity);
						{
							double _setval = 4;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (ctrandom == 7) {
						SetClapProcedure.execute(entity);
						{
							double _setval = 5;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.UnlockedMoves = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
