package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class TileBlock extends Block {
    public TileBlock(Settings settings) {
        super(settings);
    }

    public static Identifier TILES = new Identifier("minecraft","tiles");

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityContext) {
        return cuboid(0,0,0,1,0.125F,1);
    }
}
