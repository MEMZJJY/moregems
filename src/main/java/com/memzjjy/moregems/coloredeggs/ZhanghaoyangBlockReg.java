package com.memzjjy.moregems.coloredeggs;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ZhanghaoyangBlockReg {
    public static final DeferredRegister<Block> BLOCK = new DeferredRegister<>(ForgeRegistries.BLOCKS,"moregems");
    public static RegistryObject<Block> zhanghaoyangBlock = BLOCK.register("zhanghaoyang_block",() ->{
        return new ZhanghaoyangBlock();
    });
}
