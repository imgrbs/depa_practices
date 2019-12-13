package sit.depa.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {
	private Status status;
	private String name;
	private List<Customer> customers;

	Product(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
		status = Status.OUT_STOCK;
	}

	@Override
	public void pull() {
		customers.forEach(customer -> {
			String message = String.format("The status of %s was changed to %s", this.name, this.status);
			customer.sendNotification(message);
		});
	}

	void addSubscriber(Customer customer) {
		customers.add(customer);
	}

	void changeStatus(Status status) {
		this.status = status;
	}

	Status getStatus() {
		return status;
	}
}

enum Status {
	IN_STOCK, OUT_STOCK
}