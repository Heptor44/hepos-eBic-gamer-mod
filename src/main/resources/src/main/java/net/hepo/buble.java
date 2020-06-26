package net.hepo;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityContext;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class buble extends Block {

    public buble(FabricBlockSettings strength) {
        super(FabricBlockSettings.of(Material.EGG).sounds(BlockSoundGroup.NETHER_WART).breakInstantly().nonOpaque().slipperiness(1.1f).strength(0,0));
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext ctx) {
        return VoxelShapes.union(VoxelShapes.cuboid(0.0625f, 0.0625f, 0f, 0.9375f, 0.9375f, 1), VoxelShapes.cuboid(0f, 0.0625, 0.0625f, 1, 0.9375f, 0.9375f), VoxelShapes.cuboid(0.0625f, 0, 0.0625f, 0.9375f, 1, 0.9375f));
    }
}
