package sit.depa.design.pattern.accessibility.instance;

import sit.depa.design.pattern.accessibility.state.OutState;

public class OutStateInstance {
	private static final OutState OUT_STATE = new OutState();

	public static OutState getInstance() {
		return OUT_STATE;
	}
}
