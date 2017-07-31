package itfmod;

import itfmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Main class of the ITFMod
 */
@Mod(modid = ITFMod.MODID, version = ITFMod.VERSION, name = ITFMod.NAME, acceptedMinecraftVersions = ITFMod.MCVERSIONS)
public class ITFMod // MOD COLOR: #ff6600 ON GOLD
{
	public static final String MODID = "itfmod";
	public static final String VERSION = "1.0";
	public static final String MCVERSIONS = "1.12";
	public static final String NAME = "ITF Mod";
	
	@SidedProxy(modId = ITFMod.MODID, clientSide = "itfmod.proxy.ClientProxy", serverSide = "itfmod.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}