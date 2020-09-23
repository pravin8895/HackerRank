import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayManipulation {

	public static void main(String[] args) {
		int[][] queries = {{1,2,100},
				{2,5,100},
				{3,4,100}};
		System.out.println(arrayManipulation(5,queries));
	}
	 private static long arrayManipulation(int n, int[][] queries) {
		 Map<Integer,Long> arrayMap = new HashMap<>();
		 int length =queries.length,iterator =1;
		 int startingLoop =0, endingLoop = 0,incrementValue =0;
		 for(;iterator<=n;iterator++) {
			 arrayMap.put(iterator, 0L);
		 }
		 
		 for(iterator=0;iterator<length;iterator++) {
			 startingLoop = queries[iterator][0];
			 endingLoop = queries[iterator][1];
			 incrementValue = queries[iterator][2];
			 for(;startingLoop<=endingLoop;startingLoop++){
					 arrayMap.put(startingLoop, arrayMap.get(startingLoop)+incrementValue);
			 }
		 }
		 return Collections.max(arrayMap.values());
	    }

}
