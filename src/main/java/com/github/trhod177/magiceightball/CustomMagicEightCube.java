package com.github.trhod177.magiceightball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CustomMagicEightCube extends Item {

	public CustomMagicEightCube() {
		setRegistryName("custommagiceightcube");
		setUnlocalizedName(MagicEightBall.MODID + ".custommagiceightcube");
		setCreativeTab(CreativeTabs.MISC);

	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {

		tooltip.add(I18n.format("text.customeightcube.tooltip"));
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		if (!worldIn.isRemote) {

		} else {
			List<String> wordList = new ArrayList<String>(Arrays.asList(MagicEightCubeConfig.customeightballphrases));
			if (wordList.size() >= 1) {
				int oneLength = wordList.size();
				int rand1 = (int) (Math.random() * oneLength);
				String phrase = wordList.get(rand1);
				// System.out.println (phrase);
				playerIn.sendMessage(new TextComponentString(phrase));
			} else {
				playerIn.sendMessage(new TextComponentString("Error no custom messages"));
			}

		}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}

}
