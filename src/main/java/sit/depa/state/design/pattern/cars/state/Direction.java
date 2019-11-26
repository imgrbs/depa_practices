package sit.depa.state.design.pattern.cars.state;

import sit.depa.state.design.pattern.cars.Location;
import sit.depa.state.design.pattern.cars.Vehicle;

public interface Direction {
	void updateLocation(int distance, Location location);
	void turnLeft(Vehicle vehicle);
	void turnRight(Vehicle vehicle);
	void uTurn(Vehicle vehicle);
}
