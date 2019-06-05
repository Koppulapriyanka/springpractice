package stringproblems;

public class LinkedList {
	
	private Node<Entry<Integer, String>> head;
	
	public void append(Entry<Integer, String> data){
		Node<Entry<Integer, String>> tmp = new Node<Entry<Integer, String>>(data);
		if(this.head == null){
			head = tmp;
		}else{
			Node<Entry<Integer, String>> itr = head;
			while(itr.getNextNode() != null){
				itr = itr.getNextNode();
			}
			itr.setNextNode(tmp);
		}
		
	}
	
	public void remove(int index){
		if(this.head == null){
			System.err.println("Invoded Linked List is empty. Can't remove from the empty list");
		}else{
			Node<Entry<Integer, String>> itr = head;
			for(int i=0; itr.getNextNode() != null;i++){
				if((i+1)==index){
					itr.setNextNode(itr.getNextNode().getNextNode());
					break;
				}
			}
		}
	}
	

	public LinkedList() {
		super();
		head = null;
	}

	public Node<Entry<Integer, String>> getHead() {
		return head;
	}

	public void setHead(Node<Entry<Integer, String>> head) {
		this.head = head;
	}
	
	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		if(head == null){
			return null;
		}else{
			Node<Entry<Integer, String>> it = head;
			do{
				stringBuilder.append("(");
				stringBuilder.append(it.getData()).append(")");
				it = it.getNextNode();
			}while(it != null);
			return stringBuilder.toString();
		}
		
	}
	

}
