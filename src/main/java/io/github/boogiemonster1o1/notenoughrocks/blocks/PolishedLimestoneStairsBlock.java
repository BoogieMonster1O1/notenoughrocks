package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.POLISHED_LIMESTONE;
import static net.minecraft.block.AbstractBlock.Settings.copy;

public class PolishedLimestoneStairsBlock extends StairsBlock {
    public PolishedLimestoneStairsBlock() {
        super(POLISHED_LIMESTONE.getDefaultState(), copy(Blocks.STONE_STAIRS));
    }
}
