package sit.depa.design.pattern.cars.state;

import sit.depa.design.pattern.cars.Location;
import sit.depa.design.pattern.cars.Vehicle;

public interface Direction {
	void updateLocation(int distance, Location location);
	void turnLeft(Vehicle vehicle);
	void turnRight(Vehicle vehicle);
	void uTurn(Vehicle vehicle);
}
