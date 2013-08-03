package holo.serastia.helper;

import net.minecraftforge.common.Configuration;

public class ConfigHelper 
{
	public static int serastiaDimensionID;
	public static int serastiaBiomeID;
	public static boolean keepLoadedSerastia;
	
	public static int dimensionTravelerID;
	public static int grappleHookID;
	

	public static int kelpBlockID;
	
	public static void init(Configuration config)
	{
		serastiaDimensionID = config.get("Dimension", "Dimension ID", 5).getInt();
		serastiaBiomeID = config.get("Dimension", "Biome ID", 50).getInt();
		keepLoadedSerastia = config.get("Dimension", "Keep Loaded", false).getBoolean(false);
		
		initItems(config);
		initBlocks(config);
		initEntities(config);
	}
	
	public static void initItems(Configuration config)
	{
		int itemID = 5500;
		dimensionTravelerID = config.getItem("Dimension Traveler", ++itemID).getInt();
		grappleHookID = config.getItem("Grapple Hook", ++itemID).getInt();
	}
	
	public static void initBlocks(Configuration config)
	{
		int blockID = 3200;
		kelpBlockID = config.getBlock("Kelp", ++blockID).getInt();
	}
	
	public static void initEntities(Configuration config)
	{
		
	}
}
