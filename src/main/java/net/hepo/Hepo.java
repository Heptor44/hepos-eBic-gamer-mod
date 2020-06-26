package net.hepo;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Hepo implements ModInitializer{

    public static final Item FABRIC_ITEM = new bruh(new Item.Settings().group(ItemGroup.MISC)) ;


    @Override
    public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("hepo", "bruh"), FABRIC_ITEM);
    }
}