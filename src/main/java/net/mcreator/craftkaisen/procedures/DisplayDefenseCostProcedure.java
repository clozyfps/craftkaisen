package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DisplayDefenseCostProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		double v = 0;
		String end = "";
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:core_skill_tree"))).isDone()
				&& !(entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_i"))).isDone())) {
			v = 2;
		} else if (entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_i"))).isDone()
				&& !(entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel && _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_ii"))).isDone())) {
			v = 3;
		} else if (entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_ii"))).isDone()
				&& !(entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel && _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iii"))).isDone())) {
			v = 4;
		} else if (entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel && _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iii"))).isDone()
				&& !(entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel && _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iv"))).isDone())) {
			v = 5;
		} else if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel && _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_iv"))).isDone()
				&& !(entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel && _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"))).isDone())) {
			v = 6;
		}
		if (!(entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel && _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"))).isDone())) {
			end = "Cost : " + new java.text.DecimalFormat("#").format(v);
		} else if (entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel && _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("craftkaisen:defense_v"))).isDone()) {
			end = "Completed!";
		}
		return end;
	}
}
