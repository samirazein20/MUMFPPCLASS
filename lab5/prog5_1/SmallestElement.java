package lab5.prog5_1;

import java.util.Arrays;

/**
 *
 * swap the smallest element to 0th position in the array
 *
 */
public class SmallestElement {

	public static void main(String[] args) {

		int[] nums = { 16, 35, 7, 1, -4, 36, 49 };
		System.out.println(Arrays.toString(nums));

		//implement

		
//		[-4, 35, 7, 1, 16, 36, 49] is the expected output.
		
		int index = 0;
		int smallest = nums[0];
		
		for(int i = 0; i<nums.length; i++) {
			if(smallest>nums[i]) {
				smallest = nums[i];
			}
		}
		//swapping
		int temp = nums[0];
		nums[0] = nums[index];
		nums[index] = nums[0];
		
		System.out.println(Arrays.toString(nums));
	}

}
