package itfmod.ref;

import itfmod.itf.creativetab.CreativeTabITFMod;

/**
 * Class to store {@link itfmod.itf.ITFCreativeTab CreativeTabs}
 */
public class ITFCreativeTabs
{
	public static final CreativeTabITFMod CREATIVE_TAB_ITF_MOD = new CreativeTabITFMod();
	
	public static void finishTabs()
	{
		ITFCreativeTabs.CREATIVE_TAB_ITF_MOD.setIconItem(ITFItems.FOXY_INGOT);
	}
}
