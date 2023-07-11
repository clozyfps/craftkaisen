
package net.mcreator.craftkaisen.potion;

public class ToughBodyMobEffect extends MobEffect {

	public ToughBodyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.tough_body";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ToughBodyOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
