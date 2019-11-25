package sit.depa.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	void addLeftNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(10);
		Assert.assertThat(tree.getRoot().getLeft().getValue(), CoreMatchers.equalTo(10));
	}

	@Test
	void addRightNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(25);
		Assert.assertThat(tree.getRoot().getRight().getValue(), CoreMatchers.equalTo(25));
	}

	@Test
	void addLeftAndRightNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(10);
		tree.add(25);
		Assert.assertThat(tree.getRoot().getLeft().getValue(), CoreMatchers.equalTo(10));
		Assert.assertThat(tree.getRoot().getRight().getValue(), CoreMatchers.equalTo(25));
	}

	@Test
	void addLeftToNestedLeftNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(10);
		tree.add(5);
		Assert.assertThat(tree.getRoot().getLeft().getValue(), CoreMatchers.equalTo(10));
		Assert.assertThat(tree.getRoot().getLeft().getLeft().getValue(), CoreMatchers.equalTo(5));
	}

	@Test
	void addRightToNestedLeftNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(10);
		tree.add(15);
		Assert.assertThat(tree.getRoot().getLeft().getValue(), CoreMatchers.equalTo(10));
		Assert.assertThat(tree.getRoot().getLeft().getRight().getValue(), CoreMatchers.equalTo(15));
	}

	@Test
	void addLeftToNestedRightNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(30);
		tree.add(25);
		Assert.assertThat(tree.getRoot().getRight().getValue(), CoreMatchers.equalTo(30));
		Assert.assertThat(tree.getRoot().getRight().getLeft().getValue(), CoreMatchers.equalTo(25));
	}

	@Test
	void addRightToNestedRightNode() {
		BinaryTree tree = new BinaryTree(20);
		tree.add(30);
		tree.add(35);
		Assert.assertThat(tree.getRoot().getRight().getValue(), CoreMatchers.equalTo(30));
		Assert.assertThat(tree.getRoot().getRight().getRight().getValue(), CoreMatchers.equalTo(35));
	}
}