package sit.depa.design.pattern.accessibility.instance;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import sit.depa.design.pattern.accessibility.state.InnerState;
import sit.depa.design.pattern.accessibility.state.OutState;
import sit.depa.design.pattern.accessibility.state.InState;

class StateInstanceTest {
	@Test
	void testGetOutStateInstance() {
		Assert.assertThat(OutStateInstance.getInstance().getClass(), CoreMatchers.equalTo(OutState.class));
	}

	@Test
	void testGetInStateInstance() {
		Assert.assertThat(InStateInstance.getInstance().getClass(), CoreMatchers.equalTo(InState.class));
	}

	@Test
	void testGetInnerStateInstance() {
		Assert.assertThat(InnerStateInstance.getInstance().getClass(), CoreMatchers.equalTo(InnerState.class));
	}
}