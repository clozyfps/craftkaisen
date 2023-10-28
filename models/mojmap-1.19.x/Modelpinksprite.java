// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpinksprite<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pinksprite"), "main");
	private final ModelPart bone;

	public Modelpinksprite(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(175, 221)
				.addBox(-20.5F, 11.75F, -13.25F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(171, 221)
				.addBox(-20.5F, -11.25F, -4.25F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(143, 222)
				.addBox(4.5F, -2.75F, -11.25F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(143, 222)
				.addBox(4.5F, 18.25F, -5.25F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(149, 221)
				.addBox(4.5F, -27.25F, -7.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(75, 86)
				.addBox(-11.5F, -58.25F, -11.5F, 25.0F, 21.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(128, 221)
				.addBox(-10.5F, -35.25F, 3.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(128, 221)
				.addBox(-3.5F, -8.25F, 3.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(128, 220)
				.addBox(-10.5F, 13.75F, 3.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(157, 221)
				.addBox(-10.5F, 16.0F, -19.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(175, 221)
				.addBox(-20.5F, -34.0F, -8.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(158, 221)
				.addBox(-8.75F, -29.25F, -19.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(158, 221)
				.addBox(-4.75F, -4.25F, -19.5F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-11.5F, -39.25F, -11.5F, 25.0F, 86.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 152)
				.addBox(-11.5F, 46.75F, -11.5F, 25.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -48.75F, -0.5F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 111)
				.addBox(-14.9881F, -11.7301F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
				.addBox(-10.9881F, -36.7301F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(150, 107)
				.addBox(-18.9881F, 16.2699F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -48.75F, -0.5F, 0.043F, 0.0076F, -0.1744F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(75, 132)
				.addBox(-5.0574F, 2.7489F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(100, 41)
				.addBox(-11.0574F, -28.2511F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(150, 148)
				.addBox(-3.0574F, 27.7489F, -11.5F, 25.0F, 16.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -48.75F, -0.5F, 0.043F, -0.0076F, 0.1744F));

		return LayerDefinition.create(meshdefinition, 512, 512);
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