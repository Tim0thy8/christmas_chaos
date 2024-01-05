package com.novum.christmaschaos.entity.client;

import com.novum.christmaschaos.entity.custom.TurkeyEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;


public class TurkeyBombEntity<T extends TurkeyEntity> extends SinglePartEntityModel<T> {
	private final ModelPart TurkeyBomb;

	public TurkeyBombEntity(ModelPart root, ModelPart plate, ModelPart rim3R1, ModelPart turkey, ModelPart cubeR1) {
		this.TurkeyBomb = root.getChild("turkeybomb");
	}

	public TurkeyBombEntity(ModelPart part, ModelPart turkeyBomb) {
		TurkeyBomb = turkeyBomb;
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData PresentBomb = modelPartData.addChild("PresentBomb", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Plate = PresentBomb.addChild("Plate", ModelPartBuilder.create().uv(11, 55).cuboid(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 8.0F, new Dilation(0.0F))
		.uv(44, 24).cuboid(-5.0F, -2.0F, -4.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F))
		.uv(44, 54).cuboid(4.0F, -2.0F, -5.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Rim3_r1 = Plate.addChild("Rim3_r1", ModelPartBuilder.create().uv(44, 44).cuboid(-5.0F, -2.0F, -4.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F))
		.uv(44, 34).cuboid(4.0F, -2.0F, -5.0F, 1.0F, 0.0F, 9.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData Turkey = PresentBomb.addChild("Turkey", ModelPartBuilder.create().uv(1, 8).cuboid(-2.9F, -8.0F, -3.4F, 5.9F, 5.9F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = Turkey.addChild("cube_r1", ModelPartBuilder.create().uv(1, 0).cuboid(-3.9F, -8.0F, -7.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(9, 4).cuboid(3.0F, -5.0F, -7.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(16, 4).cuboid(-3.9F, -5.0F, -7.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(3, 12).cuboid(-3.6F, -6.0F, -6.5F, 0.7F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(14, 0).cuboid(3.0F, -6.0F, -6.5F, 0.7F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(1, 5).cuboid(3.0F, -8.0F, -7.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, 0.0F, -0.6109F, 0.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(TurkeyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		TurkeyBomb.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return TurkeyBomb;
	}
}