package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.MARBLE;
import static net.minecraft.block.AbstractBlock.Settings.copy;
import static net.minecraft.block.Blocks.STONE_STAIRS;

public class MarbleStairsBlock extends StairsBlock {
    public MarbleStairsBlock() {
        super(MARBLE.getDefaultState(), copy(STONE_STAIRS));
    }
}
