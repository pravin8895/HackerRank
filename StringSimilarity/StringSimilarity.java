public class StringSimilarity {

	public static void main(String[] args) {
		String inputString="ababaa";
		System.out.println(stringSimilarity(inputString));

	}
	private static int stringSimilarity(String inputString) {
		char[] inputArray = inputString.toCharArray();
		int count=0,iterator,internalIterator, iteratorCount= inputArray.length,internalIteratorCount = iteratorCount-1;
		for(iterator=1;iterator<iteratorCount;iterator++) {
			for(internalIterator=0;internalIterator<internalIteratorCount;internalIterator++) {
				if(inputArray[internalIterator]==inputArray[internalIterator+iterator]) {
					count++;
				}else {
					break;
				}
			}
			internalIteratorCount--;
		}
		return count+iteratorCount;
	}

}
