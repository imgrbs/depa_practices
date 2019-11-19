package sit.depa.design.pattern.cars.state;

public class DirectionInstance {
	public final static North NORTH = new North();
	public final static South SOUTH = new South();
	public final static West WEST = new West();
	public final static East EAST = new East();

	public static North getNorthInstance() {
		return NORTH;
	}

	public static South getSouthInstance() {
		return SOUTH;
	}

	public static West getWestInstance() {
		return WEST;
	}

	public static East getEastInstance() {
		return EAST;
	}
}
