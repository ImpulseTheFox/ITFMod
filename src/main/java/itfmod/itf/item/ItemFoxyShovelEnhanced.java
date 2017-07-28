package itfmod.itf.item;

import itfmod.itf.Enhanceable;
import itfmod.itf.ITFItemShovel;
import itfmod.repo.ITFItems;
import itfmod.repo.ITFMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static itfmod.repo.Names.NAME_ITEM_FOXY_SHOVEL;
import static itfmod.repo.Names.NAME_ITEM_FOXY_SHOVEL_ENHANCED;

public class ItemFoxyShovelEnhanced extends ITFItemShovel
{
	public ItemFoxyShovelEnhanced()
	{
		super(NAME_ITEM_FOXY_SHOVEL_ENHANCED, ITFMaterials.FOXY_MATERIAL_ENHANCED);
	}
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getOrderId()
	{
		return 1007;
	}
}
