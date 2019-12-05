package lab4.prog4_2;

public class Factorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.factorialWithoutRecursion(5) );

	}
	private int factorialWithoutRecursion(int n) {
		// implement
		int res = 1;
		for(int i = 0; i<n; i++) {
			res = n*factorialWithoutRecursion(n-1);
		}
		
		return res;
	}

}
