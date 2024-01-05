package com.novum.christmaschaos.block.custom;

import com.novum.christmaschaos.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SantaFlagBlock extends Block {
    public SantaFlagBlock(Settings settings) {
        super(settings);
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        replace(state, ModBlocks.ELF_FLAG.getDefaultState(), world, pos, 1);

        return ActionResult.SUCCESS;
    }
}
