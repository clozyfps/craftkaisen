
package net.mcreator.craftkaisen.potion;

public class HollowPurpleTemporaryMobEffect extends MobEffect {

	public HollowPurpleTemporaryMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.hollow_purple_temporary";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HollowPurpleTemporaryOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HollowPurpleTemporaryEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
