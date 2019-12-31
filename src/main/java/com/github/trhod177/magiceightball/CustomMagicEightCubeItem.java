package com.github.trhod177.magiceightball;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

public class CustomMagicEightCubeItem extends Item {

	public CustomMagicEightCubeItem(Properties properties) {
		super(properties);

	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add(new StringTextComponent(I18n.format("text.customeightcube.tooltip")));
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

		if (!worldIn.isRemote) {

		} else {
			List<String> wordList = Config.custommessages.get();
			int oneLength = wordList.size();
			if (oneLength >= 1) {
				int rand1 = (int) (Math.random() * oneLength);
				String phrase = wordList.get(rand1);
				// System.out.println (phrase);
				playerIn.sendMessage(new StringTextComponent(phrase));
			} else {
				playerIn.sendMessage(new StringTextComponent("Error no custom messages"));
			}
		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
