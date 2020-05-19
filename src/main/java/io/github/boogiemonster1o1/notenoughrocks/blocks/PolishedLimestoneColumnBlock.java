package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.POLISHED_LIMESTONE_COLUMN;
import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy;
import static net.minecraft.block.Blocks.STONE_SLAB;

public class PolishedLimestoneColumnBlock extends ColumnBlock{

    public PolishedLimestoneColumnBlock() {
        super(copy(STONE_SLAB));
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        BlockPos belowPos = pos.down(1);
        BlockPos abovePos = pos.up(1);
        BlockState belowState = world.getBlockState(belowPos);
        BlockState aboveState = world.getBlockState(abovePos);
        Block belowBlock = belowState.getBlock();
        Block aboveBlock = aboveState.getBlock();
        if(belowBlock == POLISHED_LIMESTONE_COLUMN && aboveBlock == POLISHED_LIMESTONE_COLUMN){
            return state.with(TYPE,2);
        }
        else if(belowBlock == POLISHED_LIMESTONE_COLUMN && aboveBlock!=POLISHED_LIMESTONE_COLUMN){
            return state.with(TYPE,3);
        }
        else if(belowBlock != POLISHED_LIMESTONE_COLUMN && aboveBlock==POLISHED_LIMESTONE_COLUMN){
            return state.with(TYPE,1);
        }
        else{
            return state.with(TYPE,0);
        }
    }
}
