package DoublyLinkedListImpl;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int size =0;
	public int get(int index) {
		if(index < 0 || index > size-1 ) {
			System.out.println("Exception");
		}
		int mid = (size-1)/2;
		Node target =null;
		if(mid>index) {
			target = findForward(index);
		}else{
			target = findBackward(index);	
		}
		return target.data;
		
	}
	public Node findBackward(int index) {
		int i=size-1;
		Node curr = tail;
		while(curr != null && i != index) {
			curr = curr.prev;
			i--;
		}
		System.out.println("Backward");
		return curr;
		
	} 
	
	public Node findForward(int index) {
		int i=0;
		Node curr = head;
		while(curr != null && i != index) {
			curr =curr.next;
			i++;
		}
		System.out.println("Forward");
		return curr;
	}
	public void add(int input) {
		Node temp = new Node(input);
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			tail.next = temp; 
			temp.prev = tail;
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
