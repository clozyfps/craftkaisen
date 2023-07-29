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

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
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
		CraftkaisenMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
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
			clone.Vessel = original.Vessel;
			clone.QuestMob = original.QuestMob;
			clone.QuestReward = original.QuestReward;
			clone.VesselTechnique = original.VesselTechnique;
			clone.QuestAmount = original.QuestAmount;
			clone.QuestProgress = original.QuestProgress;
			clone.SkillStrengthProgress = original.SkillStrengthProgress;
			clone.SkillSpeedProgress = original.SkillSpeedProgress;
			clone.SkillTechniqueProgress = original.SkillTechniqueProgress;
			clone.SkillCurseProgress = original.SkillCurseProgress;
			clone.InParty = original.InParty;
			clone.PartyLeader = original.PartyLeader;
			clone.Deaths = original.Deaths;
			clone.BlackFlash = original.BlackFlash;
			clone.RCT = original.RCT;
			if (!event.isWasDeath()) {
				clone.CursedEnergy = original.CursedEnergy;
				clone.Charging = original.Charging;
				clone.VowSender = original.VowSender;
				clone.VowDescription = original.VowDescription;
				clone.Checked = original.Checked;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "craftkaisen_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "craftkaisen_mapvars";
		public double FingersEaten = 0;
		public String ReincarnatedPlayer = "\"\"";
		public boolean VesselFound = false;
		public String VesselPlayer = "\"\"";

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			FingersEaten = nbt.getDouble("FingersEaten");
			ReincarnatedPlayer = nbt.getString("ReincarnatedPlayer");
			VesselFound = nbt.getBoolean("VesselFound");
			VesselPlayer = nbt.getString("VesselPlayer");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("FingersEaten", FingersEaten);
			nbt.putString("ReincarnatedPlayer", ReincarnatedPlayer);
			nbt.putBoolean("VesselFound", VesselFound);
			nbt.putString("VesselPlayer", VesselPlayer);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
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
		public String SelectedTechnique = "";
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
		public double Mood = 75.0;
		public boolean VowsEnabled = true;
		public String VowSender = "\"\"";
		public String VowDescription = "";
		public String Vessel = "\"\"";
		public String QuestMob = "";
		public double QuestReward = 0;
		public String VesselTechnique = "\"\"";
		public double QuestAmount = 0;
		public double QuestProgress = 0;
		public double SkillStrengthProgress = 0;
		public double SkillSpeedProgress = 0;
		public double SkillTechniqueProgress = 0;
		public double SkillCurseProgress = 0;
		public boolean InParty = false;
		public String PartyLeader = "";
		public double Deaths = 0;
		public boolean Checked = false;
		public boolean BlackFlash = false;
		public boolean RCT = false;

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
			nbt.putString("Vessel", Vessel);
			nbt.putString("QuestMob", QuestMob);
			nbt.putDouble("QuestReward", QuestReward);
			nbt.putString("VesselTechnique", VesselTechnique);
			nbt.putDouble("QuestAmount", QuestAmount);
			nbt.putDouble("QuestProgress", QuestProgress);
			nbt.putDouble("SkillStrengthProgress", SkillStrengthProgress);
			nbt.putDouble("SkillSpeedProgress", SkillSpeedProgress);
			nbt.putDouble("SkillTechniqueProgress", SkillTechniqueProgress);
			nbt.putDouble("SkillCurseProgress", SkillCurseProgress);
			nbt.putBoolean("InParty", InParty);
			nbt.putString("PartyLeader", PartyLeader);
			nbt.putDouble("Deaths", Deaths);
			nbt.putBoolean("Checked", Checked);
			nbt.putBoolean("BlackFlash", BlackFlash);
			nbt.putBoolean("RCT", RCT);
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
			Vessel = nbt.getString("Vessel");
			QuestMob = nbt.getString("QuestMob");
			QuestReward = nbt.getDouble("QuestReward");
			VesselTechnique = nbt.getString("VesselTechnique");
			QuestAmount = nbt.getDouble("QuestAmount");
			QuestProgress = nbt.getDouble("QuestProgress");
			SkillStrengthProgress = nbt.getDouble("SkillStrengthProgress");
			SkillSpeedProgress = nbt.getDouble("SkillSpeedProgress");
			SkillTechniqueProgress = nbt.getDouble("SkillTechniqueProgress");
			SkillCurseProgress = nbt.getDouble("SkillCurseProgress");
			InParty = nbt.getBoolean("InParty");
			PartyLeader = nbt.getString("PartyLeader");
			Deaths = nbt.getDouble("Deaths");
			Checked = nbt.getBoolean("Checked");
			BlackFlash = nbt.getBoolean("BlackFlash");
			RCT = nbt.getBoolean("RCT");
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
					variables.Vessel = message.data.Vessel;
					variables.QuestMob = message.data.QuestMob;
					variables.QuestReward = message.data.QuestReward;
					variables.VesselTechnique = message.data.VesselTechnique;
					variables.QuestAmount = message.data.QuestAmount;
					variables.QuestProgress = message.data.QuestProgress;
					variables.SkillStrengthProgress = message.data.SkillStrengthProgress;
					variables.SkillSpeedProgress = message.data.SkillSpeedProgress;
					variables.SkillTechniqueProgress = message.data.SkillTechniqueProgress;
					variables.SkillCurseProgress = message.data.SkillCurseProgress;
					variables.InParty = message.data.InParty;
					variables.PartyLeader = message.data.PartyLeader;
					variables.Deaths = message.data.Deaths;
					variables.Checked = message.data.Checked;
					variables.BlackFlash = message.data.BlackFlash;
					variables.RCT = message.data.RCT;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
