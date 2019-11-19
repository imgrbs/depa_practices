package sit.depa.design.pattern.cars;

import sit.depa.design.pattern.cars.state.Direction;
import sit.depa.design.pattern.cars.state.DirectionInstance;

public class Vehicle {
	private Direction direction = DirectionInstance.getNorthInstance();
	private Location location = new Location();

	protected void move(int distance) {
		direction.updateLocation(distance, location);
	}

	protected void turnLeft() {
		direction.turnLeft(this);
	}

	protected void turnRight() {
		direction.turnRight(this);
	}

	protected void uTurn() {
		direction.uTurn(this);
	}

	protected Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	protected Location getLocation() {
		return location;
	}
}
