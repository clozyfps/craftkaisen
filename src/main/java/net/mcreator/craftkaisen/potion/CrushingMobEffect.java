
package net.mcreator.craftkaisen.potion;

public class CrushingMobEffect extends MobEffect {

	public CrushingMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.crushing";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CrushingOnEffectActiveTickProcedure.execute(

		);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CrushingEffectExpiresProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
