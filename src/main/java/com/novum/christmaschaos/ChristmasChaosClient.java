package com.novum.christmaschaos;

import com.novum.christmaschaos.entity.ModEntities;
import com.novum.christmaschaos.entity.client.ModModelLayers;
import com.novum.christmaschaos.entity.client.TurkeyBombEntity;
import com.novum.christmaschaos.entity.client.TurkeyBombRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class ChristmasChaosClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.ORNAMENT_GRENADE, FlyingItemEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.DAMAGE_SNOWBALL, FlyingItemEntityRenderer::new);

        EntityRendererRegistry.register(ModEntities.TURKEY_BOMB, TurkeyBombRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.TURKEY_BOMB, TurkeyBombEntity::getTexturedModelData);
    }
}
