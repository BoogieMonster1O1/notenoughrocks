package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.entity.EntityContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.BooleanBiFunction;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import static net.minecraft.block.Block.Settings.copy;
import static net.minecraft.block.Blocks.STONECUTTER;

public class AdvancedStonecutterBlock extends StonecutterBlock {
    public static final VoxelShape BOTTOM;
    public static final VoxelShape SIDE;
    public static final VoxelShape COMBINED;

    static {
        BOTTOM = createCuboidShape(0.125, 0, 0.125, 0.875, 0.125, 0.875);
        SIDE = createCuboidShape(0.125, 0.125, 0.125, 0.25, 0.625, 0.875);
        COMBINED = VoxelShapes.combineAndSimplify(BOTTOM, SIDE, BooleanBiFunction.ONLY_FIRST);
    }

    public AdvancedStonecutterBlock() {
        super(copy(STONECUTTER));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.isClient)
            return ActionResult.SUCCESS;
        else {
            player.openContainer(state.createContainerFactory(world, pos));
            return ActionResult.SUCCESS;
        }
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, EntityContext context) {
        return COMBINED;
    }

}
