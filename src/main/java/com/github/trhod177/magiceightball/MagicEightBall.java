package com.github.trhod177.magiceightball;

import com.github.trhod177.magiceightball.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = MagicEightBall.MODID, version = MagicEightBall.VERSION, name = MagicEightBall.NAME)
public class MagicEightBall
{
    public static final String MODID = "magiceightcube";
    public static final String VERSION = "1.1.1";
    public static final String NAME = "Magic Eight Cube";
    
    @Mod.Instance
    public static MagicEightBall instance;
    
    @SidedProxy(clientSide = "com.github.trhod177.magiceightball.ClientProxy", serverSide = "com.github.trhod177.magiceightball.ServerProxy")
    public static CommonProxy proxy;
    
    
	   @Mod.EventHandler
	    public void preInit(FMLPreInitializationEvent event) {
	        proxy.preInit(event);
	    }

	    @Mod.EventHandler
	    public void init(FMLInitializationEvent e) {
	        proxy.init(e);
	    }

	    @Mod.EventHandler
	    public void postInit(FMLPostInitializationEvent e) {
	        proxy.postInit(e);
	    }
	    
}
