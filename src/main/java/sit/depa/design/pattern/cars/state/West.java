package sit.depa.design.pattern.cars.state;

import sit.depa.design.pattern.cars.Location;
import sit.depa.design.pattern.cars.Vehicle;

public class West implements Direction {
	@Override
	public void updateLocation(int distance, Location location) {
		location.setX(location.getY() - distance);
	}

	@Override
	public void turnLeft(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getSouthInstance());
	}

	@Override
	public void turnRight(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getNorthInstance());
	}

	@Override
	public void uTurn(Vehicle vehicle) {
		vehicle.setDirection(DirectionInstance.getEastInstance());
	}
}
