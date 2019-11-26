package sit.depa.state.design.pattern.accessibility.instance;

import sit.depa.state.design.pattern.accessibility.state.InnerState;

public class InnerStateInstance {
	private static final InnerState INNER_STATE = new InnerState();

	public static InnerState getInstance() {
		return INNER_STATE;
	}
}
