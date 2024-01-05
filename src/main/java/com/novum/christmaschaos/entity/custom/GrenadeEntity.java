package com.novum.christmaschaos.entity.custom;

import com.novum.christmaschaos.entity.ModEntities;
import com.novum.christmaschaos.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class GrenadeEntity extends ThrownItemEntity {
    public GrenadeEntity(EntityType<? extends ThrownItemEntity> entityType, World world) {
        super(entityType, world);
    }

    public GrenadeEntity(LivingEntity livingEntity, World world) {
        super(ModEntities.ORNAMENT_GRENADE, livingEntity, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.ORNAMENT_GRENADE;
    }

    @Override
    public Packet<ClientPlayPacketListener> createSpawnPacket() {
        return new EntitySpawnS2CPacket(this);
    }

    @Override
    protected void onBlockHit(BlockHitResult blockHitResult) {
        this.getWorld().sendEntityStatus(this, (byte)3);
        this.getWorld().createExplosion(this, getBlockX(), getBlockY(), getBlockZ(), 2f, World.ExplosionSourceType.MOB);
        this.discard();
        super.onBlockHit(blockHitResult);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        this.getWorld().sendEntityStatus(this, (byte)3);
        this.getWorld().createExplosion(this, getBlockX(), getBlockY(), getBlockZ(), 2f, World.ExplosionSourceType.MOB);
        this.discard();
        super.onEntityHit(entityHitResult);
    }
}
