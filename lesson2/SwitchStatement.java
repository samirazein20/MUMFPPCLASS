package lesson2;

import java.util.*;

public class SwitchStatement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intSample();

	}

	public static void intSample() {
		Scanner s = new Scanner(System.in);
		System.out.println("Pick an integer in the range 1...9");

		int numbers = s.nextInt();
		switch (numbers%2) {
		case 0:
			System.out.println("You chose an Even Number");
			break;
		
		default:
			System.out.println("You chose an Odd Number");
		}

	}

}
