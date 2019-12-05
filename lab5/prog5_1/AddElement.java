package lab5.prog5_1;

import java.util.Arrays;
/**
 *
 * Add the element 9 at the position 1 
 *
 */
public class AddElement {

	public static void main(String[] args) {

		int[] nums = new int[8];
		
		nums[0] = 4;
		nums[1] = 5;
		nums[2] = 7;
		nums[3] = 1;
		nums[4] = 3;
		
		System.out.println(Arrays.toString(nums));
		
		//implement
		//added element 9 at pos 1: [4, 9, 5, 7, 1, 3, 0, 0]

		int position = 1;
		int lastIndex = 4;
		int value = 9;
		
		for(int i = lastIndex; i>=position; i--) {
			if(i>position) {
				nums[i+1] = nums[i];
			}
			if(i == position) {
				nums[i]=nums[i];
			}
		}
		
		

	}

}