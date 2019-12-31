package com.github.trhod177.magiceightball;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
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

public class MagicEightCube extends Item {
	
	 public MagicEightCube() {
	        setRegistryName("magiceightcube");
	        setUnlocalizedName(MagicEightBall.MODID + ".magiceightcube");  
	        setCreativeTab(CreativeTabs.MISC);
	        
	    }
	 
	    @SideOnly(Side.CLIENT)
	    public void initModel() {
	        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	    }
	    
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		if(!worldIn.isRemote) {
			
		} else {
		 String[] wordList = {I18n.format("text.eightball.message1"),I18n.format("text.eightball.message2"),I18n.format("text.eightball.message3"),I18n.format("text.eightball.message4"),I18n.format("text.eightball.message5"),I18n.format("text.eightball.message6"),I18n.format("text.eightball.message7"),I18n.format("text.eightball.message8"),I18n.format("text.eightball.message9"),I18n.format("text.eightball.message10"),I18n.format("text.eightball.message1"),I18n.format("text.eightball.message11"),I18n.format("text.eightball.message12"),I18n.format("text.eightball.message13"),I18n.format("text.eightball.message14"),I18n.format("text.eightball.message15"),I18n.format("text.eightball.message16"),I18n.format("text.eightball.message17"),I18n.format("text.eightball.message18"), I18n.format("text.eightball.message19"),};
	        int oneLength = wordList.length;
	        int rand1 = (int) (Math.random() * oneLength);
	        String phrase = wordList[rand1];
	        //System.out.println (phrase);
		    playerIn.sendMessage(new TextComponentString(phrase));
		     
		
	}
		return super.onItemRightClick(worldIn, playerIn, handIn);
	}
}
