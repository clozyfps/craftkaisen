// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmegumihair<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "megumihair"), "main");
	private final ModelPart Head;

	public Modelmegumihair(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, -4.1F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, 7.3794F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, -2.7F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, 7.3794F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, 6.15F, -0.5672F, 0.0F, 0.0F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-4.0F, -3.6F, -6.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-4.0F, -3.6F, -5.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, 7.3794F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 6.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 5.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1F, -10.8298F, -0.2794F, 0.0F, -1.5708F, 0.0873F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 4.1F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1F, -10.8298F, -0.2794F, 0.0F, -1.5708F, 0.2182F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 2.7F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1F, -10.8298F, -0.2794F, 0.0F, -1.5708F, 0.3927F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.1F, -11.273F, -0.05F, 0.0F, -1.5708F, 0.5672F));

		PartDefinition Head_r9 = Head.addOrReplaceChild("Head_r9",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 6.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 5.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -10.8298F, -0.2794F, 0.0F, 1.5708F, -0.0873F));

		PartDefinition Head_r10 = Head.addOrReplaceChild("Head_r10",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 4.1F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -10.8298F, -0.2794F, 0.0F, 1.5708F, -0.2182F));

		PartDefinition Head_r11 = Head.addOrReplaceChild("Head_r11",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 2.7F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -10.8298F, -0.2794F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition Head_r12 = Head.addOrReplaceChild("Head_r12",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.1F, -11.273F, -0.05F, 0.0F, 1.5708F, -0.5672F));

		PartDefinition Head_r13 = Head.addOrReplaceChild("Head_r13",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 6.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-4.0F, -3.6F, 5.3F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, -7.3794F, 0.0873F, 0.0F, 0.0F));

		PartDefinition Head_r14 = Head.addOrReplaceChild("Head_r14",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 4.1F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, -7.3794F, 0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r15 = Head.addOrReplaceChild("Head_r15",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -3.6F, 2.7F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.9298F, -7.3794F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Head_r16 = Head.addOrReplaceChild("Head_r16",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, -11.373F, -0.05F, 0.0F, 1.5708F, 2.9234F));

		PartDefinition Head_r17 = Head.addOrReplaceChild("Head_r17",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.2F, -11.373F, -0.05F, 0.0F, 1.5708F, 2.7053F));

		PartDefinition Head_r18 = Head.addOrReplaceChild("Head_r18",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2F, -11.373F, -0.05F, 0.0F, -1.5708F, -2.9234F));

		PartDefinition Head_r19 = Head.addOrReplaceChild("Head_r19",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.2F, -11.373F, -0.05F, 0.0F, -1.5708F, -2.7053F));

		PartDefinition Head_r20 = Head.addOrReplaceChild("Head_r20",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, 6.15F, -2.7053F, 0.0F, 0.0F));

		PartDefinition Head_r21 = Head.addOrReplaceChild("Head_r21",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, 2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, 6.15F, -2.9234F, 0.0F, 0.0F));

		PartDefinition Head_r22 = Head.addOrReplaceChild("Head_r22",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, -2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, -6.15F, 2.9234F, 0.0F, 0.0F));

		PartDefinition Head_r23 = Head.addOrReplaceChild("Head_r23",
				CubeListBuilder.create().texOffs(48, 58).addBox(-4.0F, -7.6F, -2.9F, 8.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, -6.15F, 2.7053F, 0.0F, 0.0F));

		PartDefinition Head_r24 = Head.addOrReplaceChild("Head_r24",
				CubeListBuilder.create().texOffs(0, 56).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.373F, -6.15F, 0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}