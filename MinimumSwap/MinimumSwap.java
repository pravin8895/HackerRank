import java.util.HashMap;
import java.util.Map;

public class MinimumSwap {

	public static void main(String[] args) {
		int[] inputArray = {4,3,1,2};
		System.out.println(minimumSwaps(inputArray));
	}

	private static int minimumSwaps(int[] inputArray) {
		int maxLength = inputArray.length;
		int swapCount =0,temp;
		Map<Integer,Integer> intMap = new HashMap<>();
		for(int iterator=0;iterator<maxLength;iterator++) {
			intMap.put(inputArray[iterator], iterator);
		}
		for(int iterator=0;iterator<maxLength;iterator++) {
			if(inputArray[iterator] != iterator+1) {
				swapCount++;
				temp = intMap.get(iterator+1);
				inputArray[temp] = inputArray[iterator];
				intMap.put(inputArray[temp], temp);
				inputArray[iterator] = iterator+1;
				intMap.put(inputArray[iterator], iterator);
			}
		}
		return swapCount;
	}



}
