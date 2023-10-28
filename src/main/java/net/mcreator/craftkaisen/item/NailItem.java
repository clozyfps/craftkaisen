
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NailItem extends Item {

	public NailItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKITEMS).stacksTo(16).rarity(Rarity.COMMON));
	}

}
