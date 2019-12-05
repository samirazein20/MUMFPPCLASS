package lesson2;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QUESTION ONE
		
//		String s = "a friendly face";
//		System.out.println(s.charAt(2));
//		System.out.println(s.length());
//		System.out.println(s.substring(2,9));
//		System.out.println(s.substring(4));
		
//		String s1 = "Hello";
//		String s2 = new String("Hello");
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.compareTo(s2));
//		
//		char[] chars = "Doraemon".toCharArray();
//		
//		System.out.println("Welcome to Doraemon".indexOf('W'));
//		System.out.println(chars);
		
		//QUESTION TWO
		
		int n = 5;
		int[] arr;
		for (int i = 0; i < n;i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf("%-3s", "*");
			}
			System.out.println();
		}
		

	}

}
