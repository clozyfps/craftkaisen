package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.init.CraftkaisenModGameRules;

public class EatCursedFingerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!world.getLevelData().getGameRules().getBoolean(CraftkaisenModGameRules.CK_CUSTOM_VESSEL)) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Gamerule"), false);
		} else {
			if (!(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer).isEmpty()
					&& (!CraftkaisenModVariables.MapVariables.get(world).VesselFound || (entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer))) {
				if (!(entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
					random = Mth.nextInt(RandomSource.create(), 1, 100);
					if (random <= 9) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
							}
						}
						{
							double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).CursedEnergyCap / 2;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CursedEnergyCap = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (random >= 10) {
						CraftkaisenModVariables.MapVariables.get(world).VesselFound = true;
						CraftkaisenModVariables.MapVariables.get(world).syncData(world);
						{
							String _setval = CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Vessel = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							String _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.VesselPlayerTechnique = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						CraftkaisenModVariables.MapVariables.get(world).VesselPlayer = entity.getDisplayName().getString();
						CraftkaisenModVariables.MapVariables.get(world).syncData(world);
						CraftkaisenModVariables.MapVariables.get(world).FingersEaten = CraftkaisenModVariables.MapVariables.get(world).FingersEaten + 1;
						CraftkaisenModVariables.MapVariables.get(world).syncData(world);
					}
				} else {
					CraftkaisenModVariables.MapVariables.get(world).FingersEaten = CraftkaisenModVariables.MapVariables.get(world).FingersEaten + 1;
					CraftkaisenModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
