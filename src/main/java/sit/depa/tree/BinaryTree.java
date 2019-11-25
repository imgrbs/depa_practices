package sit.depa.tree;

import sit.depa.tree.node.Node;
import sit.depa.tree.node.NodeImpl;

public class BinaryTree {
	private Node root;

	BinaryTree(int value) {
		this.root = new NodeImpl(value);
	}

	void add(int value) {
		root.add(value);
	}

	Node getRoot() {
		return root;
	}
}
