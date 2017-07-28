package itfmod;

import java.util.HashSet;
import java.util.Set;

import itfmod.itf.ITFItemBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Class for simple registering of Items and Blocks. All Items and Blocks must
 * be registered in the preInit!
 * 
 * @author y7017
 */
public class SimpleRegistry
{
	@Mod.EventBusSubscriber(modid = ITFMod.MODID)
	public static class RegistrationHandler
	{
		@SubscribeEvent
		public static synchronized void registerBlocks(RegistryEvent.Register<Block> event)
		{
			IForgeRegistry<Block> reg = event.getRegistry();
			
			for (Block block : SimpleRegistry.blocks)
			{
				reg.register(block);
				SimpleRegistry.registerItem(new ITFItemBlock(block));
			}
		}
		
		@SubscribeEvent
		public static synchronized void registerItems(RegistryEvent.Register<Item> event)
		{
			IForgeRegistry<Item> reg = event.getRegistry();
			
			for (Item item : SimpleRegistry.items)
			{
				reg.register(item);
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}
		}
	}
	
	private static Set<Item> items = new HashSet<>();
	
	private static Set<Block> blocks = new HashSet<>();
	
	public static Set<Block> getBlocks()
	{
		return SimpleRegistry.blocks;
	}
	
	public static Set<Item> getItems()
	{
		return SimpleRegistry.items;
	}
	
	public static void registerBlock(Block block)
	{
		SimpleRegistry.blocks.add(block);
	}
	
	public static void registerItem(Item item)
	{
		SimpleRegistry.items.add(item);
	}
	
	public static void setBlocks(Set<Block> blocks)
	{
		SimpleRegistry.blocks = blocks;
	}
	
	public static void setItems(Set<Item> items)
	{
		SimpleRegistry.items = items;
	}
}
