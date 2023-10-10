package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Checkbox;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;

import java.util.HashMap;

public class TeachniqueCreatePressedProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		if (guistate.containsKey("checkbox:OrbBox") ? ((Checkbox) guistate.get("checkbox:OrbBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (guistate.containsKey("checkbox:ExplosionBox") ? ((Checkbox) guistate.get("checkbox:ExplosionBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (guistate.containsKey("checkbox:PulseBox") ? ((Checkbox) guistate.get("checkbox:PulseBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (guistate.containsKey("checkbox:AreaBox") ? ((Checkbox) guistate.get("checkbox:AreaBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (guistate.containsKey("checkbox:BoltBox") ? ((Checkbox) guistate.get("checkbox:BoltBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (guistate.containsKey("checkbox:BeamBox") ? ((Checkbox) guistate.get("checkbox:BeamBox")).selected() : false) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
			entity.getPersistentData().putDouble("boxesChecked", (entity.getPersistentData().getDouble("boxesChecked") + 1));
		}
		if (!(guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "").isEmpty()
				&& (guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "").length() <= 20) {
			entity.getPersistentData().putDouble("progressTech", (entity.getPersistentData().getDouble("progressTech") + 1));
		} else if ((guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "").isEmpty()) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
				}
			}
		} else if ((guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "").length() > 20) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
				}
			}
		}
		if (entity.getPersistentData().getDouble("progressTech") == 2 && entity.getPersistentData().getDouble("boxesChecked") == 1
				&& (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Yen >= entity.getPersistentData().getDouble("cost")) {
			if (((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move1Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", true);
				entity.getPersistentData().putBoolean("move2", false);
				entity.getPersistentData().putBoolean("move3", false);
				entity.getPersistentData().putBoolean("move4", false);
				entity.getPersistentData().putBoolean("move5", false);
				entity.getPersistentData().putBoolean("move6", false);
			} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Name).equals("\"\"")
					&& ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move2Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", false);
				entity.getPersistentData().putBoolean("move2", true);
				entity.getPersistentData().putBoolean("move3", false);
				entity.getPersistentData().putBoolean("move4", false);
				entity.getPersistentData().putBoolean("move5", false);
				entity.getPersistentData().putBoolean("move6", false);
			} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Name).equals("\"\"")
					&& ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move3Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", false);
				entity.getPersistentData().putBoolean("move2", false);
				entity.getPersistentData().putBoolean("move3", true);
				entity.getPersistentData().putBoolean("move4", false);
				entity.getPersistentData().putBoolean("move5", false);
				entity.getPersistentData().putBoolean("move6", false);
			} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Name).equals("\"\"")
					&& ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move4Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", false);
				entity.getPersistentData().putBoolean("move2", false);
				entity.getPersistentData().putBoolean("move3", false);
				entity.getPersistentData().putBoolean("move4", true);
				entity.getPersistentData().putBoolean("move5", false);
				entity.getPersistentData().putBoolean("move6", false);
			} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Name).equals("\"\"")
					&& ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move5Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", false);
				entity.getPersistentData().putBoolean("move2", false);
				entity.getPersistentData().putBoolean("move3", false);
				entity.getPersistentData().putBoolean("move4", false);
				entity.getPersistentData().putBoolean("move5", true);
				entity.getPersistentData().putBoolean("move6", false);
			} else if (!((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Name).equals("\"\"")
					&& ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Name).equals("\"\"")) {
				{
					String _setval = guistate.containsKey("text:TechniqueName") ? ((EditBox) guistate.get("text:TechniqueName")).getValue() : "";
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Move6Name = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				entity.getPersistentData().putBoolean("move1", false);
				entity.getPersistentData().putBoolean("move2", false);
				entity.getPersistentData().putBoolean("move3", false);
				entity.getPersistentData().putBoolean("move4", false);
				entity.getPersistentData().putBoolean("move5", false);
				entity.getPersistentData().putBoolean("move6", true);
			}
			if (guistate.containsKey("checkbox:OrbBox") ? ((Checkbox) guistate.get("checkbox:OrbBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Orb";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (guistate.containsKey("checkbox:ExplosionBox") ? ((Checkbox) guistate.get("checkbox:ExplosionBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Explosion";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (guistate.containsKey("checkbox:PulseBox") ? ((Checkbox) guistate.get("checkbox:PulseBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Pulse";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (guistate.containsKey("checkbox:AreaBox") ? ((Checkbox) guistate.get("checkbox:AreaBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Area";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (guistate.containsKey("checkbox:BoltBox") ? ((Checkbox) guistate.get("checkbox:BoltBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Bolt";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (guistate.containsKey("checkbox:BeamBox") ? ((Checkbox) guistate.get("checkbox:BeamBox")).selected() : false) {
				if (entity.getPersistentData().getBoolean("move1")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move1Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move2")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move2Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move3")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move3Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move4")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move4Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move5")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move5Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (entity.getPersistentData().getBoolean("move6")) {
					{
						String _setval = "Touch";
						entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Move6Type = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
			if (guistate.containsKey("checkbox:ImbueTechnique") ? ((Checkbox) guistate.get("checkbox:ImbueTechnique")).selected() : false) {
				if (guistate.containsKey("checkbox:ReverseEffect") ? ((Checkbox) guistate.get("checkbox:ReverseEffect")).selected() : false) {
					if (entity.getPersistentData().getBoolean("move1")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move1Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move1Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move2")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move2Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move2Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move3")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move3Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move3Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move4")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move4Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move4Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move5")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move5Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move5Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move6")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move6Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move6Reverse = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else {
					if (entity.getPersistentData().getBoolean("move1")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move1Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move2")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move2Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move3")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move3Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move4")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move4Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move5")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move5Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getBoolean("move6")) {
						{
							boolean _setval = true;
							entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Move6Imbue = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).UnlockedMoves + 1;
				entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.UnlockedMoves = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity.getPersistentData().getBoolean("move1")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move1Name + " Created!")), false);
			} else if (entity.getPersistentData().getBoolean("move2")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move2Name + " Created!")), false);
			} else if (entity.getPersistentData().getBoolean("move3")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move3Name + " Created!")), false);
			} else if (entity.getPersistentData().getBoolean("move4")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move4Name + " Created!")), false);
			} else if (entity.getPersistentData().getBoolean("move5")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move5Name + " Created!")), false);
			} else if (entity.getPersistentData().getBoolean("move6")) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Technique + " Technique : "
							+ (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Move6Name + " Created!")), false);
			}
		} else if (entity.getPersistentData().getDouble("boxesChecked") != 1) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
				}
			}
		} else if (entity.getPersistentData().getDouble("progressTech") != 2) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
				}
			}
		} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).Yen < entity.getPersistentData().getDouble("cost")) {
			if (entity instanceof Player _player)
				_player.closeContainer();
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "kill @s");
				}
			}
		}
	}
}
