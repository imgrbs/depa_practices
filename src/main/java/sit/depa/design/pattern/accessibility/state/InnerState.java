package sit.depa.design.pattern.accessibility.state;

import sit.depa.design.pattern.accessibility.driver.Access;
import sit.depa.design.pattern.accessibility.instance.InStateInstance;
import sit.depa.design.pattern.accessibility.instance.OutStateInstance;

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
