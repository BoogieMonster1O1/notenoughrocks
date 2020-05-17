package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.LIMESTONE_BLOCK;

public class LimestoneStairsBlock extends StairsBlock {
    protected LimestoneStairsBlock() {
        super(LIMESTONE_BLOCK.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_STAIRS));
    }
}
