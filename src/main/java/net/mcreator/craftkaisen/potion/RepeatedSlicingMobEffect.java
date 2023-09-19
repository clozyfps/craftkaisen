
package net.mcreator.craftkaisen.potion;

public class RepeatedSlicingMobEffect extends MobEffect {

	public RepeatedSlicingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.repeated_slicing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RepeatedSlicingOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
