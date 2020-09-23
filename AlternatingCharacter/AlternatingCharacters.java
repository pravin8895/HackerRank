public class AlternatingCharacters {

	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AABAAB"));
	}
	private static int alternatingCharacters(String inputString) {
		char[] inputArray = inputString.toCharArray();
		int deleteCount = 0, inputLength = inputString.length();
		boolean isA = isA(inputArray[0]);
		for(int iterator = 1 ; iterator < inputLength ; iterator++) {
			if(isA == isA(inputArray[iterator])) {
				deleteCount++;
			}else {
				isA = !isA;
			}
		}
		return deleteCount;
	}
	private static boolean isA(char inputCharacter) {
		return ("A").equals(String.valueOf(inputCharacter));
	}

}
