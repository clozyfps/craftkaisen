
package net.mcreator.craftkaisen.potion;

public class RootsPotionMobEffect extends MobEffect {

	public RootsPotionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.roots_potion";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RootsPotionOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
