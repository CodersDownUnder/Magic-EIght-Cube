package com.github.trhod177.magiceightball;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class MECConfig {
	
	private static final ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SERVER;
	
	private static final ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec CLIENT;
	
	
	
	
	
	static
	{
		Config.init(SERVER_BUILDER, CLIENT_BUILDER);
		
		SERVER = SERVER_BUILDER.build();
		CLIENT = CLIENT_BUILDER.build();
		
		
	}
	
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		file.load();
		config.setConfig(file);
	}

}
