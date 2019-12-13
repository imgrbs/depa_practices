package sit.depa.observer.pattern;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PublisherTest {
	@Test
	void testPull() {
		Product subscriber = new Product("Candy");
		Customer adam = new Customer("Adam Smith");
		Customer george = new Customer("George Lang");
		subscriber.addSubscriber(adam);
		subscriber.addSubscriber(george);

		Publisher publisher = new Publisher();
		publisher.addSubscriber(subscriber);
		publisher.addSubscriber(new Product("Cookie"));
		publisher.pull();

		Assert.assertThat(Publisher.getSubscribers().size(), CoreMatchers.equalTo(2));

		Assert.assertThat(adam.getNotifications().size(), CoreMatchers.equalTo(1));
		Assert.assertThat(adam.getNotifications().get(0), CoreMatchers.equalTo("The status of Candy was changed to OUT_STOCK"));

		Assert.assertThat(george.getNotifications().size(), CoreMatchers.equalTo(1));
		Assert.assertThat(george.getNotifications().get(0), CoreMatchers.equalTo("The status of Candy was changed to OUT_STOCK"));
	}
}