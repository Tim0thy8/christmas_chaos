package com.novum.christmaschaos.block.custom;

import com.novum.christmaschaos.item.ModItems;
import com.novum.christmaschaos.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.realms.dto.PlayerInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

import java.util.Timer;
import java.util.TimerTask;

public class SnowMineBlock extends Block {
    public SnowMineBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {

        world.removeBlock(pos, false);
        world.createExplosion(null, pos.getX(), pos.getY() + 1, pos.getZ(), 3f, World.ExplosionSourceType.MOB);

        super.onSteppedOn(world, pos, state, entity);

    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        Item mainHand = player.getMainHandStack().getItem();
        if (mainHand == ModItems.DEFUSER) {
            world.playSound(null, pos, SoundEvents.BLOCK_AMETHYST_BLOCK_HIT, SoundCategory.BLOCKS, 2f, 1f);
        } else {
            world.createExplosion(null, pos.getX(), pos.getY() + 1, pos.getZ(), 3f, World.ExplosionSourceType.MOB);
        }
        super.onBreak(world, pos, state, player);
    }

    @Override
    public void onDestroyedByExplosion(World world, BlockPos pos, Explosion explosion) {

        world.createExplosion(null, pos.getX(), pos.getY() + 1, pos.getZ(), 3f, World.ExplosionSourceType.MOB);

        super.onDestroyedByExplosion(world, pos, explosion);
    }
}