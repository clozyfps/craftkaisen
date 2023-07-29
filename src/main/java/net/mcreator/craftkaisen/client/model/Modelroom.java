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

// Made with Blockbench 4.8.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelroom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "modelroom"), "main");
	public final ModelPart bb_main;

	public Modelroom(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(195, 0).addBox(-72.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(49, 184).addBox(-72.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(179, 183)
						.addBox(-72.0F, -16.0F, 24.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(179, 116).addBox(-72.0F, -16.0F, -24.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 167)
						.addBox(-72.0F, -16.0F, -40.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 167).addBox(-56.0F, -16.0F, -56.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(163, 150)
						.addBox(-40.0F, -16.0F, -72.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(163, 83).addBox(56.0F, -16.0F, 24.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(163, 33)
						.addBox(56.0F, -16.0F, 8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(65, 150).addBox(56.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 134)
						.addBox(56.0F, -16.0F, -24.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 133).addBox(56.0F, -16.0F, -40.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(130, 0)
						.addBox(-24.0F, -16.0F, -72.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(49, 117).addBox(-8.0F, -16.0F, -72.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 100)
						.addBox(8.0F, -16.0F, -72.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(114, 66).addBox(24.0F, -16.0F, -72.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(40.0F, -16.0F, -56.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(40.0F, -8.0F, -47.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 33).addBox(-56.0F, -8.0F, -47.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(49, 50)
						.addBox(-40.0F, -8.0F, -63.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(65, 0).addBox(-24.0F, -8.0F, -63.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(-8.0F, -8.0F, -63.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(65, 83).addBox(8.0F, -8.0F, -63.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(98, 33)
						.addBox(24.0F, -8.0F, -63.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 9.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
