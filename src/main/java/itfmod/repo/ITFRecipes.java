package itfmod.repo;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ITFRecipes
{
	public static void registerRecipes()
	{
		ITFRecipes.registerShapedRecipes();
		ITFRecipes.registerShapelessRecipes();
		ITFRecipes.registerSmeltingRecipes();
	}
	
	private static void registerShapedRecipes()
	{
		// Moved to JSON
	}
	
	private static void registerShapelessRecipes()
	{
		// Moved to JSON
	}
	
	private static void registerSmeltingRecipes()
	{
		GameRegistry.addSmelting(ITFBlocks.FOXY_ORE, new ItemStack(ITFItems.FOXY_INGOT), 1.0F);
	}
}
