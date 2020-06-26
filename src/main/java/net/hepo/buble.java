package net.hepo;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class buble extends Block {

    public buble() {
        super(FabricBlockSettings.of(Material.EGG).sounds(BlockSoundGroup.NETHER_WART).breakInstantly().nonOpaque().slipperiness(2).strength(0,0));
    }
}
