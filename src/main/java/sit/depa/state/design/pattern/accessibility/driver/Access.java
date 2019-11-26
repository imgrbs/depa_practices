package sit.depa.state.design.pattern.accessibility.driver;

import sit.depa.state.design.pattern.accessibility.instance.OutStateInstance;
import sit.depa.state.design.pattern.accessibility.state.AccessState;

public class Access {
	private AccessState state = OutStateInstance.getInstance();

	void getIn() {
		state.next(this);
	}

	void getOut() {
		state.previous(this);
	}

	void exit() {
		state.exit(this);
	}

	public void setState(AccessState state) {
		this.state = state;
	}

	AccessState getState() {
		return state;
	}
}
