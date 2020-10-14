package ArrayListImpl;

public class ArrayList {
	
	int arr[] = null;
	int capacity = 10;
	int size = 0;
	public ArrayList() {
		this.arr = new int[capacity];
	}
	public ArrayList(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}
	public void add(int input) {
		if(size == capacity) {
			capacity += capacity>>1;
			int newArr[] = new int[capacity];
			for(int i=0;i<size;i++) {
				newArr[i]= arr[i];
			}
			arr = newArr;
		}
		arr[size++] =input;
	}
	public void add(int input, int index) {
		if(index > size-1) {
			System.out.println("Index out of bound exception");
			return;
		}
		for(int i=size;i>index;i--) {
			arr[i]= arr[i-1];
		}
		arr[index] =input;
		size++;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(arr[i]).append(",");
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("]");
		return sb.toString();
		
	}
}
