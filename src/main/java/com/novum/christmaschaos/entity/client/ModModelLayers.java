package com.novum.christmaschaos.entity.client;

import com.novum.christmaschaos.ChristmasChaos;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer TURKEY_BOMB =
            new EntityModelLayer(new Identifier(ChristmasChaos.MOD_ID, "turkeybomb"), "main");
}
