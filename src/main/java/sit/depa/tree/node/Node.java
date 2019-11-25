package sit.depa.tree.node;

public abstract class Node {
	int value;
	Node left;
	Node right;

	public Node add(int value) {
		return null;
	}

	public int getValue() {
		return value;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
}
