package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StarPlasmaVesselTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Quest)
				.equals("Escort The Star Plasma Vessel To - " + "X: " + entity.getPersistentData().getDouble("vesselx") + " Z: " + entity.getPersistentData().getDouble("vesselz"))) {
			if (Math.round(entity.getX()) == entity.getPersistentData().getDouble("vesselx") && Math.round(entity.getZ()) == entity.getPersistentData().getDouble("vesselz")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof RikoAmanaiEntity) {
							if (!entityiterator.level.isClientSide())
								entityiterator.discard();
							{
								String _setval = "";
								entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Quest = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								String _setval = "Grade 1";
								entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Grade = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof ServerPlayer _player) {
								Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:grade_1"));
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									Iterator _iterator = _ap.getRemainingCriteria().iterator();
									while (_iterator.hasNext())
										_player.getAdvancements().award(_adv, (String) _iterator.next());
								}
							}
							{
								boolean _setval = false;
								entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DoingQuest = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7a Congratulations! You ranked up to a Grade 1 Sorcerer!"), false);
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("The Star Plasma Vessel is not in range!"), true);
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("bagtimer") == 0) {
				if (!entity.getPersistentData().getBoolean("bagtimerdone")) {
					entity.getPersistentData().putDouble("bagtimer", 1000);
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BagMaskManEntity(CraftkaisenModEntities.BAG_MASK_MAN.get(), _level);
						entityToSpawn.moveTo(x, y, z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("A mysterious man has approached you!"), false);
					CraftkaisenMod.queueServerWork(1, () -> {
						if (((Entity) world.getEntitiesOfClass(BagMaskManEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entity instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					});
				}
			} else {
				entity.getPersistentData().putDouble("bagtimer", (entity.getPersistentData().getDouble("bagtimer") - 1));
				entity.getPersistentData().putBoolean("timerdone", true);
			}
		}
	}
}
