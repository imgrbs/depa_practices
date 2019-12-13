package sit.depa.observer.pattern;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProductTest {
	@Test
	void testChangeProductStatusToInStock() {
		Product product = new Product("Cookie");
		product.changeStatus(Status.IN_STOCK);
		Assert.assertThat(product.getStatus(), CoreMatchers.equalTo(Status.IN_STOCK));
	}

	@Test
	void testChangeProductStatusToOutStock() {
		Product product = new Product("Candy");
		product.changeStatus(Status.OUT_STOCK);
		Assert.assertThat(product.getStatus(), CoreMatchers.equalTo(Status.OUT_STOCK));
	}
}