package lab4.prog4_4;

import java.util.Arrays;


public class BinarySearchStr {

	public boolean search(String s, char c) {
		// implement
		int len = s.length();
		int m = len/2;
		char ch = s.charAt(m);
		
		
		if(s == null || s.isEmpty())
			return false;
		
		if(s.length() == 1)
			return s.charAt(0) == c;
		
		if(ch == c) {
			return true;
		}else if(c < ch) {
			if(search(s.substring(0, m), c)) {
				return true; 
			}else {
				return false;
			}
		}
		else {
			if(search(s.substring(m + 1),c)) {
				return true;
			}else {
				return false;
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchStr bss = new BinarySearchStr();
		System.out.println(bss.search("aeiouwxyz", 'w'));
		System.out.println(bss.search("aeiouwxyz", 'a'));

	}

}
