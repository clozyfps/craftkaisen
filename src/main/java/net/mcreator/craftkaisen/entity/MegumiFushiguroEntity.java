
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class MegumiFushiguroEntity extends Monster {

	public MegumiFushiguroEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftkaisenModEntities.MEGUMI_FUSHIGURO.get(), world);
	}

	public MegumiFushiguroEntity(EntityType<MegumiFushiguroEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);

		this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(CraftkaisenModItems.HIAR_HELMET.get()));
		this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftkaisenModItems.JUJUTSU_SORCERER_OUTFIT_CHESTPLATE.get()));
		this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(CraftkaisenModItems.JUJUTSU_SORCERER_OUTFIT_LEGGINGS.get()));

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
		this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CursedspiritgrasshopperEntity.class, true, true));
		this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, CursedspiritroppongiEntity.class, true, true));
		this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CursedspiritrugbyfieldEntity.class, true, true));
		this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, FingerBearerEntity.class, true, true));
		this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, FlyHeadEntity.class, true, true));
		this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, InventoryCurseEntity.class, true, true));
		this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, JogoEntity.class, true, true));
		this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, SukunaEntity.class, true, true));
		this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, EsoEntity.class, true, true));

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
		SpawnPlacements.register(CraftkaisenModEntities.MEGUMI_FUSHIGURO.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
				(entityType, world, reason, pos, random) -> (world.getDifficulty() != Difficulty.PEACEFUL && Monster.isDarkEnoughToSpawn(world, pos, random) && Mob.checkMobSpawnRules(entityType, world, reason, pos, random)));

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 310);
		builder = builder.add(Attributes.ARMOR, 0.1);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 17);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.1);

		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1);

		return builder;
	}

}
