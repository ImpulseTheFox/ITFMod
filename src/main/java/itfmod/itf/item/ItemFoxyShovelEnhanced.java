package itfmod.itf.item;

import itfmod.itf.ITFItemShovel;
import itfmod.ref.ITFMaterials;
import net.minecraft.item.ItemStack;

import static itfmod.ref.Names.NAME_ITEM_FOXY_SHOVEL_ENHANCED;

/**
 * Enhanced version of {@link ItemFoxyShovel}
 */
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
