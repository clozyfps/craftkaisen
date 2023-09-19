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

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelGoddessClanWings<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craftkaisen", "model_goddess_clan_wings"), "main");
	public final ModelPart Body;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;

	public ModelGoddessClanWings(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Wings = Body.addOrReplaceChild("Wings", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 6.0F));
		PartDefinition cube_r1 = Wings.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(11, 68).addBox(-0.9043F, -2.6606F, -0.8536F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7686F, -15.8059F, -0.7554F, -0.3927F, 0.0F, 0.3927F));
		PartDefinition cube_r2 = Wings.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.9043F, -7.6304F, -0.7446F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 29).addBox(-0.9043F, -1.6304F, -3.9946F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7686F, -15.8059F, -0.7554F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r3 = Wings.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 68).addBox(-1.287F, -1.8071F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.7314F, -16.8059F, -0.7554F, -0.3927F, 0.0F, -0.3927F));
		PartDefinition cube_r4 = Wings.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(34, 53).addBox(-1.75F, -1.5F, -4.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0).addBox(-1.75F, -7.5F, -0.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -16.25F, -0.75F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r5 = Wings.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(24, 16).addBox(7.574F, -16.6358F, 0.0F, 14.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 35).addBox(5.574F, -14.6358F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9018F, -20.3294F, -0.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Wings.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 58).addBox(-1.1173F, -2.9239F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.8648F, -10.3511F, -0.5F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r7 = Wings.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(48, 0).addBox(0.4697F, -14.4194F, 0.0F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 57)
				.addBox(-0.5303F, -14.4194F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 48).addBox(-1.5303F, -9.4194F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.9636F, -18.544F, -0.5F, 0.0F, 0.0F, 2.7489F));
		PartDefinition cube_r8 = Wings.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(52, 12).addBox(-2.0756F, -9.6369F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8733F, -25.0126F, -0.5F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r9 = Wings.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 32).addBox(-2.25F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.6064F, -25.328F, -0.5F, 0.0F, 0.0F, 1.9635F));
		PartDefinition cube_r10 = Wings.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(8, 60).addBox(-1.9239F, -0.8827F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.3538F, -25.5786F, -0.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r11 = Wings.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 59).addBox(4.9429F, -21.037F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0908F, -24.0186F, -0.5F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r12 = Wings.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(42, 52).addBox(-2.0F, 0.25F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.7681F, -7.2504F, -0.5F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r13 = Wings.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 48).addBox(-9.1768F, -14.773F, 0.0F, 8.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 57)
				.addBox(-1.1768F, -14.773F, -1.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 36).addBox(-1.1768F, -9.773F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-19.2676F, -19.2145F, -0.5F, 0.0F, 0.0F, -2.7489F));
		PartDefinition cube_r14 = Wings.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(16, 52).addBox(0.4022F, -9.7722F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.3327F, -24.9506F, -0.5F, 0.0F, 0.0F, -2.3562F));
		PartDefinition cube_r15 = Wings.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 36).addBox(0.0F, -4.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.9474F, -26.6846F, -0.5F, 0.0F, 0.0F, -1.9635F));
		PartDefinition cube_r16 = Wings.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(60, 12).addBox(-0.4984F, -0.749F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.2735F, -26.0741F, -0.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r17 = Wings.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 60).addBox(-0.4697F, -1.7981F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.9469F, -25.4737F, -0.5F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r18 = Wings.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(64, 57).addBox(-5.926F, 1.1142F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 65).addBox(-3.176F, -2.3858F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 24)
						.addBox(-6.426F, -2.3858F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 28).addBox(-4.926F, -5.8858F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 66)
						.addBox(-8.926F, 0.6142F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 67).addBox(-8.926F, -4.6358F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 67)
						.addBox(-12.676F, -4.6358F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 67).addBox(-11.426F, -1.1358F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 37)
						.addBox(-23.676F, -0.3858F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 41).addBox(-21.426F, 4.1142F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 45)
						.addBox(-20.676F, -0.1358F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 49).addBox(-17.676F, -2.3858F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-17.676F, 2.6142F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 67).addBox(-14.426F, 0.8642F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-14.426F, -6.8858F, 0.0F, 14.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 42).addBox(-0.426F, -4.8858F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.8329F, -22.2425F, -0.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r19 = Wings.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(60, 29).addBox(15.9268F, 10.4874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 61).addBox(12.9268F, 12.4874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 63)
						.addBox(14.1768F, 7.2374F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 20).addBox(10.6768F, 4.2374F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 63)
						.addBox(7.9268F, 7.7374F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 63).addBox(10.4268F, 10.4874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 64)
						.addBox(7.6768F, 0.9874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(4.6768F, -1.7626F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 4)
						.addBox(1.6768F, 0.9874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 8).addBox(-2.5732F, -0.7626F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 64)
						.addBox(-2.0732F, 0.9874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 15).addBox(-0.0732F, 4.4874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 64)
						.addBox(2.6768F, 4.9874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 64).addBox(5.6768F, 4.4874F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 33)
						.addBox(0.9268F, -2.7626F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.7404F, -21.3731F, -0.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition Wings2 = Body.addOrReplaceChild("Wings2", CubeListBuilder.create(), PartPose.offset(0.0F, 17.5F, 4.0F));
		PartDefinition cube_r20 = Wings2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(44, 0).addBox(-0.4522F, -1.8303F, -0.4268F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3843F, -6.6529F, -1.6277F, -0.3927F, 0.0F, 0.3927F));
		PartDefinition cube_r21 = Wings2.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 16).addBox(-0.4522F, -3.8152F, -0.3723F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 35).addBox(-0.4522F, -0.8152F, -0.9973F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.3843F, -6.6529F, -1.6277F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r22 = Wings2.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(44, 36).addBox(-0.6435F, -1.4035F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3657F, -7.1529F, -1.6277F, -0.3927F, 0.0F, -0.3927F));
		PartDefinition cube_r23 = Wings2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(28, 57).addBox(-0.875F, -0.75F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 36).addBox(-0.875F, -3.75F, -0.375F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.875F, -1.625F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r24 = Wings2.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(24, 52).addBox(3.787F, -8.3179F, 0.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(2.787F, -7.8179F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9509F, -8.9147F, -1.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r25 = Wings2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 12).addBox(-1.0587F, -0.9619F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.4324F, -3.9255F, -1.5F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r26 = Wings2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(56, 49).addBox(0.2348F, -7.2097F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
				.addBox(-0.7652F, -7.7097F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 15).addBox(-0.7652F, -4.7097F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.4818F, -8.022F, -1.5F, 0.0F, 0.0F, 2.7489F));
		PartDefinition cube_r27 = Wings2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(50, 60).addBox(-1.0378F, -4.8184F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9367F, -11.2563F, -1.5F, 0.0F, 0.0F, 2.3562F));
		PartDefinition cube_r28 = Wings2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(6, 60).addBox(-1.125F, -0.875F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3032F, -11.414F, -1.5F, 0.0F, 0.0F, 1.9635F));
		PartDefinition cube_r29 = Wings2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(69, 56).addBox(-0.9619F, -0.9413F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.1769F, -11.5393F, -1.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r30 = Wings2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(70, 53).addBox(2.4715F, -10.5185F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5454F, -10.7593F, -1.5F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r31 = Wings2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(48, 12).addBox(-1.5F, -0.375F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.3841F, -2.3752F, -1.5F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r32 = Wings2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(56, 55).addBox(-4.5884F, -7.3865F, 0.0F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
				.addBox(-1.0884F, -7.8865F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 61).addBox(-0.5884F, -4.8865F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.6338F, -8.3572F, -1.5F, 0.0F, 0.0F, -2.7489F));
		PartDefinition cube_r33 = Wings2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(58, 61).addBox(0.2011F, -4.8861F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6663F, -11.2253F, -1.5F, 0.0F, 0.0F, -2.3562F));
		PartDefinition cube_r34 = Wings2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(57, 70).addBox(0.0F, -2.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9737F, -12.0923F, -1.5F, 0.0F, 0.0F, -1.9635F));
		PartDefinition cube_r35 = Wings2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(70, 58).addBox(-0.2492F, -0.8745F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1367F, -11.7871F, -1.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r36 = Wings2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(70, 67).addBox(-0.2348F, -0.899F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.4734F, -11.4869F, -1.5F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r37 = Wings2.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(52, 29).addBox(-2.963F, 0.0571F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 9).addBox(-1.588F, -1.6929F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 15)
						.addBox(-3.213F, -1.6929F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 70).addBox(-2.463F, -3.4429F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 32)
						.addBox(-4.463F, -0.1929F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 35).addBox(-4.463F, -2.8179F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 38)
						.addBox(-6.338F, -2.8179F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 70).addBox(-5.713F, -1.0679F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 41)
						.addBox(-11.838F, -0.6929F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 44).addBox(-10.713F, 1.5571F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 70)
						.addBox(-10.338F, -0.5679F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 47).addBox(-8.838F, -1.6929F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 70)
						.addBox(-8.838F, 0.8071F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 50).addBox(-7.213F, -0.0679F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 24)
						.addBox(-7.213F, -3.4429F, 0.0F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 32).addBox(-0.213F, -2.9429F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.9164F, -9.8713F, -1.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r38 = Wings2.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(31, 64).addBox(7.9634F, 4.7437F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 67).addBox(6.4634F, 5.7437F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 67)
						.addBox(7.0884F, 3.1187F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(5.3384F, 1.6187F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 12)
						.addBox(3.9634F, 3.3687F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 68).addBox(5.2134F, 4.7437F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 61)
						.addBox(3.8384F, -0.0063F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 64).addBox(2.3384F, -1.3813F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 68)
						.addBox(0.8384F, -0.0063F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 18).addBox(-1.2866F, -0.8813F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 21)
						.addBox(-1.0366F, -0.0063F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 69).addBox(-0.0366F, 1.7437F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 0)
						.addBox(1.3384F, 1.9937F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 3).addBox(2.8384F, 1.7437F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 6)
						.addBox(0.4634F, -1.8813F, -0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8702F, -9.4366F, -1.5F, 0.0F, 0.0F, 0.3927F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
