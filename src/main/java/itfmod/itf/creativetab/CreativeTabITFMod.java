package itfmod.itf.creativetab;

import itfmod.ITFMod;
import itfmod.itf.ITFCreativeTab;
import itfmod.itf.OrderedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

/**
 * The Main CreativeTab for the ITFMod
 */
public class CreativeTabITFMod extends ITFCreativeTab
{
	public CreativeTabITFMod()
	{
		super(ITFMod.MODID);
	}
	
	@Override
	public void displayAllRelevantItems(NonNullList<ItemStack> p_78018_1_)
	{
		super.displayAllRelevantItems(p_78018_1_);
		
		p_78018_1_.sort((o1, o2) ->
		{
			return Integer.compare(((OrderedItem) o1.getItem()).getOrderId(), ((OrderedItem) o2.getItem()).getOrderId());
		});
	}
}
