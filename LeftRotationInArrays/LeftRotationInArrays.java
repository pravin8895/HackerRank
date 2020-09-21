
public class LeftRotationInArrays {

	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5};
		print(shiftLeft(inputArray,4));
	}
	
	private static void print(int[] result) {
		System.out.print(result[0]);
		for(int i=1;i<result.length;i++) {
			System.out.print(" ");
			System.out.print(result[i]);
		}
	}

	static int[] shiftLeft(int[] inputArray, int shiftCount) {
		int arrayLength = inputArray.length,cache = 0;
		for(int iterator=0 ; iterator < shiftCount ; iterator++) {
			cache = inputArray[0];
			for(int internalIterator=0;internalIterator<arrayLength-1;internalIterator++) {
				inputArray[internalIterator]=inputArray[internalIterator+1];
			}
			inputArray[arrayLength-1]=cache;
		}
		return inputArray;
    }

}
