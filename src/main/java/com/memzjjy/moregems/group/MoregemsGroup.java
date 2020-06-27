package com.memzjjy.moregems.group;

import com.memzjjy.moregems.item.MiraculousGemReg;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MoregemsGroup extends ItemGroup {
    public MoregemsGroup() {
        super("moregem_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(MiraculousGemReg.miraculousGem.get());
    }
}