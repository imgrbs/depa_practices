package sit.depa.state.design.pattern.accessibility.state;

import sit.depa.state.design.pattern.accessibility.driver.Access;
import sit.depa.state.design.pattern.accessibility.instance.InStateInstance;
import sit.depa.state.design.pattern.accessibility.instance.OutStateInstance;

public class InnerState implements AccessState {
	@Override
	public void next(Access access) {
		return;
	}

	@Override
	public void previous(Access access) {
		access.setState(InStateInstance.getInstance());
	}

	@Override
	public void exit(Access access) {
		access.setState(OutStateInstance.getInstance());
	}
}
