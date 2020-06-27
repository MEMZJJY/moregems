package com.memzjjy.moregems.block;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiraculousBlockReg {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "moregems");
    public static RegistryObject<Block> miraculousBlock = BLOCKS.register("miraculous_block", () -> {
        return new MiraculousBlock();
    });
}