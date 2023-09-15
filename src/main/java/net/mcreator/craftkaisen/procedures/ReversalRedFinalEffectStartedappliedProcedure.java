package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.init.CraftkaisenModParticleTypes;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class ReversalRedFinalEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide()) {
			if (entity instanceof AbstractClientPlayer player) {
				var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftkaisen", "player_animation"));
				if (animation != null && !animation.isActive()) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftkaisen", "reversalred"))));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftkaisenModParticleTypes.REVERSAL_RED_PARTICLE.get()), x, y, z, 1, 0.01, 3, 0.01, 0);
	}
}
