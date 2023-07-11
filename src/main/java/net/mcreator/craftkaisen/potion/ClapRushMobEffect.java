
package net.mcreator.craftkaisen.potion;

public class ClapRushMobEffect extends MobEffect {

	public ClapRushMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.clap_rush";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ClapRushOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
