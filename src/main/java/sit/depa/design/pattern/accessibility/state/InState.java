package sit.depa.design.pattern.accessibility.state;

import sit.depa.design.pattern.accessibility.driver.Access;
import sit.depa.design.pattern.accessibility.instance.InnerStateInstance;
import sit.depa.design.pattern.accessibility.instance.OutStateInstance;

public class InState implements AccessState {
	@Override
	public void next(Access access) {
		access.setState(InnerStateInstance.getInstance());
	}

	@Override
	public void previous(Access access) {
		this.exit(access);
	}

	@Override
	public void exit(Access access) {
		access.setState(OutStateInstance.getInstance());
	}
}
