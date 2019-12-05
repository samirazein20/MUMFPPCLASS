package lesson2;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y=0;
		int[] index = new int[4];
		String[] islands= new String[4];
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
	
		int ref;
		
		while(y<4) {
			ref = index[y];
			
			System.out.print("island =");System.out.println(islands[ref]);

			
			y=y+1;
		}
		
		
	
		
	}

}
