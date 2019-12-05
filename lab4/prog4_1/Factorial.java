package lab4.prog4_1;

/**
 * 
 * n!=n×(n−1)×(n−2)×...×3×2×1
 *
 * n! = n x (n-1)!
 * 0!=1
 */
public class Factorial {


	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println("With Recursion: " +f.factorial(5));
	}
	private int factorial(int n) {
		// implement
		if(n==0) return 1;
		else {
			return n * factorial(n-1);
		}
	}


}
