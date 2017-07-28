package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemShovel;
import itfmod.repo.ITFCreativeTabs;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;

import static itfmod.repo.Names.NAME_ITEM_FOXY_SHOVEL;

public class ItemFoxyShovel extends ITFItemShovel implements Enhanceable
{
	public ItemFoxyShovel()
	{
		super(NAME_ITEM_FOXY_SHOVEL, ITFMaterials.FOXY_MATERIAL);
	}
	
	@Override
	public int getOrderId()
	{
		return 1006;
	}
	
	@Override
	public Item getEnhancedItem()
	{
		return ITFItems.FOXY_SHOVEL_ENHANCED;
	}
}
