package lab4.prog4_1;

/**
 * 
 *
 * F0 = 0, F1 = 1, F2 = 1, F3 = 2, F4 = 3, F5 = 5,�,
 * 0  1  1  2  3  5  8	13
 * F0 F1 F2 F3 F4 F5 F6 F7
 */
public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println("With Recursion: " + f.fib(5));

	}

	private int fib(int n) {
		// implement
		if(n==0||n==1) return n;
		else {
		
			return fib(n-1) + fib(n -2);
		}
		
	}
}
