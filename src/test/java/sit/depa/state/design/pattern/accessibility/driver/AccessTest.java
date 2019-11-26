package sit.depa.state.design.pattern.accessibility.driver;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import sit.depa.state.design.pattern.accessibility.state.InnerState;
import sit.depa.state.design.pattern.accessibility.state.InState;
import sit.depa.state.design.pattern.accessibility.state.OutState;

class AccessTest {
	@Test
	void testGetIn1TimeShouldBeInState() {
		Access access = new Access();

		access.getIn();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(InState.class));
	}

	@Test
	void testGetIn2TimesShouldBeInnerState() {
		Access access = new Access();

		access.getIn();
		access.getIn();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(InnerState.class));
	}

	@Test
	void testGetIn3TimesShouldBeInnerState() {
		Access access = new Access();

		access.getIn();
		access.getIn();
		access.getIn();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(InnerState.class));
	}

	@Test
	void testGetOut1TimeShouldBeOutState() {
		Access access = new Access();

		access.getOut();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));
	}

	@Test
	void testGetIn1TimeThenGetOut1TimeShouldBeOutState() {
		Access access = new Access();

		access.getIn();
		access.getOut();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));
	}

	@Test
	void testGetIn2TimesThenGetOut1TimeShouldBeInState() {
		Access access = new Access();

		access.getIn();
		access.getIn();
		access.getOut();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(InState.class));
	}

	@Test
	void testGetIn3TimesThenGetOut1TimeShouldBeInState() {
		Access access = new Access();

		access.getIn();
		access.getIn();
		access.getIn();
		access.getOut();

		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(InState.class));
	}

	@Test
	void testExit() {
		Access access = new Access();

		access.exit();
		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));

		access.getIn();
		access.exit();
		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));

		access.getIn();
		access.getIn();
		access.exit();
		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));

		access.getIn();
		access.getIn();
		access.getIn();
		access.exit();
		Assert.assertThat(access.getState().getClass(), CoreMatchers.equalTo(OutState.class));
	}
}