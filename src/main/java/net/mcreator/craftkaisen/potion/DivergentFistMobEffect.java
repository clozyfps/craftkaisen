
package net.mcreator.craftkaisen.potion;

public class DivergentFistMobEffect extends MobEffect {

	public DivergentFistMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16751002);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.divergent_fist";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DivergentFistOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
