package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CombatMessagesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double jogorandom = 0;
		String chat = "";
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof JogoEntity) {
					if ((entityiterator instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entity) {
						jogorandom = Mth.nextInt(RandomSource.create(), 1, 150);
						if (!((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 3)) {
							if (jogorandom == 1) {
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
								chat = "\u00A76Jogo: Is that all you got?! Pathetic!";
							} else if (jogorandom == 2) {
								chat = "\u00A76Jogo: TRY HARDER BASTARD";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 3) {
								chat = "\u00A76Jogo: YOU SHOULD BE ASHAMED!";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 4) {
								chat = "\u00A76Jogo: Heh.";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 5) {
								chat = "\u00A76Jogo: COME HERE!";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							}
						} else if ((entityiterator instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entityiterator instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 3) {
							if (jogorandom == 6) {
								chat = "\u00A76Jogo: I'll give it to ya, you're Strong!";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 7) {
								chat = "\u00A76Jogo: CMON KEEP IT COMING";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 8) {
								chat = "\u00A76Jogo: DAMN IT JUST DIE ALREADY";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 9) {
								chat = "\u00A76Jogo: DIE";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 10) {
								chat = "\u00A76Jogo: YOU'VE GOTTEN ME PRETTY LOW! ";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							}
						}
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) / 2) {
							if (jogorandom == 11) {
								chat = "\u00A76Jogo: YOU'RE ABOUT TO DIE!";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 12) {
								chat = "\u00A76Jogo: GETTING TIRED?";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 13) {
								chat = "\u00A76Jogo: ITS OVER FOR YOU WEAKLING";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 14) {
								chat = "\u00A76Jogo: THIS IS YOUR FINAL BATTLE!";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							} else if (jogorandom == 15) {
								chat = "\u00A76Jogo: JUST DIE ALREADY YOU IDIOT";
								if (entity instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal(chat), true);
							}
						}
					}
				}
			}
		}
	}
}
