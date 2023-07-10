
package net.mcreator.craftkaisen.potion;

public class SleepingMobEffect extends MobEffect {

	public SleepingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.sleeping";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		SleepingOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
