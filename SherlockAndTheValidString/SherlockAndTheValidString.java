import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockAndTheValidString {
	
	private static final String YES = "YES";
	private static final String NO = "NO";
	
	public static void main(String[] args) {
		System.out.println(isValid("aaaaabc"));
	}
	private static String isValid(String inputString) {
		char[] inputArray = inputString.toCharArray();
		final Long initialValue = 0L;
		final int integerOne =1;
		Character inputChar;
		int inputLength = inputString.length();
		
		Map<Character,Integer> inputMap = new HashMap<>();
		for(int iterator = 0 ; iterator < inputLength ; iterator++) {
			inputChar = inputArray[iterator];
			if(inputMap.containsKey(inputChar)) {
				inputMap.put(inputChar, inputMap.get(inputChar)+integerOne);
			}else {
				inputMap.put(inputChar, integerOne);
			}
		}
		 Map<Integer, Long> reducedMap = inputMap.values()
				 						.stream()
				 						.collect(Collectors.groupingBy(
				 								Function.identity(),
				 								Collectors.counting()));
		if(reducedMap.size()==integerOne) {
			return YES;
		}
		if(reducedMap.size()>2) {
			return NO;
		}
		Long longCache =initialValue;
		for(Long value:reducedMap.values()) {
			if(longCache == initialValue ) {
				longCache = value;
			}else {
				if(longCache > integerOne &&  value > integerOne
						&& !(longCache == integerOne || value == integerOne )) {
					return NO;
				}
			}
		}
		int intCache = 0;
		for(Integer y:reducedMap.keySet()) {
			if(intCache == 0 ) {
				intCache = y;
			}else {
				if(Math.abs(intCache-y) > integerOne ) {
					if((intCache == integerOne || y == integerOne ) && reducedMap.containsKey(integerOne) && reducedMap.get(integerOne)== integerOne) {
						return YES;
					}
					return NO;
				}
			}
		}
		return YES;
	}

}
