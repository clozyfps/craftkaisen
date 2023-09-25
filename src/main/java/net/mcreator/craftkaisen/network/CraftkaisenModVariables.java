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
import net.minecraft.world.item.ItemStack;
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
			clone.AgilityTree = original.AgilityTree;
			clone.BlackFlash = original.BlackFlash;
			clone.Cost = original.Cost;
			clone.CursedEnergyCap = original.CursedEnergyCap;
			clone.CursedEnergyChargeSpeed = original.CursedEnergyChargeSpeed;
			clone.CursedEnergyTree = original.CursedEnergyTree;
			clone.Deaths = original.Deaths;
			clone.DefenseTree = original.DefenseTree;
			clone.Dimension = original.Dimension;
			clone.Exp = original.Exp;
			clone.ExpRequirement = original.ExpRequirement;
			clone.Faction = original.Faction;
			clone.Fame = original.Fame;
			clone.Grade = original.Grade;
			clone.HasMentor = original.HasMentor;
			clone.InParty = original.InParty;
			clone.InventoryCurse = original.InventoryCurse;
			clone.Job = original.Job;
			clone.JoinsWorld = original.JoinsWorld;
			clone.Level = original.Level;
			clone.Mentor = original.Mentor;
			clone.PartyLeader = original.PartyLeader;
			clone.PowerTree = original.PowerTree;
			clone.Prestige = original.Prestige;
			clone.RCT = original.RCT;
			clone.RCTExp = original.RCTExp;
			clone.RCTMastery = original.RCTMastery;
			clone.SelectedMoveset = original.SelectedMoveset;
			clone.SelectedTechnique = original.SelectedTechnique;
			clone.SkillCurseCost = original.SkillCurseCost;
			clone.SkillDefenseCost = original.SkillDefenseCost;
			clone.SkillPoints = original.SkillPoints;
			clone.SkillSpeedCost = original.SkillSpeedCost;
			clone.SkillStrengthCost = original.SkillStrengthCost;
			clone.Slot00 = original.Slot00;
			clone.Slot01 = original.Slot01;
			clone.Slot02 = original.Slot02;
			clone.Slot03 = original.Slot03;
			clone.Slot04 = original.Slot04;
			clone.Slot05 = original.Slot05;
			clone.Slot06 = original.Slot06;
			clone.Slot07 = original.Slot07;
			clone.Slot08 = original.Slot08;
			clone.Slot09 = original.Slot09;
			clone.Slot10 = original.Slot10;
			clone.Slot11 = original.Slot11;
			clone.Technique = original.Technique;
			clone.TechniqueSwitch = original.TechniqueSwitch;
			clone.VowsEnabled = original.VowsEnabled;
			clone.PowerSecondaryTree = original.PowerSecondaryTree;
			clone.DefenseSecondaryTree = original.DefenseSecondaryTree;
			clone.CursedEnergySecondaryTree = original.CursedEnergySecondaryTree;
			clone.AgilitySecondaryTree = original.AgilitySecondaryTree;
			clone.TalismanLink = original.TalismanLink;
			clone.Yen = original.Yen;
			if (!event.isWasDeath()) {
				clone.Charging = original.Charging;
				clone.Checked = original.Checked;
				clone.CursedEnergy = original.CursedEnergy;
				clone.DoingQuest = original.DoingQuest;
				clone.EmotionalState = original.EmotionalState;
				clone.FireSpread = original.FireSpread;
				clone.Quest = original.Quest;
				clone.SimpleDomainActive = original.SimpleDomainActive;
				clone.VowDescription = original.VowDescription;
				clone.VowSender = original.VowSender;
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

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			FingersEaten = nbt.getDouble("FingersEaten");
			ReincarnatedPlayer = nbt.getString("ReincarnatedPlayer");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putDouble("FingersEaten", FingersEaten);
			nbt.putString("ReincarnatedPlayer", ReincarnatedPlayer);
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
		public double AgilityTree = 0;
		public boolean BlackFlash = false;
		public boolean Charging = false;
		public boolean Checked = false;
		public double Cost = 0;
		public double CursedEnergy = 0;
		public double CursedEnergyCap = 0;
		public double CursedEnergyChargeSpeed = 2.0;
		public double CursedEnergyTree = 0;
		public double Deaths = 0;
		public double DefenseTree = 0;
		public String Dimension = "\"\"";
		public boolean DoingQuest = false;
		public String EmotionalState = "Middle 50";
		public double Exp = 0;
		public double ExpRequirement = 100.0;
		public String Faction = "";
		public double Fame = 0;
		public double FireSpread = 0;
		public String Grade = "4";
		public boolean HasMentor = false;
		public boolean InParty = false;
		public boolean InventoryCurse = false;
		public String Job = "\"\"";
		public boolean JoinsWorld = false;
		public double Level = 0;
		public String Mentor = "\"\"";
		public String PartyLeader = "";
		public double PowerTree = 0;
		public double Prestige = 0;
		public String Quest = "\"\"";
		public boolean RCT = false;
		public double RCTExp = 0;
		public double RCTMastery = 0;
		public double SelectedMoveset = 1.0;
		public String SelectedTechnique = "\"\"";
		public boolean SimpleDomainActive = false;
		public double SkillCurseCost = 0;
		public double SkillDefenseCost = 0;
		public double SkillPoints = 0;
		public double SkillSpeedCost = 0;
		public double SkillStrengthCost = 0;
		public ItemStack Slot00 = ItemStack.EMPTY;
		public ItemStack Slot01 = ItemStack.EMPTY;
		public ItemStack Slot02 = ItemStack.EMPTY;
		public ItemStack Slot03 = ItemStack.EMPTY;
		public ItemStack Slot04 = ItemStack.EMPTY;
		public ItemStack Slot05 = ItemStack.EMPTY;
		public ItemStack Slot06 = ItemStack.EMPTY;
		public ItemStack Slot07 = ItemStack.EMPTY;
		public ItemStack Slot08 = ItemStack.EMPTY;
		public ItemStack Slot09 = ItemStack.EMPTY;
		public ItemStack Slot10 = ItemStack.EMPTY;
		public ItemStack Slot11 = ItemStack.EMPTY;
		public String Technique = "";
		public double TechniqueSwitch = 0;
		public String VowDescription = "";
		public boolean VowsEnabled = true;
		public String VowSender = "\"\"";
		public double PowerSecondaryTree = 0;
		public double DefenseSecondaryTree = 0;
		public double CursedEnergySecondaryTree = 0;
		public double AgilitySecondaryTree = 0;
		public ItemStack TalismanLink = ItemStack.EMPTY;
		public double Yen = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftkaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putDouble("AgilityTree", AgilityTree);
			nbt.putBoolean("BlackFlash", BlackFlash);
			nbt.putBoolean("Charging", Charging);
			nbt.putBoolean("Checked", Checked);
			nbt.putDouble("Cost", Cost);
			nbt.putDouble("CursedEnergy", CursedEnergy);
			nbt.putDouble("CursedEnergyCap", CursedEnergyCap);
			nbt.putDouble("CursedEnergyChargeSpeed", CursedEnergyChargeSpeed);
			nbt.putDouble("CursedEnergyTree", CursedEnergyTree);
			nbt.putDouble("Deaths", Deaths);
			nbt.putDouble("DefenseTree", DefenseTree);
			nbt.putString("Dimension", Dimension);
			nbt.putBoolean("DoingQuest", DoingQuest);
			nbt.putString("EmotionalState", EmotionalState);
			nbt.putDouble("Exp", Exp);
			nbt.putDouble("ExpRequirement", ExpRequirement);
			nbt.putString("Faction", Faction);
			nbt.putDouble("Fame", Fame);
			nbt.putDouble("FireSpread", FireSpread);
			nbt.putString("Grade", Grade);
			nbt.putBoolean("HasMentor", HasMentor);
			nbt.putBoolean("InParty", InParty);
			nbt.putBoolean("InventoryCurse", InventoryCurse);
			nbt.putString("Job", Job);
			nbt.putBoolean("JoinsWorld", JoinsWorld);
			nbt.putDouble("Level", Level);
			nbt.putString("Mentor", Mentor);
			nbt.putString("PartyLeader", PartyLeader);
			nbt.putDouble("PowerTree", PowerTree);
			nbt.putDouble("Prestige", Prestige);
			nbt.putString("Quest", Quest);
			nbt.putBoolean("RCT", RCT);
			nbt.putDouble("RCTExp", RCTExp);
			nbt.putDouble("RCTMastery", RCTMastery);
			nbt.putDouble("SelectedMoveset", SelectedMoveset);
			nbt.putString("SelectedTechnique", SelectedTechnique);
			nbt.putBoolean("SimpleDomainActive", SimpleDomainActive);
			nbt.putDouble("SkillCurseCost", SkillCurseCost);
			nbt.putDouble("SkillDefenseCost", SkillDefenseCost);
			nbt.putDouble("SkillPoints", SkillPoints);
			nbt.putDouble("SkillSpeedCost", SkillSpeedCost);
			nbt.putDouble("SkillStrengthCost", SkillStrengthCost);
			nbt.put("Slot00", Slot00.save(new CompoundTag()));
			nbt.put("Slot01", Slot01.save(new CompoundTag()));
			nbt.put("Slot02", Slot02.save(new CompoundTag()));
			nbt.put("Slot03", Slot03.save(new CompoundTag()));
			nbt.put("Slot04", Slot04.save(new CompoundTag()));
			nbt.put("Slot05", Slot05.save(new CompoundTag()));
			nbt.put("Slot06", Slot06.save(new CompoundTag()));
			nbt.put("Slot07", Slot07.save(new CompoundTag()));
			nbt.put("Slot08", Slot08.save(new CompoundTag()));
			nbt.put("Slot09", Slot09.save(new CompoundTag()));
			nbt.put("Slot10", Slot10.save(new CompoundTag()));
			nbt.put("Slot11", Slot11.save(new CompoundTag()));
			nbt.putString("Technique", Technique);
			nbt.putDouble("TechniqueSwitch", TechniqueSwitch);
			nbt.putString("VowDescription", VowDescription);
			nbt.putBoolean("VowsEnabled", VowsEnabled);
			nbt.putString("VowSender", VowSender);
			nbt.putDouble("PowerSecondaryTree", PowerSecondaryTree);
			nbt.putDouble("DefenseSecondaryTree", DefenseSecondaryTree);
			nbt.putDouble("CursedEnergySecondaryTree", CursedEnergySecondaryTree);
			nbt.putDouble("AgilitySecondaryTree", AgilitySecondaryTree);
			nbt.put("TalismanLink", TalismanLink.save(new CompoundTag()));
			nbt.putDouble("Yen", Yen);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			AgilityTree = nbt.getDouble("AgilityTree");
			BlackFlash = nbt.getBoolean("BlackFlash");
			Charging = nbt.getBoolean("Charging");
			Checked = nbt.getBoolean("Checked");
			Cost = nbt.getDouble("Cost");
			CursedEnergy = nbt.getDouble("CursedEnergy");
			CursedEnergyCap = nbt.getDouble("CursedEnergyCap");
			CursedEnergyChargeSpeed = nbt.getDouble("CursedEnergyChargeSpeed");
			CursedEnergyTree = nbt.getDouble("CursedEnergyTree");
			Deaths = nbt.getDouble("Deaths");
			DefenseTree = nbt.getDouble("DefenseTree");
			Dimension = nbt.getString("Dimension");
			DoingQuest = nbt.getBoolean("DoingQuest");
			EmotionalState = nbt.getString("EmotionalState");
			Exp = nbt.getDouble("Exp");
			ExpRequirement = nbt.getDouble("ExpRequirement");
			Faction = nbt.getString("Faction");
			Fame = nbt.getDouble("Fame");
			FireSpread = nbt.getDouble("FireSpread");
			Grade = nbt.getString("Grade");
			HasMentor = nbt.getBoolean("HasMentor");
			InParty = nbt.getBoolean("InParty");
			InventoryCurse = nbt.getBoolean("InventoryCurse");
			Job = nbt.getString("Job");
			JoinsWorld = nbt.getBoolean("JoinsWorld");
			Level = nbt.getDouble("Level");
			Mentor = nbt.getString("Mentor");
			PartyLeader = nbt.getString("PartyLeader");
			PowerTree = nbt.getDouble("PowerTree");
			Prestige = nbt.getDouble("Prestige");
			Quest = nbt.getString("Quest");
			RCT = nbt.getBoolean("RCT");
			RCTExp = nbt.getDouble("RCTExp");
			RCTMastery = nbt.getDouble("RCTMastery");
			SelectedMoveset = nbt.getDouble("SelectedMoveset");
			SelectedTechnique = nbt.getString("SelectedTechnique");
			SimpleDomainActive = nbt.getBoolean("SimpleDomainActive");
			SkillCurseCost = nbt.getDouble("SkillCurseCost");
			SkillDefenseCost = nbt.getDouble("SkillDefenseCost");
			SkillPoints = nbt.getDouble("SkillPoints");
			SkillSpeedCost = nbt.getDouble("SkillSpeedCost");
			SkillStrengthCost = nbt.getDouble("SkillStrengthCost");
			Slot00 = ItemStack.of(nbt.getCompound("Slot00"));
			Slot01 = ItemStack.of(nbt.getCompound("Slot01"));
			Slot02 = ItemStack.of(nbt.getCompound("Slot02"));
			Slot03 = ItemStack.of(nbt.getCompound("Slot03"));
			Slot04 = ItemStack.of(nbt.getCompound("Slot04"));
			Slot05 = ItemStack.of(nbt.getCompound("Slot05"));
			Slot06 = ItemStack.of(nbt.getCompound("Slot06"));
			Slot07 = ItemStack.of(nbt.getCompound("Slot07"));
			Slot08 = ItemStack.of(nbt.getCompound("Slot08"));
			Slot09 = ItemStack.of(nbt.getCompound("Slot09"));
			Slot10 = ItemStack.of(nbt.getCompound("Slot10"));
			Slot11 = ItemStack.of(nbt.getCompound("Slot11"));
			Technique = nbt.getString("Technique");
			TechniqueSwitch = nbt.getDouble("TechniqueSwitch");
			VowDescription = nbt.getString("VowDescription");
			VowsEnabled = nbt.getBoolean("VowsEnabled");
			VowSender = nbt.getString("VowSender");
			PowerSecondaryTree = nbt.getDouble("PowerSecondaryTree");
			DefenseSecondaryTree = nbt.getDouble("DefenseSecondaryTree");
			CursedEnergySecondaryTree = nbt.getDouble("CursedEnergySecondaryTree");
			AgilitySecondaryTree = nbt.getDouble("AgilitySecondaryTree");
			TalismanLink = ItemStack.of(nbt.getCompound("TalismanLink"));
			Yen = nbt.getDouble("Yen");
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
					variables.AgilityTree = message.data.AgilityTree;
					variables.BlackFlash = message.data.BlackFlash;
					variables.Charging = message.data.Charging;
					variables.Checked = message.data.Checked;
					variables.Cost = message.data.Cost;
					variables.CursedEnergy = message.data.CursedEnergy;
					variables.CursedEnergyCap = message.data.CursedEnergyCap;
					variables.CursedEnergyChargeSpeed = message.data.CursedEnergyChargeSpeed;
					variables.CursedEnergyTree = message.data.CursedEnergyTree;
					variables.Deaths = message.data.Deaths;
					variables.DefenseTree = message.data.DefenseTree;
					variables.Dimension = message.data.Dimension;
					variables.DoingQuest = message.data.DoingQuest;
					variables.EmotionalState = message.data.EmotionalState;
					variables.Exp = message.data.Exp;
					variables.ExpRequirement = message.data.ExpRequirement;
					variables.Faction = message.data.Faction;
					variables.Fame = message.data.Fame;
					variables.FireSpread = message.data.FireSpread;
					variables.Grade = message.data.Grade;
					variables.HasMentor = message.data.HasMentor;
					variables.InParty = message.data.InParty;
					variables.InventoryCurse = message.data.InventoryCurse;
					variables.Job = message.data.Job;
					variables.JoinsWorld = message.data.JoinsWorld;
					variables.Level = message.data.Level;
					variables.Mentor = message.data.Mentor;
					variables.PartyLeader = message.data.PartyLeader;
					variables.PowerTree = message.data.PowerTree;
					variables.Prestige = message.data.Prestige;
					variables.Quest = message.data.Quest;
					variables.RCT = message.data.RCT;
					variables.RCTExp = message.data.RCTExp;
					variables.RCTMastery = message.data.RCTMastery;
					variables.SelectedMoveset = message.data.SelectedMoveset;
					variables.SelectedTechnique = message.data.SelectedTechnique;
					variables.SimpleDomainActive = message.data.SimpleDomainActive;
					variables.SkillCurseCost = message.data.SkillCurseCost;
					variables.SkillDefenseCost = message.data.SkillDefenseCost;
					variables.SkillPoints = message.data.SkillPoints;
					variables.SkillSpeedCost = message.data.SkillSpeedCost;
					variables.SkillStrengthCost = message.data.SkillStrengthCost;
					variables.Slot00 = message.data.Slot00;
					variables.Slot01 = message.data.Slot01;
					variables.Slot02 = message.data.Slot02;
					variables.Slot03 = message.data.Slot03;
					variables.Slot04 = message.data.Slot04;
					variables.Slot05 = message.data.Slot05;
					variables.Slot06 = message.data.Slot06;
					variables.Slot07 = message.data.Slot07;
					variables.Slot08 = message.data.Slot08;
					variables.Slot09 = message.data.Slot09;
					variables.Slot10 = message.data.Slot10;
					variables.Slot11 = message.data.Slot11;
					variables.Technique = message.data.Technique;
					variables.TechniqueSwitch = message.data.TechniqueSwitch;
					variables.VowDescription = message.data.VowDescription;
					variables.VowsEnabled = message.data.VowsEnabled;
					variables.VowSender = message.data.VowSender;
					variables.PowerSecondaryTree = message.data.PowerSecondaryTree;
					variables.DefenseSecondaryTree = message.data.DefenseSecondaryTree;
					variables.CursedEnergySecondaryTree = message.data.CursedEnergySecondaryTree;
					variables.AgilitySecondaryTree = message.data.AgilitySecondaryTree;
					variables.TalismanLink = message.data.TalismanLink;
					variables.Yen = message.data.Yen;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
