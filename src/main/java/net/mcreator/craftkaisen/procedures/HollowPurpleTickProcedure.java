package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Direction;

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class HollowPurpleTickProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("hollowPurple") >= 0) {
			entity.getPersistentData().putDouble("hollowPurple", (entity.getPersistentData().getDouble("hollowPurple") - 1));
			entity.getPersistentData().putDouble("hollowDistance", (entity.getPersistentData().getDouble("hollowDistance") + 0.12857143));
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.PURPLE_LIGHTNING.get()), x, y, z, 1, 1.5, 1, 1.5, 1);
			if (entity.getPersistentData().getDouble("hollowPurple") >= 1) {
				if ((entity.getDirection()) == Direction.EAST) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.WEST) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = x + xx;
										double posY = (y + 0.5) + yy;
										double posZ = (z - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.NORTH) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				} else if ((entity.getDirection()) == Direction.SOUTH) {
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x + 4.5 - entity.getPersistentData().getDouble("hollowDistance")) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.RED_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
					{
						// Get the radius of the sphere
						double radius = (entity.getPersistentData().getDouble("purpleCharge") * 0.01); // 3 blocks
						// Set the tolerance for how close to the surface a point must be to create a particle
						double tolerance = 0.15; // 0.1 blocks
						for (double xx = -radius; xx <= radius; xx += 0.1) {
							for (double yy = -radius; yy <= radius; yy += 0.1) {
								for (double zz = -radius; zz <= radius; zz += 0.1) {
									if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
										// Calculate the position of the particle
										double posX = (x - (4.5 - entity.getPersistentData().getDouble("hollowDistance"))) + xx;
										double posY = (y + 0.5) + yy;
										double posZ = z + zz;
										if (true) {
											if (world instanceof ServerLevel)
												((ServerLevel) world).sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
										} else {
											world.addParticle((SimpleParticleType) (CraftkaisenModParticleTypes.BLUE_MIST.get()), posX, posY, posZ, 0, 0, 0);
										}
									}
								}
							}
						}
					}
				}
			}
			if (entity.getPersistentData().getDouble("hollowPurple") == 1) {
				entity.getPersistentData().putDouble("purpleDistance", 0);
				entity.getPersistentData().putBoolean("purple", true);
			}
		}
	}
}
