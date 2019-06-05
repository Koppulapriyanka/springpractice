package stringproblems;

public class Node<D> {

	private D data;
	private Node<D> nextNode;
	
	
	public Node() {
		super();
		this.data = null;
		this.nextNode = null;
	}
	
	public Node(D data, Node<D> nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public Node(D data) {
		super();
		this.data = data;
		this.nextNode = null;
	}
	
	public D getData() {
		return data;
	}
	public void setData(D data) {
		this.data = data;
	}
	public Node<D> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<D> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return  data.toString();
	}
	
	
	
	
}
