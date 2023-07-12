package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.ArrayList;

public class EatCursedFingerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		if (!(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer).isEmpty()
				&& (!CraftkaisenModVariables.MapVariables.get(world).VesselFound || (entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer))) {
			if (!(entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				random = Mth.nextInt(RandomSource.create(), 1, 10);
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
				} else if (random > 9) {
					CraftkaisenModVariables.MapVariables.get(world).VesselFound = true;
					CraftkaisenModVariables.MapVariables.get(world).syncData(world);
					{
						String _setval = CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer;
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Vessel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					CraftkaisenModVariables.MapVariables.get(world).VesselPlayer = entity.getDisplayName().getString();
					CraftkaisenModVariables.MapVariables.get(world).syncData(world);
					CraftkaisenModVariables.MapVariables.get(world).FingersEaten = CraftkaisenModVariables.MapVariables.get(world).FingersEaten + 1;
					CraftkaisenModVariables.MapVariables.get(world).syncData(world);
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if ((entityiterator.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
							{
								String _setval = (entityiterator.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique;
								entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.VesselTechnique = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
					}
				}
			} else {
				CraftkaisenModVariables.MapVariables.get(world).FingersEaten = CraftkaisenModVariables.MapVariables.get(world).FingersEaten + 1;
				CraftkaisenModVariables.MapVariables.get(world).syncData(world);
			}
		}
	}
}
