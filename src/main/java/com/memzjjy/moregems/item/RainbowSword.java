package com.memzjjy.moregems.item;


import com.memzjjy.moregems.group.MoregemsGroupReg;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class RainbowSword extends SwordItem {
    private static IItemTier iItemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2000;
        }

        @Override
        public float getEfficiency() {
            return 10.0F;
        }

        @Override
        public float getAttackDamage() {
            return 4.0F;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(MiraculousGemReg.miraculousGem.get());
        }
    };

    public RainbowSword() {
        super(iItemTier, 2147483645, -2.4F, new Properties().group(MoregemsGroupReg.moregemsGroup));
    }
}
//啦啦啦
