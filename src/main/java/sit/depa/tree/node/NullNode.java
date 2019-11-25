package sit.depa.tree.node;

public class NullNode extends Node {
	private static final Node node = new NullNode();

	private NullNode() {
		super();
	}

	@Override
	public Node add(int value) {
		return new NodeImpl(value);
	}

	public static Node getInstance() {
		return node;
	}
}
