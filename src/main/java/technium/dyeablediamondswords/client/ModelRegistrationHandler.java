package technium.dyeablediamondswords.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import technium.dyeablediamondswords.DyeableDiamondSwords;
import technium.dyeablediamondswords.init.ModItems;

import java.util.Objects;

@EventBusSubscriber(value = Side.CLIENT, modid = DyeableDiamondSwords.MODID)
public class ModelRegistrationHandler {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.PINK_DIAMOND_SWORD, 0);
        registerModel(ModItems.DEEP_BLUE_DIAMOND_SWORD, 0);
        registerModel(ModItems.DEEP_PURPLE_DIAMOND_SWORD, 0);
        registerModel(ModItems.FIRE_RED_DIAMOND_SWORD, 0);
        registerModel(ModItems.OCEAN_BLUE_DIAMOND_SWORD, 0);
        registerModel(ModItems.ORANGE_DIAMOND_SWORD, 0);
        registerModel(ModItems.PURPLE_DIAMOND_SWORD, 0);
        registerModel(ModItems.RED_DIAMOND_SWORD, 0);
        registerModel(ModItems.SKY_BLUE_DIAMOND_SWORD, 0);
        registerModel(ModItems.YELLOW_DIAMOND_SWORD, 0);
        registerModel(ModItems.GRAY_DIAMOND_SWORD, 0);
        registerModel(ModItems.BLACK_DIAMOND_SWORD, 0);
        registerModel(ModItems.WHITE_DIAMOND_SWORD, 0);
    }

    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory"));
    }

}
