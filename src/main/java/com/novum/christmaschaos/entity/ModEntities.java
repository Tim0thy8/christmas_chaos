package com.novum.christmaschaos.entity;

import com.novum.christmaschaos.ChristmasChaos;
import com.novum.christmaschaos.entity.custom.DamageSnowBallEntity;
import com.novum.christmaschaos.entity.custom.GrenadeEntity;
import com.novum.christmaschaos.entity.custom.TurkeyEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<GrenadeEntity> ORNAMENT_GRENADE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ChristmasChaos.MOD_ID, "ornament_grenade"), FabricEntityTypeBuilder.<GrenadeEntity>create(SpawnGroup.MISC, GrenadeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<DamageSnowBallEntity> DAMAGE_SNOWBALL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ChristmasChaos.MOD_ID, "damage_snowball"), FabricEntityTypeBuilder.<DamageSnowBallEntity>create(SpawnGroup.MISC, DamageSnowBallEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());

    public static final EntityType<TurkeyEntity> TURKEY_BOMB = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(ChristmasChaos.MOD_ID, "turkeybomb"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, TurkeyEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
}
