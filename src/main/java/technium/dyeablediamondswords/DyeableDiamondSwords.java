package technium.dyeablediamondswords;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import net.minecraftforge.fml.common.Mod;

@Mod(DyeableDiamondSwords.MODID)
public class DyeableDiamondSwords {

    public static final String MODID = "dyeablediamondswords";
    public static final String NAME = "Dyeable Diamond Swords";
    public static final String VERSION = "0.1.1";
    public static final String MC_VERSION = "[1.12.2]";

//    public static final CreativeTabs DYEABLE_DIAMOND_SWORDS_TAB = new DyeableDiamondSwordsTab();

    public static final Logger LOGGER = LogManager.getLogger(DyeableDiamondSwords.MODID);

    public DyeableDiamondSwords() {
        LOGGER.info(DyeableDiamondSwords.NAME + " says hi!");
    }

}