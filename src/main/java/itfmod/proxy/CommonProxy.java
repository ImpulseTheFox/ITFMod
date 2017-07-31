package itfmod.proxy;

import itfmod.Recipes;
import itfmod.event.EventEnhanceITFItem;
import itfmod.ref.ITFBlocks;
import itfmod.ref.ITFCreativeTabs;
import itfmod.ref.ITFItems;
import itfmod.world.ITFWorldGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
		ITFItems.registerItems();
		ITFBlocks.registerBlocks();
		ITFBlocks.registerItemBlocks();
		ITFCreativeTabs.finishTabs();
		GameRegistry.registerWorldGenerator(new ITFWorldGen(), 3);
		MinecraftForge.EVENT_BUS.register(new EventEnhanceITFItem());
    }

    public void init(FMLInitializationEvent event)
    {
		Recipes.registerRecipes();
    }

    public void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
