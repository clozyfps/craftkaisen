
package net.mcreator.craftkaisen.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.procedures.PrisonRealmBoxRightclickedOnBlockProcedure;
import net.mcreator.craftkaisen.init.CraftkaisenModTabs;

import java.util.List;

public class PrisonRealmBoxItem extends Item {
	public PrisonRealmBoxItem() {
		super(new Item.Properties().tab(CraftkaisenModTabs.TAB_JJKMOBS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Right Click On The Ground To Place It"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PrisonRealmBoxRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
