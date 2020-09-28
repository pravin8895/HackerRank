import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GameOfThrones {

	public static void main(String[] args) {
		System.out.println(gameOfThrones("cdefghmnopqrstuvw"));
	}
	private static String gameOfThrones(String s) {
		char[] inputArray = s.toCharArray();
		Character cache = 'a';
		Map<Character,Integer> inputMap = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			cache = inputArray[i];
			if(inputMap.containsKey(cache)) {
				inputMap.put(cache, inputMap.get(cache)+1);
			}else {
				inputMap.put(cache, 1);
			}
		}
		int counter =0;
		 for(Integer x:inputMap.values()) {
			 if(x%2 ==1) {
				 counter++;
				 if(counter ==2) {
					 return "NO";
				 }
			 }
			 
		 }
		/* Map<Integer, Long> reducedMap = inputMap.values().stream().collect(Collectors.groupingBy(
					Function.identity(),
					Collectors.counting()));
		 for(Integer x:reducedMap.keySet()) {
			 if(x%2 == 1) {
				 counter++;
				 if(counter ==2) {
					 return "No";
				 }
			 }
		 }*/
		return "YES";
	}

}
