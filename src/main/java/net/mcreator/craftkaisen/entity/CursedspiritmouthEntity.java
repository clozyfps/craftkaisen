
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class CursedspiritmouthEntity extends Monster {

	public CursedspiritmouthEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), world);
	}

	public CursedspiritmouthEntity(EntityType<CursedspiritmouthEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(3, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(5, new FloatGoal(this));
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, JujutsuStudentEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SatoruGojoEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, TojiFushiguroEntity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MegumiFushiguroEntity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, ItadoriEntity.class, true, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, UltimateMechamaruEntity.class, true, true));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	public static void init() {
		SpawnPlacements.register(CraftkaisenModEntities.CURSEDSPIRITMOUTH.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 130);
		builder = builder.add(Attributes.ARMOR, 0.15);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 16);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);

		return builder;
	}

}
