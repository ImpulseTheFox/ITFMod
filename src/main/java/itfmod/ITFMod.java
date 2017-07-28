package itfmod;

import itfmod.repo.ITFBlocks;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFRecipes;
import itfmod.world.ITFWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = ITFMod.MODID, version = ITFMod.VERSION, name = ITFMod.NAME, acceptedMinecraftVersions = ITFMod.MCVERSIONS)
public class ITFMod // MOD COLOR: #ff6600 ON GOLD
{
	public static final String MODID = "itfmod";
	public static final String VERSION = "1.0";
	public static final String MCVERSIONS = "1.12";
	public static final String NAME = "Impulse The Fox Mod";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		ITFRecipes.registerRecipes();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ITFItems.registerItems();
		ITFBlocks.registerBlocks();
		ITFCreativeTabs.finishTabs();
		GameRegistry.registerWorldGenerator(new ITFWorldGen(), 3);
	}
}