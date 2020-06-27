package com.memzjjy.moregems.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RainbowSwordReg {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "moregems");
    public static RegistryObject<Item> rainbowSword = ITEMS.register("rainbow_sword", () -> {
        return new RainbowSword();
    });
}