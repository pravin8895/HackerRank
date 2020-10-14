package LinkedListImpl;

public class LinkedList {
	Node head;
	Node tail;
	int size =0;
	
	public void add(int input) {
		Node temp = new Node(input);
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		size++;
	}
	public void remove(int index) {
		if(index < 0 || index > size-1) {
			System.out.println("Exception");
			return;
		}
		Node curr = head;
		Node prev =null;
		int i=0;
		while(curr != null && index != i) {
			prev =curr;
			curr = curr.next;
			i++;
		}
		prev.next = curr.next ;
		size--;
	}
	
	public void add(int input, int index) {
		if(index < 0 || index > size-1) {
			System.out.println("Exception");
			return;
		}
		Node curr = head;
		Node prev =null;
		int i=0;
		while(curr != null && index != i) {
			prev =curr;
			curr = curr.next;
			i++;
		}
		Node temp = new Node(input);
		if(prev == null) {
			temp.next = head;
			head = temp;
		}else {
			temp.next = prev.next ;
			prev.next = temp;
		}
		size++;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		sb.append("[");
		Node curr = head;
		while(curr != null) {
			sb.append(curr.data).append(",");
			curr = curr.next;
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
	}
}
