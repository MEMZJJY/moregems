package com.memzjjy.moregems.coloredeggs;


import com.memzjjy.moregems.group.MoregemsGroupReg;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ZhanghaoyangBlockItem {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "moregems");
    public static RegistryObject<Item> zhanghaoyangBlockItem= ITEMS.register("zhanghaoyang_block_item", () -> {
        return new BlockItem(ZhanghaoyangBlockReg.zhanghaoyangBlock.get(), new Item.Properties().group(MoregemsGroupReg.moregemsGroup));
    });
}





