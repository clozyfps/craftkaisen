// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbluecurse<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bluecurse"), "main");
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart bb_main;

	public Modelbluecurse(ModelPart root) {
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-16.0F, -4.1F, -12.0F, 33.0F, 4.1F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-13.0F, -19.1F, -12.0F, 27.0F, 15.1F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-10.2F, -5.3F, -2.5F, 0.9F, 3.9F, 6.0F, new CubeDeformation(0.0F)).texOffs(49, 119)
						.addBox(-10.2F, -1.3F, -2.5F, 18.9F, 6.9F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.3794F, -5.2078F, -15.3445F, 0.0F, -0.2007F, 0.1745F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(9, 5)
						.addBox(8.0F, -8.4F, -1.5F, 1.0F, 2.9F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 109)
						.addBox(-12.0F, -5.5F, -1.5F, 21.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3734F, -1.7674F, -15.5F, 0.005F, 0.1659F, -0.1654F));

		PartDefinition cube_r3 = Body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(85, 51)
						.addBox(-7.3F, -19.55F, -11.5F, 16.9F, 13.1F, 20.4F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-9.3F, -6.55F, -12.5F, 21.9F, 15.1F, 22.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -23.55F, 0.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(117, 17)
				.addBox(-4.4F, -43.5F, -15.2F, 7.9F, 0.4F, 11.6F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(9, 0)
						.addBox(0.3F, -1.05F, -2.9F, 2.0F, 2.1F, 2.5F, new CubeDeformation(0.0F)).texOffs(11, 35)
						.addBox(0.2F, -1.15F, -0.4F, 2.2F, 2.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.7F, -32.15F, -13.8F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -0.95F, -5.5F, 1.4F, 1.5F, 2.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1273F, -31.0389F, -13.057F, -0.3142F, -0.4363F, 0.0F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(18, 4).addBox(0.6F, -0.45F, -6.9F, 1.4F, 1.5F, 2.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9727F, -31.0389F, -9.557F, -0.3142F, 1.0908F, 0.0F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(13, 30)
						.addBox(0.3F, -1.05F, -2.9F, 2.0F, 2.1F, 2.5F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(0.2F, -1.15F, -0.4F, 2.2F, 2.3F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4F, -32.15F, -10.3F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-1.0F, -1.0F, -8.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(3.0F)).texOffs(0, 30)
						.addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-0.527F, -24.4973F, -15.6721F, 1.2546F, 0.173F, -0.023F));

		PartDefinition cube_r9 = Head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(9, 15).addBox(-1.0F, 0.6F, -4.2F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(-0.6393F, -34.2778F, -15.0267F, 1.3943F, 0.173F, -0.023F));

		PartDefinition cube_r10 = Head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(-1, 10).addBox(-1.8F, 1.0F, -5.0F, 2.0F, 2.0F, 4.3F,
						new CubeDeformation(2.0F)),
				PartPose.offsetAndRotation(0.0F, -42.0F, -15.0F, 1.5426F, 0.173F, -0.023F));

		PartDefinition cube_r11 = Head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(166, 188).addBox(-0.3F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(4.7534F, -39.9007F, -13.7213F, -0.0536F, -0.1326F, 0.0018F));

		PartDefinition cube_r12 = Head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(16, 40).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(1.0F)),
				PartPose.offsetAndRotation(-6.0F, -40.0F, -11.0F, -0.0649F, 0.6117F, 0.032F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(89, 85).addBox(-18.0F, 5.5F, -0.5F, 22.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.6651F, -14.5442F, -3.5F, 3.1416F, -1.309F, -2.1817F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(92, 0).addBox(-22.0F, 5.5F, -5.5F, 22.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(32.6651F, -14.5442F, -3.5F, 0.0F, 0.0F, 0.9599F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(80, 30).addBox(-13.0F, -3.5F, -15.0F, 22.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-27.3286F, -3.8482F, -3.5F, 0.0F, -1.0908F, -0.9599F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(80, 102).addBox(-11.0F, -8.5F, -4.5F, 22.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.3349F, -16.5442F, -3.5F, 0.0F, 0.0F, -0.9599F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}