package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.IWorld;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy;
import static net.minecraft.block.Blocks.STONE_SLAB;

public class PolishedDioriteColumnBlock extends ColumnBlock{
    public PolishedDioriteColumnBlock() {
        super(copy(STONE_SLAB));
    }

    public static IntProperty TYPE = IntProperty.of("type",0,3);

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        BlockPos belowPos = pos.down(1);
        BlockPos abovePos = pos.up(1);
        BlockState belowState = world.getBlockState(belowPos);
        BlockState aboveState = world.getBlockState(abovePos);
        Block belowBlock = belowState.getBlock();
        Block aboveBlock = aboveState.getBlock();
        if(BlockTags.getContainer().getOrCreate(COLUMNS).contains(belowBlock) && BlockTags.getContainer().getOrCreate(COLUMNS).contains(aboveBlock)){
            return state.with(TYPE,2);
        }
        else if(BlockTags.getContainer().getOrCreate(COLUMNS).contains(belowBlock) && (!BlockTags.getContainer().getOrCreate(COLUMNS).contains(aboveBlock))){
            return state.with(TYPE,3);
        }
        else if(!(BlockTags.getContainer().getOrCreate(COLUMNS).contains(belowBlock)) && BlockTags.getContainer().getOrCreate(COLUMNS).contains(aboveBlock)){
            return state.with(TYPE,1);
        }
        else{
            return state.with(TYPE,0);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE);
    }
}