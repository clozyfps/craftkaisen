package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelprisonrealmseal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "modelprisonrealmseal"), "main");
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart Body;

	public Modelprisonrealmseal(ModelPart root) {
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(0.0385F, 3.1404F, 9.1631F));
		PartDefinition cube_r1 = RightArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 66).addBox(7.9232F, -2.105F, -20.1092F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 24).addBox(7.9232F, -0.105F, -16.1092F, 4.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7499F, 1.0339F, 2.2789F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(17.2342F, 9.338F, -1.1158F));
		PartDefinition cube_r2 = LeftArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 42).addBox(-1.0F, -6.0F, -4.25F, 4.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(60, 60).addBox(-1.0F, -8.0F, -8.25F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7626F, -1.5277F, -1.0322F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(-2.786F, 6.0F, -2.3213F));
		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(26, 48).addBox(-1.0F, -2.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 24).addBox(-1.0F, 0.0F, -19.0F, 4.0F, 0.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.6109F, 0.0F));
		PartDefinition cube_r4 = Body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 48).addBox(4.0F, 3.0F, -4.75F, 4.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(64, 42).addBox(4.0F, 1.0F, -8.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0916F, 1.9479F, -12.1505F, 0.4513F, -0.5135F, 0.0166F));
		PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(32, 0).addBox(-0.6454F, 2.5892F, -7.5527F, 4.0F, 0.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(43, 60).addBox(-0.6454F, 0.5892F, -11.5527F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8245F, -2.8596F, 11.4844F, 3.0662F, 0.234F, -3.1069F));
		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.0F, 0.0F, -4.75F, 4.0F, 0.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(1.0F, -2.0F, -8.75F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.9694F, -4.7548F, 9.9515F, 2.2564F, -0.6312F, -2.5803F));
		PartDefinition bone2 = Body.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone3 = Body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
