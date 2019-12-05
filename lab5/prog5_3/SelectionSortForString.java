package lab5.prog5_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SelectionSortForString {

	public static void main(String[] args) {

		String[] adjs = {"big", "small", "tall", "short", "round", "square",
		                 "enormous", "tiny","gargantuan", "lilliputian",
		                 "numberless", "none", "vast", "miniscule"};


//		Arrays.sort(adjs);
		
		SelectionSortForString.sort(adjs);
		System.out.println(Arrays.toString(adjs));

	}

	public static String[] sort(String[] adjs) {

		//implement
		
		for(int i = 0; i<adjs.length; i++) {
			for(int j = i+1; j<adjs.length; j++) {
				if(adjs[i].equals(adjs[j])) {
					
					String temp = adjs[i];
					adjs[i] = adjs[j];
					adjs[j] = temp;
				}
			}
		}

		
		//sorting by length of string.
//		List<String> list = Arrays.asList(adjs);
//		
//		Comparator<String> myC = new Comparator<String>() {
//			
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return Integer.compare(o1.length(), o2.length());
//			}
//		};
//		
//		Collections.sort(list, myC);
//		System.out.println(list);

		return adjs;
	}
	
	

}
