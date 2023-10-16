package consular.revoted.entity.client;

import consular.revoted.entity.CrabEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class CrabModel<T extends CrabEntity> extends SinglePartEntityModel<T> {
	private final ModelPart body;
	private final ModelPart legs;
	private final ModelPart claws;
	private final ModelPart head;

	public CrabModel(ModelPart root) {
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.claws = root.getChild("claws");
		this.head = body;
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData body = modelPartData.addChild("body", ModelPartBuilder.create().uv(4, 4).cuboid(-2.0F, -5.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 4).cuboid(1.0F, -5.0F, -5.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-5.0F, -6.0F, -4.0F, 10.0F, 4.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData eyes = body.addChild("eyes", ModelPartBuilder.create().uv(19, 12).cuboid(2.0F, -7.425F, -4.125F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F))
		.uv(15, 12).cuboid(-4.0F, -7.425F, -4.125F, 2.0F, 2.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leftLegs = legs.addChild("leftLegs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r1 = leftLegs.addChild("cube_r1", ModelPartBuilder.create().uv(0, 25).cuboid(4.925F, 1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0167F, -0.1149F, -0.8123F));

		ModelPartData cube_r2 = leftLegs.addChild("cube_r2", ModelPartBuilder.create().uv(0, 25).cuboid(4.75F, 1.225F, -3.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1578F, -0.1149F, -0.8123F));

		ModelPartData cube_r3 = leftLegs.addChild("cube_r3", ModelPartBuilder.create().uv(0, 25).cuboid(5.0F, 1.0F, 1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1476F, -0.1149F, -0.8123F));

		ModelPartData rightLegs = legs.addChild("rightLegs", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		ModelPartData cube_r4 = rightLegs.addChild("cube_r4", ModelPartBuilder.create().uv(0, 25).cuboid(4.925F, 1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0167F, -0.1149F, -0.8123F));

		ModelPartData cube_r5 = rightLegs.addChild("cube_r5", ModelPartBuilder.create().uv(0, 25).cuboid(4.75F, 1.225F, -3.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.1578F, -0.1149F, -0.8123F));

		ModelPartData cube_r6 = rightLegs.addChild("cube_r6", ModelPartBuilder.create().uv(0, 25).cuboid(5.0F, 1.0F, 1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.1476F, -0.1149F, -0.8123F));

		ModelPartData claws = modelPartData.addChild("claws", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData leftClaw = claws.addChild("leftClaw", ModelPartBuilder.create().uv(11, 15).cuboid(-1.75F, -1.0F, -2.5F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F))
		.uv(0, 12).cuboid(-1.75F, -3.0F, -2.5F, 3.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(4.75F, -3.0F, -6.5F, -0.1634F, 0.5457F, -0.3076F));

		ModelPartData rightClaw = claws.addChild("rightClaw", ModelPartBuilder.create(), ModelTransform.pivot(-3.5F, -3.0F, -5.0F));

		ModelPartData cube_r7 = rightClaw.addChild("cube_r7", ModelPartBuilder.create().uv(4, 27).cuboid(-2.25F, -1.25F, -0.625F, 4.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0372F, 0.5026F, 0.449F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(CrabEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		body.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		legs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		claws.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
	@Override
	public ModelPart getPart() {
		return body;
	}
}