package com.memzjjy.moregems.item;

import com.memzjjy.moregems.group.MoregemsGroupReg;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MiraculousGemApple extends Item {
    private static EffectInstance effectInstance = new EffectInstance(Effects.POISON, 600 * 20, 1);
    private static Food food = (new Food.Builder())
            .saturation(10)
            .hunger(20)
            .effect(effectInstance, 1)
            .build();

    public MiraculousGemApple() {
        super(new Properties().group(MoregemsGroupReg.moregemsGroup));
    }
}



