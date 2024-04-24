package appeng.items.tools.fluix;

import java.util.List;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;

import appeng.core.localization.GuiText;
import appeng.hooks.IntrinsicEnchantItem;

public class FluixSpadeItem extends ShovelItem implements IntrinsicEnchantItem {
    public FluixSpadeItem(Properties props) {
        super(FluixToolType.FLUIX.getToolTier(),
                props.attributes(createAttributes(FluixToolType.FLUIX.getToolTier(), 1.5F, -3.0F)));
    }

    @Override
    public int getIntrinsicEnchantLevel(ItemStack stack, Enchantment enchantment) {
        return enchantment == Enchantments.FORTUNE ? 1 : 0;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents,
            TooltipFlag isAdvanced) {
        tooltipComponents.add(GuiText.IntrinsicEnchant.text(Enchantments.FORTUNE.getFullname(1)));
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
