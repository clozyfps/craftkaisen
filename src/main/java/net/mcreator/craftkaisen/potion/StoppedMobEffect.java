
package net.mcreator.craftkaisen.potion;

public class StoppedMobEffect extends MobEffect {

	public StoppedMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.stopped";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		StoppedOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
