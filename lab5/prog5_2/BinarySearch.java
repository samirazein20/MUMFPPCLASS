package lab5.prog5_2;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		//sorted array
		int[] nums = {-4, 1, 7, 16, 35, 36, 49};

		System.out.println(Arrays.toString(nums));
		System.out.println("Is 16 in the Array?: " + BinarySearch.binarySearch(nums, 16));
		System.out.println("Is 7 in the Array?: " + BinarySearch.binarySearch(nums, 7));
		System.out.println("Is 40 in the Array?: " + BinarySearch.binarySearch(nums, 40));

//		Collections.binarySearch();
//		Arrays.binarySearch(a, key);

	}

	public static boolean binarySearch(int[] temp, int key) {
		
		//implement
		
		int left = 0;
		int right = temp.length - 1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(temp[mid]==key) {
				return true;
			}
			else if(key<=temp[mid]) {
				
				//update right
				right = mid - 1;
				
			}
			else {
				//update left
				left = mid + 1;
			}
		}
		
		return false;
	}
}


