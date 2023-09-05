
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftkaisenModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> CK_OVERWRITE_INUMAKI_CHAT = GameRules.register("ckOverwriteInumakiChat", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> CK_PROGRESSIVE_PRESTIGE_DIFFICULTY = GameRules.register("ckProgressivePrestigeDifficulty", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> CK_CUSTOM_VESSEL = GameRules.register("ckCustomVessel", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
}
