// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmetalbat<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "metalbat"), "main");
	private final ModelPart bone;

	public Modelmetalbat(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0667F, -6.4F, -15.4F, 3.0667F, 4.2667F, 30.8F, new CubeDeformation(2.1333F))
						.texOffs(0, 4).addBox(2.7333F, -2.0F, -1.0F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 18).addBox(2.7333F, -2.0F, 8.6F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 16).addBox(2.7333F, -7.3333F, 9.6667F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 10).addBox(2.7333F, -6.8F, 4.3333F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 26).addBox(-9.0F, -7.3333F, 9.6667F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 2).addBox(-9.0F, -5.2F, -2.6F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 6).addBox(-9.0F, -6.8F, -6.3333F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 12).addBox(-9.0F, -4.6667F, -13.8F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 8).addBox(-9.0F, -4.6667F, 12.8667F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 24).addBox(-9.0F, -6.2667F, 2.2F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 14).addBox(2.7333F, -4.1333F, -4.2F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(12, 22).addBox(2.7333F, -6.8F, -10.6F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 0).addBox(2.7333F, -6.8F, 0.6F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(0, 20).addBox(2.7333F, -3.0667F, -10.6F, 5.2F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone.zRot = netHeadYaw / (180F / (float) Math.PI);
	}
}