package xyz.satdg.sao.supergatemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sun.security.ec.SunEC;

/**
 * @author GongSunink
 */
@Mod(name = SuperGate.MODNAME,modid = SuperGate.MODID,version = SuperGate.VERSION)
public class SuperGate {

    public static final String MODNAME = "SuperGate";
    public static final String MODID = "SuperGate";
    public static final String VERSION = "1.0bate";

    private static SuperGate instance;


    @Mod.InstanceFactory
    public static SuperGate getInstance(){
        return instance;
    }


    @Mod.EventHandler
    public void perInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init (FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
