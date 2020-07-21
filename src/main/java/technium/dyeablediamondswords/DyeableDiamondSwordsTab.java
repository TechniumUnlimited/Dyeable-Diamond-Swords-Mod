package technium.dyeablediamondswords;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import technium.dyeablediamondswords.init.ModItems;

public class DyeableDiamondSwordsTab extends CreativeTabs {

    public DyeableDiamondSwordsTab() {
        super(DyeableDiamondSwords.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(ModItems.FIRE_RED_DIAMOND_SWORD);
    }

}
