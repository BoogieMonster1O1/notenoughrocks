package io.github.boogiemonster1o1.notenoughrocks.mixin;

import io.github.boogiemonster1o1.notenoughrocks.Elements;
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

import static io.github.boogiemonster1o1.notenoughrocks.Elements.BlockS.CRUSHED_LIMESTONE;
import static net.minecraft.block.Blocks.*;

@Mixin(DeadBushBlock.class)
public class DeadBushBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At(value = "INVOKE",ordinal = 0,target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;"),cancellable = true)
    public void plantOnCrushedLimestone(BlockState floor, BlockView view, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        Block block1 = floor.getBlock();
        cir.setReturnValue(block1 == CRUSHED_LIMESTONE || block1 == SAND || block1 == RED_SAND || block1 == TERRACOTTA || block1 == WHITE_TERRACOTTA || block1 == ORANGE_TERRACOTTA || block1 == MAGENTA_TERRACOTTA || block1 == LIGHT_BLUE_TERRACOTTA || block1 == YELLOW_TERRACOTTA || block1 == LIME_TERRACOTTA || block1 == PINK_TERRACOTTA || block1 == GRAY_TERRACOTTA || block1 == LIGHT_GRAY_TERRACOTTA || block1 == CYAN_TERRACOTTA || block1 == PURPLE_TERRACOTTA || block1 == BLUE_TERRACOTTA || block1 == BROWN_TERRACOTTA || block1 == GREEN_TERRACOTTA || block1 == RED_TERRACOTTA || block1 == BLACK_TERRACOTTA || block1 == DIRT || block1 == COARSE_DIRT || block1 == PODZOL);
        if(true){
            cir.cancel();
        }
    }
}
