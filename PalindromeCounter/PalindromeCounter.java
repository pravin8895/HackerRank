public class PalindromeCounter {
	public static void main(String[] args) {
		/*Enter the input here*/
		String input="tacocat";
		System.out.println(calculateNumberOfPalindromes(input));
	}

	private static int calculateNumberOfPalindromes(String input) {
		int inputLength = input.length() , palindromeCount = inputLength, iterator,internalIterator;
		for(iterator=0 ; iterator < inputLength ; iterator++) {
			for(internalIterator = inputLength ; internalIterator > iterator+1 ;internalIterator--) {
				if(checkPalindrome(input.substring(iterator, internalIterator))) {
					palindromeCount++;
				}
			}
		}
		return palindromeCount;
	}


	private static boolean checkPalindrome(String input) {
		char[] inputArray = input.toCharArray();
		int halfLength = inputArray.length/2;
		 for ( int iterator = 0,reverseIterator=inputArray.length-1 ; iterator < halfLength ; iterator++,reverseIterator-- ) {
			 if(inputArray[iterator] != inputArray[reverseIterator]) {
				 return false;
			 }
		 }
		 return true; 
	}
	
}
