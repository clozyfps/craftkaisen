package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.CraftkaisenMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftkaisenModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftkaisenMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.Level = original.Level;
			clone.Exp = original.Exp;
			clone.SkillPoints = original.SkillPoints;
			clone.Prestige = original.Prestige;
			clone.Clan = original.Clan;
			clone.Technique = original.Technique;
			clone.ExpRequirement = original.ExpRequirement;
			clone.TechniqueSwitch = original.TechniqueSwitch;
			clone.SelectedTechnique = original.SelectedTechnique;
			clone.Move3Cost = original.Move3Cost;
			clone.MoveUltimateCost = original.MoveUltimateCost;
			clone.MoveSpecialCost = original.MoveSpecialCost;
			clone.CursedEnergyCap = original.CursedEnergyCap;
			clone.Move5Cost = original.Move5Cost;
			clone.Move4Cost = original.Move4Cost;
			clone.Move1Cost = original.Move1Cost;
			clone.Move2Cost = original.Move2Cost;
			clone.Mood = original.Mood;
			clone.VowsEnabled = original.VowsEnabled;
			if (!event.isWasDeath()) {
				clone.CursedEnergy = original.CursedEnergy;
				clone.Charging = original.Charging;
				clone.VowSender = original.VowSender;
				clone.VowDescription = original.VowDescription;
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craftkaisen", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public double Level = 0;
		public double Exp = 0;
		public double SkillPoints = 0;
		public double Prestige = 0;
		public String Clan = "";
		public String Technique = "";
		public double ExpRequirement = 100.0;
		public double TechniqueSwitch = 0;
		public String SelectedTechnique = "\"\"";
		public double Move3Cost = 0;
		public double CursedEnergy = 0;
		public double MoveUltimateCost = 0;
		public double MoveSpecialCost = 0;
		public double CursedEnergyCap = 0;
		public double Move5Cost = 0;
		public double Move4Cost = 0;
		public double Move1Cost = 0;
		public double Move2Cost = 0;
		public boolean Charging = false;
		public double Mood = 0;
		public boolean VowsEnabled = true;
		public String VowSender = "\"\"";
		public String VowDescription = "";

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("Level", Level);
			nbt.putDouble("Exp", Exp);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("Prestige", Prestige);
			nbt.putString("Clan", Clan);
			nbt.putString("Technique", Technique);
			nbt.putDouble("ExpRequirement", ExpRequirement);
			nbt.putDouble("TechniqueSwitch", TechniqueSwitch);
			nbt.putString("SelectedTechnique", SelectedTechnique);
			nbt.putDouble("Move3Cost", Move3Cost);
			nbt.putDouble("CursedEnergy", CursedEnergy);
			nbt.putDouble("MoveUltimateCost", MoveUltimateCost);
			nbt.putDouble("MoveSpecialCost", MoveSpecialCost);
			nbt.putDouble("CursedEnergyCap", CursedEnergyCap);
			nbt.putDouble("Move5Cost", Move5Cost);
			nbt.putDouble("Move4Cost", Move4Cost);
			nbt.putDouble("Move1Cost", Move1Cost);
			nbt.putDouble("Move2Cost", Move2Cost);
			nbt.putBoolean("Charging", Charging);
			nbt.putDouble("Mood", Mood);
			nbt.putBoolean("VowsEnabled", VowsEnabled);
			nbt.putString("VowSender", VowSender);
			nbt.putString("VowDescription", VowDescription);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			Level = nbt.getDouble("Level");
			Exp = nbt.getDouble("Exp");
			SkillPoints = nbt.getDouble("SkillPoints");
			Prestige = nbt.getDouble("Prestige");
			Clan = nbt.getString("Clan");
			Technique = nbt.getString("Technique");
			ExpRequirement = nbt.getDouble("ExpRequirement");
			TechniqueSwitch = nbt.getDouble("TechniqueSwitch");
			SelectedTechnique = nbt.getString("SelectedTechnique");
			Move3Cost = nbt.getDouble("Move3Cost");
			CursedEnergy = nbt.getDouble("CursedEnergy");
			MoveUltimateCost = nbt.getDouble("MoveUltimateCost");
			MoveSpecialCost = nbt.getDouble("MoveSpecialCost");
			CursedEnergyCap = nbt.getDouble("CursedEnergyCap");
			Move5Cost = nbt.getDouble("Move5Cost");
			Move4Cost = nbt.getDouble("Move4Cost");
			Move1Cost = nbt.getDouble("Move1Cost");
			Move2Cost = nbt.getDouble("Move2Cost");
			Charging = nbt.getBoolean("Charging");
			Mood = nbt.getDouble("Mood");
			VowsEnabled = nbt.getBoolean("VowsEnabled");
			VowSender = nbt.getString("VowSender");
			VowDescription = nbt.getString("VowDescription");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.Level = message.data.Level;
					variables.Exp = message.data.Exp;
					variables.SkillPoints = message.data.SkillPoints;
					variables.Prestige = message.data.Prestige;
					variables.Clan = message.data.Clan;
					variables.Technique = message.data.Technique;
					variables.ExpRequirement = message.data.ExpRequirement;
					variables.TechniqueSwitch = message.data.TechniqueSwitch;
					variables.SelectedTechnique = message.data.SelectedTechnique;
					variables.Move3Cost = message.data.Move3Cost;
					variables.CursedEnergy = message.data.CursedEnergy;
					variables.MoveUltimateCost = message.data.MoveUltimateCost;
					variables.MoveSpecialCost = message.data.MoveSpecialCost;
					variables.CursedEnergyCap = message.data.CursedEnergyCap;
					variables.Move5Cost = message.data.Move5Cost;
					variables.Move4Cost = message.data.Move4Cost;
					variables.Move1Cost = message.data.Move1Cost;
					variables.Move2Cost = message.data.Move2Cost;
					variables.Charging = message.data.Charging;
					variables.Mood = message.data.Mood;
					variables.VowsEnabled = message.data.VowsEnabled;
					variables.VowSender = message.data.VowSender;
					variables.VowDescription = message.data.VowDescription;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
