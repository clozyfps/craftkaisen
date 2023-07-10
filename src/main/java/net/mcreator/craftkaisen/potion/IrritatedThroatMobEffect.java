
package net.mcreator.craftkaisen.potion;

public class IrritatedThroatMobEffect extends MobEffect {

	public IrritatedThroatMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.irritated_throat";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		IrritatedThroatOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
