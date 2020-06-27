package com.memzjjy.moregems.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MiraculousGemAppleReg {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "moregems");
    public static RegistryObject<Item> miraculousGemApple = ITEMS.register("miraculous_gem_apple", () -> {
        return new MiraculousGemApple();
    });
}