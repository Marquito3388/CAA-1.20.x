package net.marquito.caa.item.custom;

import net.marquito.caa.util.CAATag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.minecraft.world.level.block.Block;

public class DrillItem extends DiggerItem implements Vanishable {

    public DrillItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, CAATag.Blocks.DRILL_MINABLE, pProperties);
    }
}
