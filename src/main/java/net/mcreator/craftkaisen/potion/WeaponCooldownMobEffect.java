
package net.mcreator.craftkaisen.potion;

public class WeaponCooldownMobEffect extends MobEffect {

	public WeaponCooldownMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craftkaisen.weapon_cooldown";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
