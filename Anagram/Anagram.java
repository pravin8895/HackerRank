public class Anagram {

	public static void main(String[] args) {
		System.out.println(makeAnagram("cde","abc"));
	}
	private static int makeAnagram(String firstString, String secondString) {
		char[] stringArray = firstString.toCharArray();
		int count =0,maxLength = firstString.length()+secondString.length();
		for(int iterator=0;iterator<firstString.length();iterator++) {
			if(secondString.contains(String.valueOf(stringArray[iterator]))) {
				secondString = secondString.replaceFirst(String.valueOf(stringArray[iterator]), "");
				count++;
			}
		}
		return maxLength-(count*2);
    }

}
