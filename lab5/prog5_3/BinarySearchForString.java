package lab5.prog5_3;

import java.util.Arrays;

public class BinarySearchForString {

	public static void main(String[] args) {

		String[] adjs = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};

		//sorted array by using SelectionSortForString
		SelectionSortForString mySort = new SelectionSortForString();

		String[] sorted = mySort.sort(adjs);

		System.out.println(Arrays.toString(sorted));

		System.out.println("number? " + BinarySearchForString.binarySearch(sorted, "number"));
		System.out.println("tiny? " + BinarySearchForString.binarySearch(sorted, "tiny"));


	}

	public static boolean binarySearch(String[] temp, String key) {

		//implement
		int left = 0;
		int right = temp.length-1;
		
		while(left<=right) {
			int mid = (left + right)/2;
		}
		
		return false;
	}

}
