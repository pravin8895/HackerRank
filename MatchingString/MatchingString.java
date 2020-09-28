public class MatchingString {
	public static void main(String[] args) {
		/*Enter the input here*/
		String firstString ="hi",secondString="world";
		System.out.println(isMatchingString(firstString,secondString));
	}

	private static String isMatchingString(String firstString,String secondString) {
		for(int iterator=0 ; iterator < firstString.length() ; iterator++) {
			if(secondString.contains(String.valueOf(firstString.charAt(iterator)))) {
				return "YES";
			}
			firstString = firstString.replaceAll(String.valueOf(firstString.charAt(iterator)), "");
		}
		return "NO";
	}
	
}
