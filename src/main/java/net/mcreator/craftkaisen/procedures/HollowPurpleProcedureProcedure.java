package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class HollowPurpleProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy >= entity.getPersistentData().getDouble("chargeTime") * 10) {
			entity.getPersistentData().putDouble("hollowPurple", 35);
			entity.getPersistentData().putDouble("hollowDistance", 0);
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craftkaisen", "player_animation"));
					if (animation != null && !animation.isActive()) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craftkaisen", "hollowpurple"))));
					}
				}
			}
			{
				double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergy - entity.getPersistentData().getDouble("chargeTime") * 10;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.CursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Not enough cursed energy."), true);
		}
	}
}
