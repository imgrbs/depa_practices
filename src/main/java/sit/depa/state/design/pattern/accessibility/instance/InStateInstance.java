package sit.depa.state.design.pattern.accessibility.instance;

import sit.depa.state.design.pattern.accessibility.state.InState;

public class InStateInstance {
	private static final InState IN_STATE = new InState();

	public static InState getInstance() {
		return IN_STATE;
	}
}
