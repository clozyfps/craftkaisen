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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modellapseblue<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "modellapseblue"), "main");
	public final ModelPart bone;

	public Modellapseblue(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(17.0F)).texOffs(62, 58).addBox(9.0F, -20.0F, -9.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(9.0F)).texOffs(0, 40)
						.addBox(-11.0F, -20.0F, -9.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(9.0F)).texOffs(0, 20).addBox(-9.0F, -22.0F, -9.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(9.0F)).texOffs(0, 0)
						.addBox(-9.0F, -2.0F, -9.0F, 18.0F, 2.0F, 18.0F, new CubeDeformation(9.0F)),
				PartPose.offset(0.0F, 13.0F, 0.0F));
		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 40).addBox(-11.0F, -20.0F, -9.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(9.0F)).texOffs(54, 2).addBox(9.0F, -20.0F, -9.0F, 2.0F, 18.0F, 18.0F, new CubeDeformation(9.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
