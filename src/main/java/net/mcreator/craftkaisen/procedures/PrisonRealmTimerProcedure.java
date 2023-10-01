package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftkaisenModItems;
import net.mcreator.craftkaisen.init.CraftkaisenModBlocks;
import net.mcreator.craftkaisen.entity.PrisonRealmMobEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class PrisonRealmTimerProcedure {
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
		if (entity.getPersistentData().getBoolean("beginTimerPr")) {
			if (entity.getPersistentData().getDouble("timerPrison") > 0) {
				entity.getPersistentData().putDouble("timerPrison", (entity.getPersistentData().getDouble("timerPrison") - 1));
			} else if (entity.getPersistentData().getDouble("timerPrison") == 0) {
				if (((Entity) world.getEntitiesOfClass(PrisonRealmMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 6, 6, 6), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof PrisonRealmMobEntity) {
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(CraftkaisenModItems.PRISON_REALM_ARMOR_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftkaisenModItems.PRISON_REALM_ARMOR_CHESTPLATE.get()));
						}
					}
				} else {
					if (!((Entity) world.getEntitiesOfClass(PrisonRealmMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
						((Entity) world.getEntitiesOfClass(PrisonRealmMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 200, 200, 200), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
					world.setBlock(new BlockPos(entity.getPersistentData().getDouble("prX"), entity.getPersistentData().getDouble("prY"), entity.getPersistentData().getDouble("prZ")), CraftkaisenModBlocks.PRISON_REALM.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
