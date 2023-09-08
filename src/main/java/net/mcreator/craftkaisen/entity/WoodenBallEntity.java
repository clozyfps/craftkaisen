
package net.mcreator.craftkaisen.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class WoodenBallEntity extends AbstractArrow implements ItemSupplier {
	public WoodenBallEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(CraftkaisenModEntities.WOODEN_BALL.get(), world);
	}

	public WoodenBallEntity(EntityType<? extends WoodenBallEntity> type, Level world) {
		super(type, world);
	}

	public WoodenBallEntity(EntityType<? extends WoodenBallEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public WoodenBallEntity(EntityType<? extends WoodenBallEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.AIR);
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		WoodenBallProjectileHitsLivingEntityProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		WoodenBallProjectileHitsBlockProcedure.execute();
	}

	@Override
	public void tick() {
		super.tick();
		WoodenBallWhileProjectileFlyingTickProcedure.execute();
		if (this.inGround)
			this.discard();
	}

	public static WoodenBallEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		WoodenBallEntity entityarrow = new WoodenBallEntity(CraftkaisenModEntities.WOODEN_BALL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static WoodenBallEntity shoot(LivingEntity entity, LivingEntity target) {
		WoodenBallEntity entityarrow = new WoodenBallEntity(CraftkaisenModEntities.WOODEN_BALL.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 3f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(7);
		entityarrow.setKnockback(3);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
