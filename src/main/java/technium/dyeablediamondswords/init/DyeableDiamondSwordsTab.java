package technium.dyeablediamondswords.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import technium.dyeablediamondswords.DyeableDiamondSwords;

import java.util.function.Supplier;

public class DyeableDiamondSwordsTab {

    public static final ItemGroup MOD_ITEM_GROUP = new DyeableDiamondSwordsTabMain(DyeableDiamondSwords.MODID, () -> new ItemStack(DyeableDiamondSwordsItems.PINK_DIAMOND_SWORD));

    public static class DyeableDiamondSwordsTabMain extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public DyeableDiamondSwordsTabMain(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    }

}
