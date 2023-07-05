
package net.mcreator.craftkaisen.potion;

public class LapseBlueTemporaryMobEffect extends MobEffect {

	public LapseBlueTemporaryMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.lapse_blue_temporary";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LapseBlueTemporaryOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		LapseBlueTemporaryEffectExpiresProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
