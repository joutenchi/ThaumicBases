package tb.utils;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.common.config.Configuration;
import DummyCore.Utils.IDummyConfig;

public class TBConfig implements IDummyConfig{
	
	static Configuration cfg;
	
	public static int elderKnowledgeID;
	public static int eldritchBaneID;
	public static int magicTouchID;
	public static int taintedID;
	public static int vaporisingID;
	
	public static int aquaticFociUID;
	public static int nethericFociUID;
	public static int decomposingFociUID;
	public static int vaporisingFociUID;
	public static int calmingFociUID;
	public static int crystalizationFociUID;
	public static int warpingFociUID;
	
	public static boolean allowTobacco;
	public static boolean enableTTCompathability;
	public static int shardsFromOre;
	public static boolean brightFociRequiresPrimordialPearl;
	public static boolean enableRevolver;
	public static boolean enableNodeTools;
	public static boolean enableBracelets;
	public static boolean enableFlora;
	public static boolean enableBloodyMess;
	//public static boolean enableVoidTools;

	public static int minBlazePowderFromPyrofluid;
	public static int maxBlazePowderFromPyrofluid;
	
	public static int speedMultiplierForFurnace;
	public static boolean makeRequireAlumentum;
	

	@Override
	public void load(Configuration config) {
		cfg = config;
		
		//Adv. alchemy furnace
		speedMultiplierForFurnace = cfg.getInt(
				"speedMultiplierForFurnace", "Advanced Alchemy Furnace", 2, 0, Integer.MAX_VALUE, 
				"This is the speed of the Advanced Alchamical Furnace. TC's basic has 1.");
		
		makeRequireAlumentum = cfg.getBoolean(
				"makeRequireAlumentium", "Advanced Alchemy Furnace", true, 
				"Does the Advanced Alchemical Furnace requires Alumentum to work faster");
		
		//enchants
		elderKnowledgeID = cfg.getInt("elderKnowledgeEnchantmentID", "Enchantments", 98, 0, Enchantment.enchantmentsList.length, "");
		eldritchBaneID = cfg.getInt("eldritchBaneEnchantmentID", "Enchantments", 99, 0, Enchantment.enchantmentsList.length, "");
		magicTouchID = cfg.getInt("magicTouchEnchantmentID", "Enchantments", 100, 0, Enchantment.enchantmentsList.length, "");
		taintedID = cfg.getInt("taintedEnchantmentID", "Enchantments", 101, 0, Enchantment.enchantmentsList.length, "");
		vaporisingID = cfg.getInt("vaporisingEnchantmentID", "Enchantments", 102, 0, Enchantment.enchantmentsList.length, "");
		
		//focus upgrades
		aquaticFociUID = cfg.getInt("aquaticFociUID", "Foci", 42, 0, Integer.MAX_VALUE, "");
		nethericFociUID = cfg.getInt("nethericFociUID", "Foci", 43, 0, Integer.MAX_VALUE, "");
		decomposingFociUID = cfg.getInt("decomposingFociUID", "Foci", 44, 0, Integer.MAX_VALUE, "");
		vaporisingFociUID = cfg.getInt("vaporisingFociUID", "Foci", 45, 0, Integer.MAX_VALUE, "");
		calmingFociUID = cfg.getInt("calmingFociUID", "Foci", 46, 0, Integer.MAX_VALUE, "");
		crystalizationFociUID = cfg.getInt("crystalizationFociUID", "Foci", 47, 0, Integer.MAX_VALUE, "");
		warpingFociUID = cfg.getInt("warpingFociUID", "Foci", 48, 0, Integer.MAX_VALUE, "");
		
		//general + module disable
		allowTobacco = cfg.getBoolean("allowTobacco", "General", true, 
				"If set to false the tobacco will be disabled - there will be no recipes/no entries in Thaumonomicon");
		
		enableTTCompathability = cfg.getBoolean("enableTTCompathability", "General", true, 
				"Allow the mod to register it's enchantments in the Thaumic Tinkerer's enchanter? Set to false if Thaumic Tinkerer is crashing you.");
		
		shardsFromOre = cfg.getInt("shardsFromOre", "General", 8, 1, 64, 
				"Amount of shards recieved from crucible ore processing");
		
		brightFociRequiresPrimordialPearl = cfg.getBoolean("brightFociRequiresPrimordialPearl", "General", true, 
				"Does the Brightness Foci for the Node Manipulator requires a Primordial Pearl");
		
		enableRevolver = cfg.getBoolean("enableRevolver", "General", true, 
				"If set to false the revolver and upgrades will be disabled - there will be no recipes/no entries in Thaumonomicon");
		
		enableNodeTools = cfg.getBoolean("enableNodeTools", "General", true, 
				"If set to false, will disable the Node Modifer, focuses, and the Node Linker's entries and recipes");
		
		enableBracelets = cfg.getBoolean("enableBracelets", "General", true, 
				"If set to false the various bracelets will be disabled - there will be no recipes/no entries in Thaumonomicon");
		
		enableFlora = cfg.getBoolean("enableFlora", "General", true, 
				"If set to false the various plant items will be disabled - there will be no recipes/no entries in Thaumonomicon");
		
		enableBloodyMess = cfg.getBoolean("enableBloodyMess", "General", true, 
				"If set to false the spikes and bloody robes will be disabled - there will be no recipes/no entries in Thaumonomicon");
		
		/*enableVoidTools = cfg.getBoolean("enableVoidTools", "General", true, 
				"If set to false the void shears and igniter will be disabled - there will be no recipes/no entries in Thaumonomicon");
		*/
		
				
		//pyrofluid
		minBlazePowderFromPyrofluid = cfg.getInt("minBlazePowderFromPyrofluid", "Pyrofluid", 5, 0, Integer.MAX_VALUE, "");
		maxBlazePowderFromPyrofluid = cfg.getInt("maxBlazePowderFromPyrofluid", "Pyrofluid", 5+32, 0, Integer.MAX_VALUE, "");
		

		}
	


}
