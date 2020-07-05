package com.memzjjy.moregems;

import com.memzjjy.moregems.block.MiraculousBlockReg;
import com.memzjjy.moregems.coloredeggs.ZhanghaoyangBlockReg;
import com.memzjjy.moregems.item.MiraculousGemAppleReg;
import com.memzjjy.moregems.item.MiraculousGemReg;
import com.memzjjy.moregems.item.MiraculousGemSwordReg;
import com.memzjjy.moregems.item.RainbowSwordReg;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moregems")
public class Moregems {
    public Moregems() {
        MiraculousGemReg.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MiraculousGemAppleReg.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MiraculousGemSwordReg.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        RainbowSwordReg.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MiraculousBlockReg.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ZhanghaoyangBlockReg.BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
/*
by:MEMZJJY
Developers:MEMZJJY
jvav nb
 */
