
package net.mcreator.craftkaisen.potion;

public class TwistingMobEffect extends MobEffect {

	public TwistingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.twisting";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TwistingOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
