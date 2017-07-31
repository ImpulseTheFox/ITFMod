package itfmod.proxy;

import itfmod.SimpleRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy extends CommonProxy
{
	@Override
    public void preInit(FMLPreInitializationEvent event)
    {
		SimpleRegistry.setLoadModels(false);
		super.preInit(event);
    }

	@Override
    public void init(FMLInitializationEvent event)
    {
		super.init(event);
    }

	@Override
    public void postInit(FMLPostInitializationEvent event)
    {
    	super.postInit(event);
    }
}
