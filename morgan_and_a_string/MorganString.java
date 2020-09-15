public class MorganString {

	public static void main(String[] args) {
		String firstString="JACK",secondString="DANIEL";
		System.out.println(morganString(firstString,secondString));

	}

	private static String morganString(String firstString, String secondString) {
		StringBuilder resultString = new StringBuilder();
		int firstStringLength = firstString.length(), secondStringLength = secondString.length() ,
			maxCount = firstStringLength + secondStringLength , firstStringIterator=0 ,secondStringIterator = 0;
		for(int iterator=0;iterator<maxCount;iterator++) {
			if(firstStringIterator >= firstString.length()) {
				resultString.append(secondString.charAt(secondStringIterator));
				secondStringIterator++;
			}else if(secondStringIterator >= secondString.length()) {
				resultString.append(firstString.charAt(firstStringIterator));
				firstStringIterator++;
			}else if(firstString.charAt(firstStringIterator) == secondString.charAt(secondStringIterator)) {
				if(checkMinimal(firstString,secondString,firstStringIterator,secondStringIterator)) {
					resultString.append(secondString.charAt(secondStringIterator));
					secondStringIterator++;
				}else {
					resultString.append(firstString.charAt(firstStringIterator));
					firstStringIterator++;
				}
			}else if(firstString.charAt(firstStringIterator) > secondString.charAt(secondStringIterator)) {
				resultString.append(secondString.charAt(secondStringIterator));
				secondStringIterator++;
			}else {
				resultString.append(firstString.charAt(firstStringIterator));
				firstStringIterator++;
			}
		}
		return resultString.toString();
	}

	private static boolean checkMinimal(String firstString, String secondString,
			int firstStringIterator, int secondStringIterator) {
		if(secondStringIterator>=secondString.length()) {
			return false;
		}else if(firstStringIterator>=firstString.length()) {
			return true;
		}else if(firstString.charAt(firstStringIterator)>secondString.charAt(secondStringIterator)) {
			return true;
		}else if(firstString.charAt(firstStringIterator)<secondString.charAt(secondStringIterator)) {
			return false;
		}else {
			return checkMinimal(firstString,secondString,firstStringIterator+1,secondStringIterator+1);
		}
	}

}
