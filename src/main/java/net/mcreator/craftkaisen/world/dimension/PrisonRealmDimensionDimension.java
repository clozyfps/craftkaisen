
package net.mcreator.craftkaisen.world.dimension;

@Mod.EventBusSubscriber
public class PrisonRealmDimensionDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return color;
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}

			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("craftkaisen:prison_realm_dimension"), customEffect));
		}

	}

}
