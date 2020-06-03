package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.IWorld;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy;
import static net.minecraft.block.Blocks.STONE_SLAB;

public class SmoothMarbleColumnBlock extends SmoothColumnBlock {

    private static final IntProperty TYPE = IntProperty.of("type", 0, 3);

    public SmoothMarbleColumnBlock() {
        super(copy(STONE_SLAB));
        BlockState state = this.stateManager.getDefaultState().with(WATERLOGGED, false).with(TYPE, 0);
        this.setDefaultState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        BlockPos belowPos = pos.down(1);
        BlockPos abovePos = pos.up(1);
        BlockState belowState = world.getBlockState(belowPos);
        BlockState aboveState = world.getBlockState(abovePos);
        Block belowBlock = belowState.getBlock();
        Block aboveBlock = aboveState.getBlock();
        BlockState nextState;
        Boolean belowBlockIs = BlockTags.getContainer().getOrCreate(COLUMNS).contains(belowBlock);
        Boolean aboveBlockIs = BlockTags.getContainer().getOrCreate(COLUMNS).contains(aboveBlock);
        if (belowBlockIs && aboveBlockIs) {
            nextState = state.with(TYPE, 2);
        } else if (belowBlockIs && !aboveBlockIs) {
            nextState = state.with(TYPE, 3);
        } else if (!belowBlockIs && aboveBlockIs) {
            nextState = state.with(TYPE, 1);
        } else {
            nextState = state.with(TYPE, 0);
        }
        return nextState;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE, WATERLOGGED);
    }

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }
}
