package lab4.prog4_2;

import java.util.Arrays;


public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibWithoutRecursion(5));
	}

	private int fibWithoutRecursion(int n) {
		// implement
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		for(int i = 2; i<=n; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
		
		return sum;
	}
}