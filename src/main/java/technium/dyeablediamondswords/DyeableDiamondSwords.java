package technium.dyeablediamondswords;

import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DyeableDiamondSwords.MODID, name = DyeableDiamondSwords.NAME, version = DyeableDiamondSwords.VERSION, acceptedMinecraftVersions = DyeableDiamondSwords.MC_VERSION)
public class DyeableDiamondSwords {

    public static final String MODID = "dyeablediamondswords";
    public static final String NAME = "Dyeable Diamond Swords";
    public static final String VERSION = "0.1.2";
    public static final String MC_VERSION = "[1.12.2]";

    public static final CreativeTabs DYEABLE_DIAMOND_SWORDS_TAB = new DyeableDiamondSwordsTab();

    public static final Logger LOGGER = LogManager.getLogger(DyeableDiamondSwords.MODID);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(DyeableDiamondSwords.NAME + " says hi!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}