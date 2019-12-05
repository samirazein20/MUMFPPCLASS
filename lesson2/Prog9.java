package lesson2;

public class Prog9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 4, 3, 8, 10, 11, 14, 16, 17, 20 };
		for (int i = 0; i < nums.length; i++) {

			if (i % 2 == 0) {
				System.out.println("Even Index " + i + ":" + nums[i]);
			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				System.out.println("Even Numbers:" + nums[i]);
			}

		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] % 2 == 0) {
				System.out.println("Number: " + nums[i] + "->" + "Even");
			} else {

				System.out.println("Number: " + nums[i] + "->" + "Odd");

			}

		}

	}

}
