
package net.mcreator.craftkaisen.potion;

public class PhysicallyGiftedCooldownMobEffect extends MobEffect {

	public PhysicallyGiftedCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.physically_gifted_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
