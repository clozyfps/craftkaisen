
package net.mcreator.craftkaisen.potion;

public class IdleTransfigurationMobEffect extends MobEffect {

	public IdleTransfigurationMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.idle_transfiguration";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		IdleTransfigurationOnEffectActiveTickProcedure.execute(entity.level, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
