
package net.mcreator.craftkaisen.potion;

public class InfinityMobEffect extends MobEffect {

	public InfinityMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.infinity";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
