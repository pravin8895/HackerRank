public class SpecialSubString {
	public static void main(String[] args) {
		/*Enter the input here*/
		String input="mnonopoo";
		System.out.println(calculateSpecialSubString(input));
	}

	private static int calculateSpecialSubString(String input) {
		int inputLength = input.length() , palindromeCount = inputLength, iterator,internalIterator;
		String cache ="";
		for(iterator=0 ; iterator < inputLength ; iterator++) {
			for(internalIterator = iterator+2 ; internalIterator <= inputLength ;internalIterator++) {
				cache = input.substring(iterator, internalIterator);
				if(!isInvalidString(cache)) {
					break;
				}
				if(isSpecialString(cache,internalIterator-iterator)) {
					palindromeCount++;
				}
			}
		}
		return palindromeCount;
	}

	private static boolean isInvalidString(String input) {
		input = input.replaceAll(String.valueOf(input.charAt(0)), "");
		if(input.isEmpty()) {
			return true;
		}
		input = input.replaceAll(String.valueOf(input.charAt(0)), "");
		return input.isEmpty();
	}
	
	private static boolean isSpecialString(String input,int length) {
		if(length%2 == 0) {
			return input.matches("["+input.charAt(0)+"]{"+ length+"}");
		}else{
			length = length/2;
			return input.matches("["+input.charAt(0)+"]{"+ length+"}[a-z]{1}"+"["+input.charAt(0)+"]{"+ length+"}");
		}
	}
	
}
