package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftkaisenModVariables;
import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.Iterator;

public class UpgradeSkillTreeProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("DefenseChosen")) {
			if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints >= 2 && entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:core_skill_tree"))).isDone() && !(entity instanceof ServerPlayer _plr2
							&& _plr2.level instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_i"))).isDone())) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints - 2;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SkillPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_i"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(24);
				entity.getPersistentData().putBoolean("pressedDefense", true);
				CraftkaisenMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("pressedDefense", false);
				});
			} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints >= 3 && entity instanceof ServerPlayer _plr8
					&& _plr8.level instanceof ServerLevel && _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_i"))).isDone() && !(entity instanceof ServerPlayer _plr9
							&& _plr9.level instanceof ServerLevel && _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_ii"))).isDone())) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints - 3;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SkillPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_ii"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(28);
				entity.getPersistentData().putBoolean("pressedDefense", true);
				CraftkaisenMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("pressedDefense", false);
				});
			} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints >= 4 && entity instanceof ServerPlayer _plr15
					&& _plr15.level instanceof ServerLevel && _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_ii"))).isDone()
					&& !(entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
							&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iii"))).isDone())) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints - 4;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SkillPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iii"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(32);
				entity.getPersistentData().putBoolean("pressedDefense", true);
				CraftkaisenMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("pressedDefense", false);
				});
			} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints >= 5 && entity instanceof ServerPlayer _plr22
					&& _plr22.level instanceof ServerLevel && _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iii"))).isDone()
					&& !(entity instanceof ServerPlayer _plr23 && _plr23.level instanceof ServerLevel
							&& _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iv"))).isDone())) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints - 5;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SkillPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iv"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(36);
				entity.getPersistentData().putBoolean("pressedDefense", true);
				CraftkaisenMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("pressedDefense", false);
				});
			} else if ((entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints >= 6 && entity instanceof ServerPlayer _plr29
					&& _plr29.level instanceof ServerLevel && _plr29.getAdvancements().getOrStartProgress(_plr29.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iv"))).isDone()
					&& !(entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
							&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"))).isDone())) {
				{
					double _setval = (entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftkaisenModVariables.PlayerVariables())).SkillPoints - 6;
					entity.getCapability(CraftkaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.SkillPoints = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(40);
				entity.getPersistentData().putBoolean("pressedDefense", true);
				CraftkaisenMod.queueServerWork(10, () -> {
					entity.getPersistentData().putBoolean("pressedDefense", false);
				});
			} else if (entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
					&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"))).isDone()) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You have already completed this skill tree!"), true);
			}
		}
	}
}
