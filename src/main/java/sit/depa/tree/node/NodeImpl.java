package sit.depa.tree.node;

public class NodeImpl extends Node {

	public NodeImpl(int value) {
		this.value = value;
		left = NullNode.getInstance();
		right = NullNode.getInstance();
	}

	@Override
	public Node add(int value) {
		if (this.value > value) {
			left = left.add(value);
		}
		if (this.value < value) {
			right = right.add(value);
		}
		return this;
	}
}
