
package net.mcreator.craftkaisen.potion;

public class EmberFloorMobEffect extends MobEffect {

	public EmberFloorMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.ember_floor";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EmberFloorOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
