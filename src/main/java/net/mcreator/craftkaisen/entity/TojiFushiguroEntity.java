
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class TojiFushiguroEntity extends Monster {

	public TojiFushiguroEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftkaisenModEntities.TOJI_FUSHIGURO.get(), world);
	}

	public TojiFushiguroEntity(EntityType<TojiFushiguroEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 4;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(CraftkaisenModItems.INVERTED_SPEAROF_HEAVEN.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftkaisenModItems.TOJI_ARMOR_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CraftkaisenModItems.TOJI_ARMOR_LEGGINGS.get()));

	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, SatoruGojoEntity.class, true, true));
		this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 0.8));
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));
		this.goalSelector.addGoal(7, new RandomSwimmingGoal(this, 1, 40));

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

	@Override
	public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
		ItemStack itemstack = sourceentity.getItemInHand(hand);
		InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());

		super.mobInteract(sourceentity, hand);

		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		Entity entity = this;
		Level world = this.level;

		TojiFushiguroRightClickedOnEntityProcedure.execute(world, x, y, z, sourceentity);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		TojiFushiguroOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	public static void init() {
		SpawnPlacements.register(CraftkaisenModEntities.TOJI_FUSHIGURO.get(), SpawnPlacements.Type.NO_RESTRICTIONS, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 620);
		builder = builder.add(Attributes.ARMOR, 0.4);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 28);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 2);

		return builder;
	}

}
