package com.memzjjy.moregems.block;

import com.memzjjy.moregems.group.MoregemsGroupReg;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiraculousBlockItemReg {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "moregems");
    public static RegistryObject<Item> miraculousBlock = ITEMS.register("miraculous_block", () -> {
        return new BlockItem(MiraculousBlockReg.miraculousBlock.get(), new Item.Properties().group(MoregemsGroupReg.moregemsGroup));
    });
}
