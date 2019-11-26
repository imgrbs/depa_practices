package sit.depa.state.design.pattern.accessibility.state;

import sit.depa.state.design.pattern.accessibility.driver.Access;
import sit.depa.state.design.pattern.accessibility.instance.InStateInstance;

public class OutState implements AccessState {
	@Override
	public void next(Access access) {
		access.setState(InStateInstance.getInstance());
	}

	@Override
	public void previous(Access access) {
		return;
	}

	@Override
	public void exit(Access access) {
		return;
	}
}
