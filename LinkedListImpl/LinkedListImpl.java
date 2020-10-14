package LinkedListImpl;

public class LinkedListImpl {
	public static void main(String args[]) {
		LinkedList x= new LinkedList();
		x.add(1);
		x.add(2);
		x.add(3);
		System.out.println(x);
		x.add(0,1);
		System.out.println(x);
		x.remove(1);
		System.out.println(x);
	}
}
