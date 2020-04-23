
public class Stack {
	class Node{
		public int e;
		public Node next;
		public Node(int element) {
			e=element;
		}
	}
	private Node top;
	private int size;
	public Stack() {
		top=null;
		size=0;
	}
	
	public int peek() {
		if(top==null)
			return 0;
		return top.e;
	}
	
	public int size() {
		return size;
	}
	
	public int pop() {
		if(top==null)
			return 0;
		int result=top.e;
		top=top.next;
		size--;
		return result;
	}
	
	public void push(int e) {
		Node n=new Node(e);
		n.next=top;
		top=n;
		size++;
	}
}
