package technium.dyeablediamondswords;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = DyeableDiamondSwords.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "dark_purple_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "dark_purple_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "deep_blue_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "deep_blue_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "deep_purple_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "deep_purple_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "fire_red_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "fire_red_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "ocean_blue_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "ocean_blue_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "orange_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "orange_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "purple_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "purple_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "red_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "red_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "sky_blue_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "sky_blue_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "yellow_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "yellow_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "gray_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "gray_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "black_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "black_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB),
                new ItemSword(Item.ToolMaterial.DIAMOND).setRegistryName(DyeableDiamondSwords.MODID, "white_diamond_sword").setTranslationKey(DyeableDiamondSwords.MODID + "." + "white_diamond_sword").setCreativeTab(DyeableDiamondSwords.DYEABLE_DIAMOND_SWORDS_TAB)
        };

        event.getRegistry().registerAll(items);
    }

}
