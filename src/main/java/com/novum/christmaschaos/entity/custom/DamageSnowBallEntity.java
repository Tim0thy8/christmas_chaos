package com.novum.christmaschaos.entity.custom;

import com.novum.christmaschaos.entity.ModEntities;
import com.novum.christmaschaos.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class DamageSnowBallEntity extends ThrownItemEntity {
    public DamageSnowBallEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public DamageSnowBallEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.DAMAGE_SNOWBALL, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.DAMAGE_SNOWBALL;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        Entity targetEntity = entityHitResult.getEntity();

        if (targetEntity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity) targetEntity;
            Entity entity = entityHitResult.getEntity();

            // Apply damage to the living entity (player or other mobs)
            entity.damage(this.getDamageSources().thrown(this, this.getOwner()), 5);
        }

        super.onEntityHit(entityHitResult);
    }
}
