package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.entity.EntityContext;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class TileBlock extends Block implements Waterloggable {
    public TileBlock(Settings settings) {
        super(settings);
    }

    public static Identifier TILES = new Identifier("minecraft","tiles");

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityContext) {
        return cuboid(0,0,0,1,0.125F,1);
    }
    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(WATERLOGGED);
    }
}
