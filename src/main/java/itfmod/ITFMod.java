package itfmod;

import itfmod.event.EventEnhanceITFItem;
import itfmod.ref.ITFBlocks;
import itfmod.ref.ITFCreativeTabs;
import itfmod.ref.ITFItems;
import itfmod.world.ITFWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Main class of the ITFMod
 */
@Mod(modid = ITFMod.MODID, version = ITFMod.VERSION, name = ITFMod.NAME, acceptedMinecraftVersions = ITFMod.MCVERSIONS)
public class ITFMod // MOD COLOR: #ff6600 ON GOLD
{
	public static final String MODID = "itfmod";
	public static final String VERSION = "1.0";
	public static final String MCVERSIONS = "1.12";
	public static final String NAME = "ITF Mod";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.registerRecipes();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ITFItems.registerItems();
		ITFBlocks.registerBlocks();
		ITFCreativeTabs.finishTabs();
		GameRegistry.registerWorldGenerator(new ITFWorldGen(), 3);
		MinecraftForge.EVENT_BUS.register(new EventEnhanceITFItem());
	}
}