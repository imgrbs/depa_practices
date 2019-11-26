package sit.depa.state.design.pattern.cars.state;

import sit.depa.state.design.pattern.cars.Location;
import sit.depa.state.design.pattern.cars.Vehicle;

public class North implements Direction {
	@Override
	public void updateLocation(int distance, Location location) {
		location.setY(location.getY() + distance);
	}

	@Override
	public void turnLeft(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getWestInstance());
	}

	@Override
	public void turnRight(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getEastInstance());
	}

	@Override
	public void uTurn(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getSouthInstance());
	}
}
