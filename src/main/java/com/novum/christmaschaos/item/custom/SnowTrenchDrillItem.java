package com.novum.christmaschaos.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SnowBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SnowTrenchDrillItem extends ShovelItem {
    public SnowTrenchDrillItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {

        if (isSnow(state)) {
            world.breakBlock(pos.down(1), true);
            world.breakBlock(pos.west(1), true);
            world.breakBlock(pos.down(1).west(1), true);
            world.breakBlock(pos.down(1).west(1).south(1), true);
            world.breakBlock(pos.down(1).west(1).south(2), true);
            world.breakBlock(pos.down(1).west(1).south(3), true);
            world.breakBlock(pos.down(1).west(1).south(4), true);
            world.breakBlock(pos.down(1).west(1).south(5), true);
            world.breakBlock(pos.down(1).west(1).south(6), true);
            world.breakBlock(pos.south(1), true);
            world.breakBlock(pos.south(2), true);
            world.breakBlock(pos.south(3), true);
            world.breakBlock(pos.south(4), true);
            world.breakBlock(pos.south(5), true);
            world.breakBlock(pos.south(6), true);
            world.breakBlock(pos.south(1).down(1), true);
            world.breakBlock(pos.south(2).down(1), true);
            world.breakBlock(pos.south(3).down(1), true);
            world.breakBlock(pos.south(4).down(1), true);
            world.breakBlock(pos.south(5).down(1), true);
            world.breakBlock(pos.south(6).down(1), true);
            world.breakBlock(pos.south(1).west(1), true);
            world.breakBlock(pos.south(2).west(1), true);
            world.breakBlock(pos.south(3).west(1), true);
            world.breakBlock(pos.south(4).west(1), true);
            world.breakBlock(pos.south(5).west(1), true);
            world.breakBlock(pos.south(6).west(1), true);
        }

        return super.postMine(stack, world, state, pos, miner);
    }

    private boolean isSnow(BlockState state) {
        return state.isOf(Blocks.SNOW_BLOCK) || state.isOf(Blocks.SNOW);
    }
}
