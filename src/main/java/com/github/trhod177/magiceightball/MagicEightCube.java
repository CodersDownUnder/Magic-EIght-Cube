package com.github.trhod177.magiceightball;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.config.ModConfig;;

@Mod(MagicEightCube.MODID)
public class MagicEightCube
{
	public static MagicEightCube instance;
    public static final String MODID = "magiceightcube";
    public static final Logger logger = LogManager.getLogger(MODID);
    

    public MagicEightCube() {
    	
    	instance = this;
        
    	//ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, MECConfig.SERVER, "magiceightcube-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MECConfig.CLIENT, "magiceightcube-client.toml");
    	
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        MECConfig.loadConfig(MECConfig.CLIENT, FMLPaths.CONFIGDIR.get().resolve("magiceightcube-client.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
       
    }

    private void processIMC(final InterModProcessEvent event)
    {
   
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
    	
    	public static Item magiceightcube;
    	public static Item custommagiceightcube;
    	@SubscribeEvent
    	public static void registerItems(final RegistryEvent.Register<Item> event) {
    		
    		event.getRegistry().registerAll(
    		magiceightcube = new MagicEightBallItem(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("magiceightcube")),
    		custommagiceightcube = new CustomMagicEightCubeItem(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("custommagiceightcube"))
    				);
    		
    		//logger.info("Items are registered BB889911");
    		}
       
    	private static ResourceLocation location(String name) {
			
    		return new ResourceLocation(MagicEightCube.MODID, name);
    	}
    }
    
    
}
