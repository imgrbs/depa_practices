package sit.depa.observer.pattern;

import java.util.ArrayList;
import java.util.List;

class Customer {
	private String name;
	private List<String> notifications;

	Customer(String name) {
		this.name = name;
		this.notifications = new ArrayList<>();
	}

	void sendNotification(String message) {
		this.notifications.add(message);
	}

	List<String> getNotifications() {
		return notifications;
	}

	public String getName() {
		return name;
	}
}
