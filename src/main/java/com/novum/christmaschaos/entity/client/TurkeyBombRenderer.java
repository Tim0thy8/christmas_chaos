package com.novum.christmaschaos.entity.client;

import com.novum.christmaschaos.ChristmasChaos;
import com.novum.christmaschaos.entity.custom.TurkeyEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;

public class TurkeyBombRenderer extends EntityRenderer<TurkeyEntity> {
    private static final Identifier TEXTURE = new Identifier(ChristmasChaos.MOD_ID, "textures/entity/turkeybomb.png");
    public TurkeyBombRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(TurkeyEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(TurkeyEntity entity, float yaw, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }
}
