
public class CountingValley {

	public static void main(String[] args) {
		System.out.println(countingValleys(8,"UDDDUDUU"));
	}
	
	static int countingValleys(int length, String input) {
        int steep = 0,valleyCount = 0;
        boolean isValley = false;
        char[] inputArray = input.toCharArray();
        for(int iterator = 0 ; iterator < length ; iterator++) {
            if(inputArray[iterator]=='U') {
                steep++;
            }else{
                steep--;
            }
            
            if(steep == 0) {
                isValley = false; 
            }
                
            if(!isValley && steep<0) {
            	valleyCount++;
                isValley = true;
            }
        }
        return valleyCount;
   }

}
