package itfmod.repo;

import itfmod.itf.creativetab.CreativeTabITFMod;

public class ITFCreativeTabs
{
	public static final CreativeTabITFMod CREATIVE_TAB_ITF_MOD = new CreativeTabITFMod();
	
	public static void finishTabs()
	{
		ITFCreativeTabs.CREATIVE_TAB_ITF_MOD.setIconItem(ITFItems.FOXY_INGOT);
	}
}
