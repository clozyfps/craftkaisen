package net.mcreator.craftkaisen.client.renderer;

public class MagmaRockProjectileRenderer extends EntityRenderer<MagmaRockProjectileEntity> {

	private static final ResourceLocation texture = new ResourceLocation("craftkaisen:textures/entities/magmablock.png");

	private final Modelmagmaprojectile model;

	public MagmaRockProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelmagmaprojectile(context.bakeLayer(Modelmagmaprojectile.LAYER_LOCATION));
	}

	@Override
	public void render(MagmaRockProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Vector3f.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(MagmaRockProjectileEntity entity) {
		return texture;
	}

}
