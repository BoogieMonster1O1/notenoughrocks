package io.github.boogiemonster1o1.notenoughrocks.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;

public class CrushedLimestoneBlock extends FallingBlock {
    public CrushedLimestoneBlock() {
        super(FabricBlockSettings.of(Material.SAND).resistance(2f).hardness(0.2f).breakByTool(FabricToolTags.SHOVELS));
    }
}
