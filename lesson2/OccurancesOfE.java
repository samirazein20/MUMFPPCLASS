package lesson2;

import java.util.*;

public class OccurancesOfE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Your Name\n");
		
		String input = s.next();
		char[] arr = input.toCharArray();
		int occurance = 0;
		char e = 'e';
//		for(int i=0; i<input.length(); i++) {
//			
//		}
		
		for(char ch: arr) {
			if(ch == e) {
				occurance++;
			}
		}
		s.close();
		System.out.println("Occurances Of E are : "+occurance);

	}

}
