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
public class Modelpinkspirit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "modelpinkspirit"), "main");
	public final ModelPart Body;

	public Modelpinkspirit(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Heads = Body.addOrReplaceChild("Heads", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Heads.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(20, 12).addBox(-1.0F, -4.0F, 5.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(-6.3617F, -12.0F, -6.8528F, 0.0F, -0.0873F, 0.0F));
		PartDefinition cube_r2 = Heads.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 0).addBox(6.0F, -9.0F, 3.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(3.0F)),
				PartPose.offsetAndRotation(3.7978F, -4.0F, -14.3884F, 0.0F, -1.3963F, 0.0F));
		PartDefinition cube_r3 = Heads.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(29, 8).addBox(-3.0F, -1.0F, -2.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(5.0F)).texOffs(16, 29).addBox(3.0F, -1.0F, 1.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(0.963F, -45.1984F, 0.6873F, 2.5548F, 0.8739F, 2.6171F));
		PartDefinition cube_r4 = Heads.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(22, 29).addBox(-13.0F, -12.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(1.7053F, -22.2461F, -3.4225F, 1.5649F, 1.2075F, 1.5116F));
		PartDefinition cube_r5 = Heads.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 7).addBox(5.0F, -31.0F, -7.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(1.7053F, -22.2461F, -3.4225F, -2.6196F, 1.1479F, -2.4865F));
		PartDefinition cube_r6 = Heads.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(8, 14).addBox(-4.0F, -12.0F, -4.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(1.7053F, -22.2461F, -3.4225F, 2.3567F, 1.0439F, 2.3764F));
		PartDefinition cube_r7 = Heads.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(17, 7).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(1.7053F, -22.2461F, -3.4225F, 0.7303F, 1.0089F, 0.5955F));
		PartDefinition cube_r8 = Heads.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(14, 25).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(-1.2096F, -29.2867F, 5.9013F, 1.9284F, 1.1222F, 2.5669F));
		PartDefinition cube_r9 = Heads.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(20, 19).addBox(-14.0F, -18.0F, 6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0914F, -0.2457F, 0.4913F));
		PartDefinition cube_r10 = Heads.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 21).addBox(-1.0F, -16.0F, 6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(5.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.1309F));
		PartDefinition CenterBone = Body.addOrReplaceChild("CenterBone", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -53.0F, -1.0F, 2.0F, 46.0F, 2.0F, new CubeDeformation(3.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Legs = Body.addOrReplaceChild("Legs",
				CubeListBuilder.create().texOffs(40, 56).addBox(-13.0F, -6.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56).addBox(4.0F, -6.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56)
						.addBox(-13.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56).addBox(12.0F, -4.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56)
						.addBox(-2.0F, -4.0F, -14.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56).addBox(-2.0F, -4.0F, 12.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r11 = Legs.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(40, 56).addBox(-30.0F, -11.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 56).addBox(-12.0F, -11.0F, -1.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -5.0F, 16.0F, -1.5708F, -1.5708F, 0.0F));
		PartDefinition Leaf = Legs.addOrReplaceChild("Leaf", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r12 = Leaf.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 62).addBox(-1.0F, -2.8F, -0.4F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -5.0F, -1.0F, -0.48F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
