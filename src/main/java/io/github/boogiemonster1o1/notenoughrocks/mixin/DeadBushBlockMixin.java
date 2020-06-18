package io.github.boogiemonster1o1.notenoughrocks.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DeadBushBlock.class)
public class DeadBushBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At(value = "INVOKE",ordinal = 0,target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;"),cancellable = true)
    public void plantOnCrushedLimestone(BlockState floor, BlockView view, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        Block block1 = floor.getBlock();
        cir.setReturnValue(block1 == Blocks.SAND || block1 == Blocks.RED_SAND || block1 == Blocks.TERRACOTTA || block1 == Blocks.WHITE_TERRACOTTA || block1 == Blocks.ORANGE_TERRACOTTA || block1 == Blocks.MAGENTA_TERRACOTTA || block1 == Blocks.LIGHT_BLUE_TERRACOTTA || block1 == Blocks.YELLOW_TERRACOTTA || block1 == Blocks.LIME_TERRACOTTA || block1 == Blocks.PINK_TERRACOTTA || block1 == Blocks.GRAY_TERRACOTTA || block1 == Blocks.LIGHT_GRAY_TERRACOTTA || block1 == Blocks.CYAN_TERRACOTTA || block1 == Blocks.PURPLE_TERRACOTTA || block1 == Blocks.BLUE_TERRACOTTA || block1 == Blocks.BROWN_TERRACOTTA || block1 == Blocks.GREEN_TERRACOTTA || block1 == Blocks.RED_TERRACOTTA || block1 == Blocks.BLACK_TERRACOTTA || block1 == Blocks.DIRT || block1 == Blocks.COARSE_DIRT || block1 == Blocks.PODZOL);
        if(true){
            cir.cancel();
        }
    }
}
