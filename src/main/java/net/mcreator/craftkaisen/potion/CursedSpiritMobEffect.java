
package net.mcreator.craftkaisen.potion;

public class CursedSpiritMobEffect extends MobEffect {

	public CursedSpiritMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.cursed_spirit";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
