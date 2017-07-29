package itfmod.plugin;

import itfmod.ref.ITFBlocks;
import itfmod.ref.ITFItems;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import net.minecraft.item.ItemStack;

/**
 * Class that integrates JEI
 */
@JEIPlugin
public class ITFJEIPlugin implements IModPlugin
{
	private static final String SUFFIX = ".desc";
	private static final String ENHANCED_DESC = "enhanceditem" + SUFFIX;
	private static final String ALTAR_DESC = ITFBlocks.FOXY_ALTAR.getUnlocalizedName() + SUFFIX;
	private static final String ALTAR_DISABLED_DESC = ITFBlocks.FOXY_ALTAR_DISABLED.getUnlocalizedName() + SUFFIX;
	
	@Override
	public void register(IModRegistry registry)
	{
		//Adding item descriptions
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_PICKAXE_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_AXE_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_SWORD_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_SHOVEL_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_HELMET_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_CHESTPLATE_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_LEGGINGS_ENHANCED), ItemStack.class, ENHANCED_DESC);
		registry.addIngredientInfo(new ItemStack(ITFItems.FOXY_BOOTS_ENHANCED), ItemStack.class, ENHANCED_DESC);
		
		//Adding block descriptions
		registry.addIngredientInfo(new ItemStack(ITFBlocks.FOXY_ALTAR), ItemStack.class, ALTAR_DESC);
		registry.addIngredientInfo(new ItemStack(ITFBlocks.FOXY_ALTAR_DISABLED), ItemStack.class, ALTAR_DISABLED_DESC);
	}
}
