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
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.IWorld;

import static net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings.copy;
import static net.minecraft.block.BlockRenderType.MODEL;
import static net.minecraft.block.Blocks.STONE_SLAB;
import static net.minecraft.util.shape.VoxelShapes.cuboid;

public class BulkColumnBlock extends Block implements Waterloggable {

    public static Identifier COLUMNS = new Identifier("minecraft", "columns");

    public BulkColumnBlock() {
        super(copy(STONE_SLAB));
        this.setDefaultState(this.stateManager.getDefaultState().with(WATERLOGGED, false).with(TYPE, Type.SINGLE));
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return MODEL;
    }

    @Override
    public VoxelShape getOutlineShape(BlockState blockState, BlockView blockView, BlockPos blockPos, EntityContext entityContext) {
        return cuboid(0.3125F, 0, 0.3125F, 0.6875F, 1, 0.6875F);
    }

    public static final EnumProperty<Type> TYPE = EnumProperty.of("type", Type.class);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE, WATERLOGGED);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction facing, BlockState neighborState, IWorld world, BlockPos pos, BlockPos neighborPos) {
        BlockPos belowPos = pos.down(1);
        BlockPos abovePos = pos.up(1);
        BlockState belowState = world.getBlockState(belowPos);
        BlockState aboveState = world.getBlockState(abovePos);
        Block belowBlock = belowState.getBlock();
        Block aboveBlock = aboveState.getBlock();
        boolean isAbove = BlockTags.getContainer().getOrCreate(COLUMNS).contains(aboveBlock);
        boolean isBelow = BlockTags.getContainer().getOrCreate(COLUMNS).contains(belowBlock);
        if (isAbove && isBelow) {
            return state.with(TYPE, Type.MIDDLE);
        } else if (!isAbove && isBelow) {
            return state.with(TYPE, Type.TOP);
        } else if (isAbove && !isBelow) {
            return state.with(TYPE, Type.BOTTOM);
        } else {
            return state.with(TYPE, Type.SINGLE);
        }
    }

    enum Type implements StringIdentifiable {
        SINGLE("single"),
        TOP("top"),
        BOTTOM("bottom"),
        MIDDLE("middle");
        private final String name;

        Type(String name) {
            this.name = name;
        }

        @Override
        public String asString() {
            return this.name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
