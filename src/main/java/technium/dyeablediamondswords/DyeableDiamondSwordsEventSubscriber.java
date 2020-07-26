package technium.dyeablediamondswords;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;
import technium.dyeablediamondswords.init.DyeableDiamondSwordsTab;

@EventBusSubscriber(modid = DyeableDiamondSwords.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class DyeableDiamondSwordsEventSubscriber {

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "pink_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "deep_blue_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "deep_purple_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "fire_red_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "ocean_blue_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "orange_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "purple_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "red_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "sky_blue_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "yellow_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "gray_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "black_diamond_sword"),
                setup(new SwordItem(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(DyeableDiamondSwordsTab.MOD_ITEM_GROUP)), "white_diamond_sword")
        );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(DyeableDiamondSwords.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

}
