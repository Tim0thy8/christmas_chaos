package com.novum.christmaschaos.item.custom;

import com.novum.christmaschaos.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stat;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CandyCaneItem extends SwordItem {
    public CandyCaneItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 75, 1));

        return super.postHit(stack, target, attacker);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {

        world.playSound(null, BlockPos.ofFloored(user.getPos()), ModSounds.CANDY_CANE_LICKED, SoundCategory.PLAYERS, 2f, 1f);

        user.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100, 1));
        user.getItemCooldownManager().set(this, 400);

        new java.util.Timer().schedule(
                new java.util.TimerTask() {

                    @Override
                    public void run() {
                        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200,5));
                    }
                },
                5000
        );

        return super.use(world, user, hand);
    }
}
