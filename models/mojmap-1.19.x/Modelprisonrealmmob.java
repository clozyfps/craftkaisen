// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelprisonrealmmob<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "prisonrealmmob"), "main");
	private final ModelPart bone;

	public Modelprisonrealmmob(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(17, 5)
				.addBox(-1.5333F, -4.6667F, 7.5333F, 5.7333F, 4.6667F, 4.6667F, new CubeDeformation(0.0F))
				.texOffs(34, 0)
				.addBox(-1.5333F, -4.6667F, -11.1333F, 5.7333F, 4.6667F, 4.6667F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(1.1333F, -20.1333F, -8.4667F, 0.0F, 18.0F, 18.5333F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild(
				"cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5333F, -24.9333F, 7.0F, 5.7333F, 4.6667F,
						4.6667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(33, 32).addBox(-1.5333F, -24.9333F, -9.5333F, 5.7333F, 4.6667F,
						4.6667F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}