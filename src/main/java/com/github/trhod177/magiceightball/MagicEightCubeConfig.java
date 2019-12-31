package com.github.trhod177.magiceightball;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = MagicEightBall.MODID)
public class MagicEightCubeConfig {
	
	public static String[] customeightballphrases = {
			
			
	};
	
	@SubscribeEvent
	public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(MagicEightBall.MODID)) {
			ConfigManager.sync(MagicEightBall.MODID, Config.Type.INSTANCE);
		}
	}

}
