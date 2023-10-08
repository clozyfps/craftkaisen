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
public class Modelprison_realm_mob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "modelprison_realm_mob"), "main");
	public final ModelPart bb_main;

	public Modelprison_realm_mob(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-18.0F, -36.0F, 0.0F, 36.0F, 34.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 36).addBox(-3.4688F, -2.3621F, 1.5F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 60).addBox(1.0313F, -2.3621F, -1.5F, 1.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 36)
						.addBox(-3.4688F, -2.3621F, -3.0F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 54).addBox(-3.4688F, -2.3621F, -1.5F, 4.5F, 1.5F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.087F, -35.2868F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(17, 54).addBox(-3.0F, 1.5F, -1.5F, 4.5F, 1.5F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 60).addBox(1.5F, -3.0F, -1.5F, 1.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(17, 45)
						.addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(34, 45).addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(34, 54).addBox(-1.0313F, -2.3621F, -1.5F, 4.5F, 1.5F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 60).addBox(-2.5313F, -2.3621F, -1.5F, 1.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 36)
						.addBox(-2.5313F, -2.3621F, -3.0F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 45).addBox(-2.5313F, -2.3621F, 1.5F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.087F, -35.2868F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(51, 54).addBox(-1.5F, 1.5F, -1.5F, 4.5F, 1.5F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 36).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(33, 60)
						.addBox(-3.0F, -3.0F, -1.5F, 1.5F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 45).addBox(-3.0F, -3.0F, 1.5F, 6.0F, 6.0F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.5F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
