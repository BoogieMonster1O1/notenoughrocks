package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class ColumnBlock extends Block {
    public static Identifier COLUMNS = new Identifier("minecraft","columns");

    public ColumnBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return cuboid(0.3125F,0,0.3125F,0.6875F,1,0.6875F);
    }
}
