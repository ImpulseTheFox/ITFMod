package itfmod;

import itfmod.ref.ITFBlocks;
import itfmod.ref.ITFItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Class registering recipes
 */
public class Recipes
{
	public static void registerRecipes()
	{
		Recipes.registerShapedRecipes();
		Recipes.registerShapelessRecipes();
		Recipes.registerSmeltingRecipes();
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
