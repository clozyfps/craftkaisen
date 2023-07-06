
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CraftkaisenModTabs {
	public static CreativeModeTab TAB_JJKARMOR;
	public static CreativeModeTab TAB_JJKMOBS;

	public static void load() {
		TAB_JJKARMOR = new CreativeModeTab("tabjjkarmor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CraftkaisenModItems.JUJUTSU_SORCERER_OUTFIT_CHESTPLATE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_JJKMOBS = new CreativeModeTab("tabjjkmobs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CraftkaisenModItems.JUJUTSU_STUDENT_SPAWN_EGG.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
