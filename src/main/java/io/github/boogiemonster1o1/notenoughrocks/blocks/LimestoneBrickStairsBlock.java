package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BRICKS;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.STONE_STAIRS;

public class LimestoneBrickStairsBlock extends StairsBlock {
    public LimestoneBrickStairsBlock() {
        super(LIMESTONE_BRICKS.getDefaultState(), copy(STONE_STAIRS));
    }
}
