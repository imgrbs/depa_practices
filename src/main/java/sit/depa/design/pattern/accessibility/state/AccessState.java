package sit.depa.design.pattern.accessibility.state;

import sit.depa.design.pattern.accessibility.driver.Access;

public interface AccessState {
	void next(Access access);
	void previous(Access access);
	void exit(Access access);
}
