package HashMapImpl;

public class HashMapImpl {
	public static void main(String args[]) {
		HashMap x = new HashMap();
		x.put("hi","mama");
		x.put("one","mama");
		x.put("one","mamaoi");
		x.put("four","mama");
		x.put("hai","mama");
		System.out.println(x);
		System.out.println(x.containsKey("onea"));
		System.out.println(x.get("onea"));
		System.out.println(x.remove("onea"));
		System.out.println(x);
	}
} 
