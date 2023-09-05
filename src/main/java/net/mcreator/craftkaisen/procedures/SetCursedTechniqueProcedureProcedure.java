package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

public class SetCursedTechniqueProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity, HashMap cmdparams) {
		if (entity == null || cmdparams == null)
			return;
		if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Limitless") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("limitless")) {
			SetLimitlessProcedure.execute(entity);
			if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselPlayerTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Restricted") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("restricted")) {
			SetHeavenlyProcedure.execute(entity);
			if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselPlayerTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Voice") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("voice")) {
			SetVoiceProcedure.execute(entity);
			if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselPlayerTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Clap") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("clap")) {
			SetClapProcedure.execute(entity);
			if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselPlayerTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if ((cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("Divergent") || (cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "").equals("divergent")) {
			SetDivergentProcedure.execute(entity);
			if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).VesselPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselPlayerTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getDisplayName().getString()).equals(CraftkaisenModVariables.MapVariables.get(world).ReincarnatedPlayer)) {
				{
					String _setval = cmdparams.containsKey("0") ? cmdparams.get("0").toString() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.VesselTechnique = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
