package com.github.trhod177.magiceightball;

import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemInit {
	
    @ObjectHolder("magiceightcube:magiceightcube")
    public static MagicEightCube magiceightcube;
    @ObjectHolder("magiceightcube:custommagiceightcube")
    public static CustomMagicEightCube custommagiceightcube;
    
    @SideOnly(Side.CLIENT)
    public static void initModels() {
       magiceightcube.initModel();
       custommagiceightcube.initModel();
    }

}
