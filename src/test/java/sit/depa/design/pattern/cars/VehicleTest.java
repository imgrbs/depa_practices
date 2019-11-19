package sit.depa.design.pattern.cars;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import sit.depa.design.pattern.cars.state.East;
import sit.depa.design.pattern.cars.state.North;
import sit.depa.design.pattern.cars.state.South;
import sit.depa.design.pattern.cars.state.West;

class VehicleTest {

	@Test
	void testMoveCarWithNorthDirection() {
		Vehicle vehicle = new Vehicle();
		
		vehicle.move(100);
		
		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(North.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(0));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(100));
	}

	@Test
	void testTurnLeftWithNorthDirectionAndMoveOn() {
		Vehicle vehicle = new Vehicle();
		
		vehicle.turnLeft();
		vehicle.move(20);
		
		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(West.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(-20));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(0));
	}

	@Test
	void testTurnRightWithNorthDirectionAndMoveOn() {
		Vehicle vehicle = new Vehicle();
		
		vehicle.turnRight();
		vehicle.move(40);
		
		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(East.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(40));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(0));
	}

	@Test
	void testUturnWithNorthDirectionAndMoveOn() {
		Vehicle vehicle = new Vehicle();

		vehicle.uTurn();
		vehicle.move(50);

		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(South.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(0));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(-50));
	}

	@Test
	void testTurnLeftWithWestDirectionAndMoveOn() {
		Vehicle vehicle = new Vehicle();

		vehicle.turnLeft();
		vehicle.move(50);
		vehicle.turnLeft();
		vehicle.move(50);

		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(South.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(-50));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(-50));
	}

	@Test
	void testTurnRightWithEastDirectionAndMoveOn() {
		Vehicle vehicle = new Vehicle();

		vehicle.turnRight();
		vehicle.move(150);

		vehicle.turnRight();
		vehicle.move(300);

		Assert.assertThat(vehicle.getDirection().getClass(), CoreMatchers.equalTo(South.class));
		Assert.assertThat(vehicle.getLocation().getX(), CoreMatchers.equalTo(150));
		Assert.assertThat(vehicle.getLocation().getY(), CoreMatchers.equalTo(-300));
	}
}