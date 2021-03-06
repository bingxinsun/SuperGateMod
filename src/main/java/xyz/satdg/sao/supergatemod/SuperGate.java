package xyz.satdg.sao.supergatemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.satdg.sao.supergatemod.client.ClientProxy;

/**
 * the main class of mod
 * @author GongSunink
 */
@Mod(name = SuperGate.MODNAME,modid = SuperGate.MODID,version =
        SuperGate.VERSION)
public class SuperGate {

    public static final String MODNAME = "SuperGate";
    public static final String MODID = "supergate";
    public static final String VERSION = "1.0bate";

    @Mod.Instance(owner = SuperGate.MODID)
    public SuperGate intance;

    @SidedProxy()
    ClientProxy clientProxy;

    @Mod.EventHandler
    public void perInit(FMLPreInitializationEvent event){
        clientProxy.clientPreinit(event);
    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){
        clientProxy.clientInit(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}
}
