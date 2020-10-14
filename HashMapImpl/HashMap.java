package HashMapImpl;

import LinkedListImpl.Node;

public class HashMap {
	
	private HashNode[] hashTable = null;
	private int bucketSize =16;
	private int size =0;
	
	public HashMap() {
		this.hashTable = new HashNode[bucketSize];
	}
	public boolean containsKey(String key) {
		HashNode target = find(key);
		return target!= null;
	}
	public String get(String key) {
		HashNode target = find(key);
		if(target!= null) {
			return target.value;
		}else {
			return null;
		}
	}
	public boolean remove(String key) {
		int pos = hash(key);
		HashNode target = hashTable[pos];
		HashNode prev = null;
		HashNode curr = target;
		while(curr != null && curr.key!= key) {
			prev = curr;
			curr= curr.next;
		}
		if(curr == null) return false;
		if(prev == null) {
			hashTable[pos] = curr.next;
		}else {
			prev.next = curr.next;
		}
		curr.next = null;
		size--;
		return true;
	}
	private HashNode find(String key) {
		int pos = hash(key);
		HashNode target = hashTable[pos];
		if(target!= null) {
			while(target != null && target.key != key) {
				target = target.next;
			}
		}
		return target;
	}
	public void put(String key, String value){
		int pos = hash(key);
		System.out.println("Position -"+pos +"key - "+key);
		HashNode curr = hashTable[pos];
		if(curr == null)
		hashTable[pos] = new HashNode(key, value);
		else {
			while(curr.next != null && curr.key != key) {
				curr= curr.next;
			}
			if(curr.key == key) {
				curr.value= value;
			}else {
				curr.next = new HashNode(key, value);
			}
		}
		size ++;
	}
	private int hash(String key) {
		return Math.abs(key.hashCode())%bucketSize;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder ();
		sb.append("{");
		for(int i=0;i<bucketSize;i++) {
			HashNode node = hashTable[i];
			while(node != null) {
				sb.append(node.key+":"+ node.value+",");
				node = node.next;
			}
		}
		sb.deleteCharAt(sb.length()-1);
		sb.append("}");
		return sb.toString();
	}
}
