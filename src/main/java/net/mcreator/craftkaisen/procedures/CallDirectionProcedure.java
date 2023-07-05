package net.mcreator.craftkaisen.procedures;

import net.minecraft.core.Direction;

public class CallDirectionProcedure {
	public static Direction execute(Direction direction) {
		if (direction == null)
			return Direction.NORTH;
		return direction;
	}
}
