
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class EsoEntity extends Monster {

	public EsoEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftkaisenModEntities.ESO.get(), world);
	}

	public EsoEntity(EntityType<EsoEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 3;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftkaisenModItems.ESO_ARMOR_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CraftkaisenModItems.ESO_ARMOR_LEGGINGS.get()));

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, SatoruGojoEntity.class, true, true));
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, ItadoriEntity.class, true, true));
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.5, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 1));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public double getMyRidingOffset() {
		return -0.35D;
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
		SpawnPlacements.register(CraftkaisenModEntities.ESO.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 240);
		builder = builder.add(Attributes.ARMOR, 0.2);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 16);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);

		return builder;
	}

}
