import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagazineAndRansomNote {
	public static void main(String[] args) {
		/*Enter the input here*/
		String[] magazine = {"give","me","one","grand","today","night"};
		String[] note = {"give","one","grand","today"};
		System.out.println(checkMagazine(magazine,note));
	}

	private static String checkMagazine(String[] magazine,String[] note) {
		List<String> magazineList = new ArrayList<>();
		int iterator,position;
		for(iterator=0;iterator<magazine.length;iterator++) {
			magazineList.add(magazine[iterator]);
		}
		for(iterator=0;iterator<note.length;iterator++) {
			position = magazineList.indexOf(note[iterator]);
			if(position == -1) {
				return "No";
			}
			magazineList.remove(position);
		}
		return "Yes";
	        
	}
	
}
