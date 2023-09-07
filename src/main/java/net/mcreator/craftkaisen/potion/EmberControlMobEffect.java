
package net.mcreator.craftkaisen.potion;

public class EmberControlMobEffect extends MobEffect {

	public EmberControlMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.ember_control";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EmberControlOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
