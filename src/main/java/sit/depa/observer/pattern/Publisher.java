package sit.depa.observer.pattern;

import java.util.ArrayList;
import java.util.List;

class Publisher {
	private static List<Observable> subscribers;

	Publisher() {
		if (subscribers == null) {
			subscribers = new ArrayList<>();
		}
	}

	static List<Observable> getSubscribers() {
		return subscribers;
	}

	void addSubscriber(Observable subscriber) {
		subscribers.add(subscriber);
	}

	void pull() {
		subscribers.forEach(Observable::pull);
	}
}
