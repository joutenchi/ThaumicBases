package tb.init;

import DummyCore.Blocks.BlocksRegistry;
import tb.common.block.BlockAdvAlchemicalFurnace;
import tb.common.block.BlockAshroom;
import tb.common.block.BlockAureliaLeaf;
import tb.common.block.BlockAureliaPlant;
import tb.common.block.BlockBrazier;
import tb.common.block.BlockBriar;
import tb.common.block.BlockCampfire;
import tb.common.block.BlockCryingObelisk;
import tb.common.block.BlockCrystalBlock;
import tb.common.block.BlockCrystalSlab;
import tb.common.block.BlockEntityDeconstructor;
import tb.common.block.BlockFlaxium;
import tb.common.block.BlockHalfSlab;
import tb.common.block.BlockKnose;
import tb.common.block.BlockLucritePlant;
import tb.common.block.BlockNodeLinker;
import tb.common.block.BlockNodeManipulator;
import tb.common.block.BlockOverchanter;
import tb.common.block.BlockPyrofluid;
import tb.common.block.BlockRainbowCactus;
import tb.common.block.BlockRedlonStem;
import tb.common.block.BlockRelocator;
import tb.common.block.BlockSpike;
import tb.common.block.BlockSweed;
import tb.common.block.BlockTBLeaves;
import tb.common.block.BlockTBLog;
import tb.common.block.BlockTBPlant;
import tb.common.block.BlockTBSapling;
import tb.common.block.BlockThaumicAnvil;
import tb.common.block.BlockVoid;
import tb.common.block.BlockVoidAnvil;
import tb.common.block.TBBlock;
import tb.common.block.TBBlockDeco;
import tb.common.block.TBSidedBlock;
import tb.common.itemblock.ItemBlockCrystal;
import tb.common.itemblock.ItemBlockMetadata;
import tb.common.itemblock.ItemBlockModeManipulator;
import tb.common.itemblock.ItemBlockPyrofluid;
import tb.common.itemblock.ItemBlockSlab_0;
import tb.common.itemblock.ItemBlockSlab_1;
import tb.common.itemblock.ItemBlockSpike;
import tb.common.itemblock.ItemBlockTBLeaves;
import tb.common.itemblock.ItemBlockTBLogs;
import tb.common.itemblock.ItemBlockTBSapling;
import tb.core.TBCore;
import tb.utils.TBConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemAnvilBlock;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TBBlocks {

	public static final Class<TBCore> core = TBCore.class;
	
	public static Block quicksilverBlock = new TBBlock(Material.iron,false).stabilise().setBlockName("quicksilverBlock").setBlockTextureName("thaumicbases:quicksilverBlock").setHardness(1F);
	public static Block quicksilverBrick = new TBBlock(Material.rock,true).stabilise().setBlockName("quicksilverBrick").setBlockTextureName("thaumicbases:quicksilverBrick").setHardness(1F);
	public static Block crystalBlock = new BlockCrystalBlock().setBlockName("crystalBlock").setBlockTextureName("thaumicbases:crystal/mixed");
	public static Block dustBlock = new TBBlock(Material.sand,false).stabilise().setStepSound(Block.soundTypeSand).setBlockName("salisMundusBlock").setBlockTextureName("thaumicbases:dust_block").setHardness(1F);
	public static Block pyrofluid = new BlockPyrofluid().setBlockName("pyrofluid").setLightLevel(1);
	public static Block thauminiteBlock = new TBBlock(Material.iron,false).stabilise().setBlockName("thauminiteBlock").setBlockTextureName("thaumicbases:thauminiteblock").setHardness(2F);
	public static Block eldritchArk = new TBBlockDeco(Material.rock,false).setBlockName("eldritchArk").setBlockTextureName("thaumicbases:eldritchArk").setHardness(3F);
	public static Block ironGreatwood = new TBBlockDeco(Material.wood,false).setBlockName("ironGreatwood").setBlockTextureName("thaumicbases:ironGreatwood").setHardness(1F).setStepSound(Block.soundTypeWood);
	
	public static Block plax = new BlockTBPlant(8,4,true).setBlockName("plax").setBlockTextureName("thaumicbases:plax/");
	public static Block aureliaPetal = new BlockAureliaLeaf().setBlockName("aureliaPetal").setBlockTextureName("thaumicbases:aurelia/petal").setHardness(0).setStepSound(Block.soundTypeGrass);
	public static Block aurelia = new BlockAureliaPlant().setBlockName("aurelia").setBlockTextureName("thaumicbases:aurelia/").setHardness(0).setStepSound(Block.soundTypeGrass);
	public static Block metalleat = new BlockTBPlant(8,8,true).setBlockName("metalleat").setBlockTextureName("thaumicbases:metalleat/");
	public static Block lucrite = new BlockLucritePlant(8,16,true).setBlockName("lucrite").setBlockTextureName("thaumicbases:lucrite/");
	public static Block knose = new BlockKnose(4,16,false).setBlockName("knose").setBlockTextureName("thaumicbases:knoze/");
	public static Block sweed = new BlockSweed(4,4,false).setBlockName("sweed").setBlockTextureName("thaumicbases:sweed/");
	public static Block lazullia = new BlockTBPlant(8,16,true).setBlockName("lazullia").setBlockTextureName("thaumicbases:lazullia/");
	public static Block rainbowCactus = new BlockRainbowCactus().setBlockName("rainbowCactus").setBlockTextureName("thaumicbases:rainbowCacti/").setStepSound(Block.soundTypeCloth).setHardness(0.5F);
	public static Block redlonStem = new BlockRedlonStem(Blocks.redstone_block).setBlockName("redlonStem").setBlockTextureName("thaumicbases:redlon/redlon").setStepSound(Block.soundTypeGrass);
	public static Block ashroom = new BlockAshroom(4,8,false).setBlockName("ashroom").setBlockTextureName("thaumicbases:aspectshroom/");
	public static Block flaxium = new BlockFlaxium().setBlockName("flaxium").setBlockTextureName("thaumicbases:flaxium").setStepSound(Block.soundTypeGrass);
	public static Block glieonia = new BlockTBPlant(4,12,false).setBlockName("glieonia").setBlockTextureName("thaumicbases:glieonia/");
	public static Block briar = new BlockBriar(8,4).setBlockName("briar").setBlockTextureName("thaumicbases:briar/").setStepSound(Block.soundTypeGrass);
	public static Block tobacco = new BlockTBPlant(8,16,true).setBlockName("tobacco").setBlockTextureName("thaumicbases:tobacco/");
	public static Block voidPlant = new BlockTBPlant(4,32,true).setBlockName("voidPlant").setBlockTextureName("thaumicbases:voidPlant/");
	
	public static Block spike = new BlockSpike().setBlockName("spike").setHardness(3).setResistance(3).setStepSound(Block.soundTypeMetal);
	public static Block overchanter = new BlockOverchanter().setBlockName("overchanter").setHardness(5).setResistance(5);
	public static Block sapling = new BlockTBSapling();
	public static Block genLeaves = new BlockTBLeaves();
	public static Block cryingObsidian = new BlockCryingObelisk().setBlockName("cryingObsidian").setBlockTextureName("thaumicbases:cryingObelisk/").setHardness(10).setResistance(10);
	public static Block oldCobble = new TBBlockDeco(Material.rock,false).setBlockName("TBoldCobblestone").setBlockTextureName("thaumicbases:cobblestone").setHardness(1).setResistance(1);
	public static Block oldCobbleMossy = new TBBlockDeco(Material.rock,false).setBlockName("TBoldCobblestoneMossy").setBlockTextureName("thaumicbases:cobblestone_mossy").setHardness(1).setResistance(1);
	public static Block oldGravel = new BlockFalling(Material.sand).setBlockName("TBoldGravel").setBlockTextureName("thaumicbases:gravel").setHardness(0.6F).setResistance(0).setStepSound(Block.soundTypeGravel);
	public static Block advAlchFurnace = new BlockAdvAlchemicalFurnace().setBlockName("advAlchFurnace");
	public static Block entityDeconstructor = new BlockEntityDeconstructor().setBlockName("entityDeconstructor").setBlockTextureName("thaumicbases:entityDeconstructor/block").setHardness(1);
	public static Block oldBrick = new TBBlockDeco(Material.rock,false).setBlockName("TBoldBricks").setBlockTextureName("thaumicbases:brick").setHardness(1).setResistance(1);
	public static Block oldLapis = new TBBlockDeco(Material.rock,false).setBlockName("TBoldLapis").setBlockTextureName("thaumicbases:lapis_block").setHardness(1).setResistance(1);
	public static Block oldIron = new TBSidedBlock(Material.rock,false).setBlockName("TBoldIron").setBlockTextureName("thaumicbases:iron_block").setHardness(1).setResistance(1);
	public static Block oldGold = new TBSidedBlock(Material.rock,false).setBlockName("TBoldGold").setBlockTextureName("thaumicbases:gold_block").setHardness(1).setResistance(1);
	public static Block oldDiamond = new TBSidedBlock(Material.rock,false).setBlockName("TBoldDiamond").setBlockTextureName("thaumicbases:diamond_block").setHardness(1).setResistance(1);
	public static Block genLogs = new BlockTBLog();
	public static Block nodeManipulator = new BlockNodeManipulator().setBlockName("nodeManipulator").setHardness(1);
	public static Block genericSlab = new BlockHalfSlab(false,Material.rock).setHardness(1).setResistance(10).setBlockName("tb.slab.");
	public static Block genericSlab_full = new BlockHalfSlab(true,Material.rock).setHardness(1).setResistance(10).setBlockName("tb.slab.");
	public static Block crystalSlab = new BlockCrystalSlab(false,Material.glass).setBlockName("tb.crystalslab.");
	public static Block crystalSlab_full = new BlockCrystalSlab(true,Material.glass).setBlockName("tb.crystalslab.");
	public static Block relocator = new BlockRelocator().setBlockName("thaumicRelocator");
	public static Block voidBlock = new BlockVoid().setBlockName("tb.voidblock");
	public static Block thaumicAnvil = new BlockThaumicAnvil().setBlockName("thaumicAnvil").setBlockTextureName("thaumicbases:thaumiumAnvil/").setHardness(6).setResistance(16).setStepSound(Block.soundTypeAnvil);
	public static Block voidAnvil = new BlockVoidAnvil().setBlockName("voidAnvil").setBlockTextureName("thaumicbases:voidAnvil/");
	public static Block enderPlanks = new TBBlockDeco(Material.wood, false).setBlockName("enderPlanks").setBlockTextureName("thaumicbases:enderTree/planks").setHardness(2).setResistance(45).setStepSound(Block.soundTypeWood);
	public static Block nodeLinker = new BlockNodeLinker().setBlockName("nodeLinker").setHardness(1);
	public static Block campfire = new BlockCampfire().setBlockName("tb.campfire").setBlockTextureName("thaumicbases:campfire").setLightLevel(1);
	public static Block braizer = new BlockBrazier().setBlockName("tb.brazier").setBlockTextureName("cobblestone").setLightLevel(1);
	
	
	public static void setup()
	{
		//storage blocks
		BlocksRegistry.registerBlock(quicksilverBlock, "quicksilverBlock",core,ItemBlock.class);
		OreDictionary.registerOre("blockQuicksilver", quicksilverBlock);
		BlocksRegistry.registerBlock(quicksilverBrick, "quicksilverBrick",core,ItemBlock.class);
		OreDictionary.registerOre("blockQuicksilver", quicksilverBrick);
		BlocksRegistry.registerBlock(crystalBlock,"crystalBlock",core, ItemBlockCrystal.class);
		OreDictionary.registerOre("blockCrystalCluster", new ItemStack(crystalBlock,1,OreDictionary.WILDCARD_VALUE));
		BlocksRegistry.registerBlock(dustBlock, "blockSalisMundus",core,ItemBlock.class);
		OreDictionary.registerOre("blockSalisMundus", dustBlock);
		BlocksRegistry.registerBlock(thauminiteBlock, "thauminiteBlock",core,ItemBlock.class);
		OreDictionary.registerOre("blockThauminite", thauminiteBlock);
		
		BlocksRegistry.registerBlock(voidBlock, "voidBlock",core,ItemBlock.class);
		OreDictionary.registerOre("blockVoidMetal", voidBlock);
		OreDictionary.registerOre("blockVoidmetal", voidBlock);
		OreDictionary.registerOre("blockVoid", voidBlock);
		OreDictionary.registerOre("voidBlock", voidBlock);		
		

		BlocksRegistry.registerBlock(pyrofluid,"pyrofluid",core, ItemBlockPyrofluid.class);
		
		BlocksRegistry.registerBlock(overchanter, "overchanter",core,ItemBlock.class);
				
		BlocksRegistry.registerBlock(cryingObsidian, "cryingObsidian",core,ItemBlock.class);
		cryingObsidian.setHarvestLevel("pickaxe", 3);

		BlocksRegistry.registerBlock(advAlchFurnace, "advAlchFurnace",core,ItemBlock.class);
	
		
		//levitator
		BlocksRegistry.registerBlock(relocator, "relocator",core,ItemBlockMetadata.class);

		BlocksRegistry.registerBlock(thaumicAnvil, "thaumicAnvil",core,ItemAnvilBlock.class);
		BlocksRegistry.registerBlock(voidAnvil, "voidAnvil",core,ItemAnvilBlock.class);

		BlocksRegistry.registerBlock(campfire, "campfire",core,ItemBlock.class);
		BlocksRegistry.registerBlock(braizer, "brazier",core,ItemBlock.class);
		
		
		//Deco
		BlocksRegistry.registerBlock(eldritchArk, "eldritchArk",core,ItemBlock.class);
		BlocksRegistry.registerBlock(ironGreatwood, "ironGreatwood",core,ItemBlock.class);
		
		//Old blocks
		BlocksRegistry.registerBlock(oldBrick, "oldBrick",core,ItemBlock.class);
		oldBrick.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("brick", oldBrick);
		BlocksRegistry.registerBlock(oldLapis, "oldLapis",core,ItemBlock.class);
		oldLapis.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("blockLapis", oldLapis);
		BlocksRegistry.registerBlock(oldIron, "oldIron",core,ItemBlock.class);
		oldIron.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("blockIron", oldIron);
		BlocksRegistry.registerBlock(oldGold, "oldGold",core,ItemBlock.class);
		oldGold.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("blockGold", oldGold);
		BlocksRegistry.registerBlock(oldDiamond, "oldDiamond",core,ItemBlock.class);
		oldDiamond.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("blockDiamond", oldDiamond);
		BlocksRegistry.registerBlock(oldCobble, "oldCobble",core,ItemBlock.class);
		oldCobble.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("cobblestone", oldCobble);
		BlocksRegistry.registerBlock(oldCobbleMossy, "oldCobbleMossy",core,ItemBlock.class);
		oldCobbleMossy.setHarvestLevel("pickaxe", 0);
		OreDictionary.registerOre("cobblestone", oldCobbleMossy);
		OreDictionary.registerOre("mossyCobblestone", oldCobbleMossy);
		BlocksRegistry.registerBlock(oldGravel, "oldGravel",core,ItemBlock.class);
		oldGravel.setHarvestLevel("shovel", 0);
		OreDictionary.registerOre("gravel", oldGravel);
		
		
		BlocksRegistry.registerBlock(genericSlab, "genericSlab",core,ItemBlockSlab_0.class);
		BlocksRegistry.registerBlock(genericSlab_full, "genericSlab_full",core,ItemBlockSlab_0.class);
		BlocksRegistry.registerBlock(crystalSlab, "crystalSlab",core,ItemBlockSlab_1.class);
		BlocksRegistry.registerBlock(crystalSlab_full, "crystalSlab_full",core,ItemBlockSlab_1.class);
		

		if (TBConfig.allowTobacco) {
			//Tobacco
			BlocksRegistry.registerBlock(tobacco, "tobacco",core,ItemBlock.class);
		}
		
		if (TBConfig.enableBloodyMess) {
			//Spike
			BlocksRegistry.registerBlock(spike, "spike",core,ItemBlockSpike.class);
		}
		
		//TODO flora
		/*if (TBConfig.enableFlora) {*/
			//flora
			BlocksRegistry.registerBlock(plax, "plax",core,ItemBlock.class);
			BlocksRegistry.registerBlock(aureliaPetal, "aureliaPetal",core,ItemBlock.class);
			BlocksRegistry.registerBlock(aurelia, "aurelia",core,ItemBlock.class);
			BlocksRegistry.registerBlock(metalleat, "metalleat",core,ItemBlock.class);
			BlocksRegistry.registerBlock(lucrite, "lucrite",core,ItemBlock.class);
			BlocksRegistry.registerBlock(knose, "knose",core,ItemBlock.class);
			BlocksRegistry.registerBlock(sweed, "sweed",core,ItemBlock.class);
			BlocksRegistry.registerBlock(lazullia, "lazullia",core,ItemBlock.class);
			BlocksRegistry.registerBlock(rainbowCactus, "rainbowCactus",core,ItemBlock.class);
			BlocksRegistry.registerBlock(redlonStem, "redlonStem",core,ItemBlock.class);
			BlocksRegistry.registerBlock(ashroom, "ashroom",core,ItemBlock.class);
			BlocksRegistry.registerBlock(flaxium, "flaxium",core,ItemBlock.class);
			BlocksRegistry.registerBlock(glieonia, "glieonia",core,ItemBlock.class);
			BlocksRegistry.registerBlock(briar, "briar",core,ItemBlock.class);
			BlocksRegistry.registerBlock(voidPlant, "voidPlant",core,ItemBlock.class);
			//trees
			BlocksRegistry.registerBlock(sapling, "goldenOakSapling",core,ItemBlockTBSapling.class);
			OreDictionary.registerOre("treeSapling", sapling);
			BlocksRegistry.registerBlock(genLeaves, "genLeaves",core,ItemBlockTBLeaves.class);
			BlocksRegistry.registerBlock(genLogs, "genLogs",core,ItemBlockTBLogs.class);
			OreDictionary.registerOre("logWood", new ItemStack(genLogs,1,OreDictionary.WILDCARD_VALUE));
			BlocksRegistry.registerBlock(enderPlanks, "enderPlanks",core,ItemBlock.class);
			OreDictionary.registerOre("plankWood", enderPlanks);
			
			Blocks.fire.setFireInfo(genLogs, 5, 5);
			Blocks.fire.setFireInfo(genLeaves, 30, 60);
			Blocks.fire.setFireInfo(enderPlanks, 5, 20);
		//}
		
		if (TBConfig.enableNodeTools) {
			//node
			BlocksRegistry.registerBlock(nodeManipulator, "nodeManipulator",core,ItemBlockModeManipulator.class);
			BlocksRegistry.registerBlock(nodeLinker, "nodeLinker",core,ItemBlock.class);
		}
		
		
			//Ent Decon
			BlocksRegistry.registerBlock(entityDeconstructor, "entityDeconstructor",core,ItemBlock.class);
		

		
	}
	
	
	
}
