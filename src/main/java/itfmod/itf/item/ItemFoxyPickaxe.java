package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemPickaxe;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_PICKAXE;

/**
 * Enhanced version: {@link ItemFoxyPickaxeEnhanced}
 */
public class ItemFoxyPickaxe extends ITFItemPickaxe implements Enhanceable
{
	public ItemFoxyPickaxe()
	{
		super(NAME_ITEM_FOXY_PICKAXE, ITFMaterials.FOXY_MATERIAL);
	}
	
	@Override
	public int getOrderId()
	{
		return 1000;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_PICKAXE_ENHANCED;
	}
}
