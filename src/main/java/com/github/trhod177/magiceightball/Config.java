package com.github.trhod177.magiceightball;

import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
	
	public static ForgeConfigSpec.ConfigValue<List<String>> custommessages;
	
	public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
	{
		//server.comment("Oregen Config");
		custommessages = client.comment("Comments for custom magic eight ball").define("custommessages", new ArrayList<>());
		
		
		
	}

}
