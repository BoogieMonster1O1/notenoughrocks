package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.EntityContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class SmoothColumnBlock extends Block implements Waterloggable {
    public static Identifier COLUMNS = new Identifier("minecraft","columns");

    public SmoothColumnBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityContext) {
        return cuboid(0.25F,0,0.25F,0.75F,1,0.75F);
    }
}
