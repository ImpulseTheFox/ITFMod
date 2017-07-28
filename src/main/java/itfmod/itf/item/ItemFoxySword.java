package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemSword;
import itfmod.ref.ITFItems;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.ref.Names.NAME_ITEM_FOXY_SWORD;

/**
 * Enhanced version: {@link ItemFoxySwordEnhanced}
 */
public class ItemFoxySword extends ITFItemSword implements Enhanceable
{
	public ItemFoxySword()
	{
		super(NAME_ITEM_FOXY_SWORD, ITFMaterials.FOXY_MATERIAL);
	}
	
	@Override
	public int getOrderId()
	{
		return 1004;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_SWORD_ENHANCED;
	}
}
