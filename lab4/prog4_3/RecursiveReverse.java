package lab4.prog4_3;

public class RecursiveReverse {

	public static String reverse(String s) {
		// implement
		
//		if (s.isEmpty())
//            return s;
        //Calling Function Recursively
        return reverseUtil(s);
	}
	
	public static String reverseUtil(String s) {
		// implement
		
		if (s.isEmpty())
            return s;
        //Calling Function Recursively
        return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
        String reversed = reverse(str);
        System.out.println("The reversed string is: " + reversed);
	}

}
