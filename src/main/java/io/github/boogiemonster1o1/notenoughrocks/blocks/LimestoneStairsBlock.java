package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;
import static net.minecraft.block.AbstractBlock.Settings.copy;

public class LimestoneStairsBlock extends StairsBlock {
    public LimestoneStairsBlock() {
        super(LIMESTONE_BLOCK.getDefaultState(), copy(Blocks.STONE_STAIRS));
    }
}
