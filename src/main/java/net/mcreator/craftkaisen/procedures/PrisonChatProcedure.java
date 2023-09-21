package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftkaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftkaisenModItems;
import net.mcreator.craftkaisen.init.CraftkaisenModEntities;
import net.mcreator.craftkaisen.entity.PrisonBoxMobEntity;
import net.mcreator.craftkaisen.CraftkaisenMod;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class PrisonChatProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent.Submitted event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PRISON_BOX_READY_NEW.get()) : false) {
			if (text.startsWith("Gate Open") || text.startsWith("gate Open") || text.startsWith("Gate open") || text.startsWith("gate open")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entity == entityiterator)) {
							if (entityiterator instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PRISON_BOX_AFFECT.get()) : false) {
								if (!(entityiterator instanceof PrisonBoxMobEntity)) {
									if (entityiterator instanceof LivingEntity _entity)
										_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_AFFECT.get());
									if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
										_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PRISON_BOX_EFFECT.get(), 1000, 1, true, false));
								}
							}
						}
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_READY_NEW.get());
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftkaisenModMobEffects.PRISON_BOX_READY_FINAL.get(), 900, 1, true, false));
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Prison Box Ready, Say \"Gate Close\""), true);
				if (!((Entity) world.getEntitiesOfClass(PrisonBoxMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
					((Entity) world.getEntitiesOfClass(PrisonBoxMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
			}
		} else if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(CraftkaisenModMobEffects.PRISON_BOX_READY_FINAL.get()) : false) {
			if (text.startsWith("Gate Close") || text.startsWith("gate Close") || text.startsWith("Gate close") || text.startsWith("gate close")) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CraftkaisenModItems.PRISON_REALM_ARMOR_CHESTPLATE.get()) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new PrisonBoxMobEntity(CraftkaisenModEntities.PRISON_BOX_MOB.get(), _level);
								entityToSpawn.moveTo((entityiterator.getX()), (entityiterator.getY() + 2), (entityiterator.getZ()), 0, 0);
								entityToSpawn.setYBodyRot(0);
								entityToSpawn.setYHeadRot(0);
								entityToSpawn.setDeltaMovement(0, 0, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
							CraftkaisenMod.queueServerWork(10, () -> {
								((Entity) world.getEntitiesOfClass(PrisonBoxMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 15, 15, 15), e -> true).stream().sorted(new Object() {
									Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
										return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
									}
								}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(Component.literal((entityiterator.getDisplayName().getString() + " Sealed In Prison Box")));
								if (entityiterator instanceof ServerPlayer _player && !_player.level.isClientSide()) {
									ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("craftkaisen:prison_realm"));
									if (_player.level.dimension() == destinationType)
										return;
									ServerLevel nextLevel = _player.server.getLevel(destinationType);
									if (nextLevel != null) {
										_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
										_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
										_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
										for (MobEffectInstance _effectinstance : _player.getActiveEffects())
											_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
										_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
									}
								}
								{
									Entity _entity = entityiterator;
									if (_entity instanceof Player _player) {
										_player.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
										_player.getInventory().setChanged();
									} else if (_entity instanceof LivingEntity _living) {
										_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
									}
								}
								if (entityiterator instanceof LivingEntity _entity)
									_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_EFFECT.get());
								entityiterator.getPersistentData().putBoolean("prisonrealmsealed", true);
							});
							entityiterator.getPersistentData().putBoolean("prisonrealmsealed", true);
							if (entityiterator instanceof LivingEntity _entity)
								_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_EFFECT.get());
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("Sealed " + entityiterator.getDisplayName().getString())), true);
						}
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftkaisenModMobEffects.PRISON_BOX_READY_FINAL.get());
			}
		}
	}
}
