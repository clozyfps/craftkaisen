
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class PurpleLightningParticle extends TextureSheetParticle {

	public static PurpleLightningParticleProvider provider(SpriteSet spriteSet) {
		return new PurpleLightningParticleProvider(spriteSet);
	}

	public static class PurpleLightningParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public PurpleLightningParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new PurpleLightningParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected PurpleLightningParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;

		this.setSize(0.2f, 0.2f);
		this.quadSize *= 10f;

		this.lifetime = 7;

		this.gravity = 0f;
		this.hasPhysics = false;

		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;

		this.pickSprite(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_LIT;
	}

	@Override
	public void tick() {
		super.tick();

	}

}
