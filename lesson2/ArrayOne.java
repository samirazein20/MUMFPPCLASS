package lesson2;

import java.util.*;
public class ArrayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array elements are accessed using the index
		//memory is allocated wen new keyword is used
		
		//QUESTION 2(b)
		int x = 30;
		int[] numbers = new int[x];//declaring and creating an array
		x=60;
		System.out.println("x is "+x);
		System.out.println("The size is "+numbers.length);
		
		//QUESTION 5
		int[] myList;
		myList= new int[10];//declaring and creating an array
		myList=new int[20];
		System.out.println(myList.toString());
		
		//QUESTION 7
		int[] smallPrimes = {2,3,5,7,11,13};
		int[] luckyNums = {1001,1002,1003,1004,1005,1006,1007};
		
		System.arraycopy(smallPrimes, 2, luckyNums, 3, 4);
		
//		System.out.println(Arrays.toString(luckyNums));

	}

}
