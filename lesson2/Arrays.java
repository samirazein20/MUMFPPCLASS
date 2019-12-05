package lesson2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,6,75,5,7,1,-3};
		int sum = 0;
		int greater = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		System.out.println("The sum of elements is:"+ sum);
		
		
		for(int j: arr) {
			if(greater < arr[j]) {
				greater = arr[j];
			}
		}
		
		System.out.println("The greater element is:"+ greater);

	}

}
