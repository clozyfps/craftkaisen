
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.particle.ReversalRedParticleParticle;
import net.mcreator.craftkaisen.client.particle.RestParticle;
import net.mcreator.craftkaisen.client.particle.RedMistParticle;
import net.mcreator.craftkaisen.client.particle.RedElectricityParticle;
import net.mcreator.craftkaisen.client.particle.RatioParticle;
import net.mcreator.craftkaisen.client.particle.PurplePulseParticle;
import net.mcreator.craftkaisen.client.particle.PurpleMistParticle;
import net.mcreator.craftkaisen.client.particle.PurpleLightningParticle;
import net.mcreator.craftkaisen.client.particle.PurpleElectricityParticle;
import net.mcreator.craftkaisen.client.particle.LapseBlueParticleParticle;
import net.mcreator.craftkaisen.client.particle.ImpactParticle;
import net.mcreator.craftkaisen.client.particle.FlameSparkParticle;
import net.mcreator.craftkaisen.client.particle.EvadeParticle;
import net.mcreator.craftkaisen.client.particle.BlueMistParticle;
import net.mcreator.craftkaisen.client.particle.BloodParticle;
import net.mcreator.craftkaisen.client.particle.BlackElectricityParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(CraftkaisenModParticleTypes.EVADE.get(), EvadeParticle::provider);
		event.register(CraftkaisenModParticleTypes.IMPACT.get(), ImpactParticle::provider);
		event.register(CraftkaisenModParticleTypes.REST.get(), RestParticle::provider);
		event.register(CraftkaisenModParticleTypes.LAPSE_BLUE_PARTICLE.get(), LapseBlueParticleParticle::provider);
		event.register(CraftkaisenModParticleTypes.BLACK_ELECTRICITY.get(), BlackElectricityParticle::provider);
		event.register(CraftkaisenModParticleTypes.RED_ELECTRICITY.get(), RedElectricityParticle::provider);
		event.register(CraftkaisenModParticleTypes.REVERSAL_RED_PARTICLE.get(), ReversalRedParticleParticle::provider);
		event.register(CraftkaisenModParticleTypes.FLAME_SPARK.get(), FlameSparkParticle::provider);
		event.register(CraftkaisenModParticleTypes.BLOOD.get(), BloodParticle::provider);
		event.register(CraftkaisenModParticleTypes.PURPLE_MIST.get(), PurpleMistParticle::provider);
		event.register(CraftkaisenModParticleTypes.PURPLE_PULSE.get(), PurplePulseParticle::provider);
		event.register(CraftkaisenModParticleTypes.PURPLE_LIGHTNING.get(), PurpleLightningParticle::provider);
		event.register(CraftkaisenModParticleTypes.BLUE_MIST.get(), BlueMistParticle::provider);
		event.register(CraftkaisenModParticleTypes.RED_MIST.get(), RedMistParticle::provider);
		event.register(CraftkaisenModParticleTypes.PURPLE_ELECTRICITY.get(), PurpleElectricityParticle::provider);
		event.register(CraftkaisenModParticleTypes.RATIO.get(), RatioParticle::provider);
	}
}
