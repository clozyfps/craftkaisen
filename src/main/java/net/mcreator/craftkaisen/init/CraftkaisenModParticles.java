
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.particle.RestParticle;
import net.mcreator.craftkaisen.client.particle.ImpactParticle;
import net.mcreator.craftkaisen.client.particle.EvadeParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftkaisenModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.register(CraftkaisenModParticleTypes.EVADE.get(), EvadeParticle::provider);
		event.register(CraftkaisenModParticleTypes.IMPACT.get(), ImpactParticle::provider);
		event.register(CraftkaisenModParticleTypes.REST.get(), RestParticle::provider);
	}
}
