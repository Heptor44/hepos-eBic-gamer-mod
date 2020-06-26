package net.hepo;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Hepo implements ModInitializer{

    public static final Item FABRIC_ITEM = new bruh(new Item.Settings().group(ItemGroup.MISC)) ;
    public static final Block FABRIC_BLOCK = new buble(FabricBlockSettings.of(Material.EGG).sounds(BlockSoundGroup.NETHER_WART).breakInstantly().nonOpaque().slipperiness(1).strength(0,0));

    @Override
    public void onInitialize() {
    Registry.register(Registry.ITEM, new Identifier("hepo", "bruh"), FABRIC_ITEM);
    Registry.register(Registry.ITEM, new Identifier("hepo", "buble"), new BlockItem(FABRIC_BLOCK, new Item.Settings().group(ItemGroup.MISC)));
    Registry.register(Registry.BLOCK, new Identifier("hepo", "buble"), FABRIC_BLOCK);
    }
}