public class StrangeCounter {

	public static void main(String[] args) {
		System.out.println(strangeCounter(17));
	}
	private static long strangeCounter(long input) {
		long startingValue=3;
		boolean isValid = false;
		for(long index=1;;index++) {
			if(!isValid)
				if(input>=index && input<=index+startingValue-1) {
					isValid=true;
				}else {
					index=index+startingValue-1;
					startingValue=startingValue*2;
				}
			
			if(isValid) {
				return startingValue-input+index;
			}
		}
		
	}

}
