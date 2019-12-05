package lab5.prog5_4;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		//implement
		if(size==strArray.length)
			resize();
		strArray[size] = s;
		
		size++;
		
	}
	
	public String get(int i){
		//implement
		String str = "";
		for(int j = 0; j<strArray.length; j++) {
			if(strArray[j].equals(strArray[i])) {
				strArray[i] = strArray[j];
			}
			else {
				str = "ARRAY NOT VALID";
			}
		}
		return str;
	}
	
	public boolean find(String s){
		//implemement
		return false;
	}
	
	public boolean remove(String s){
		//implement
		for(int j = 0; j<strArray.length; j++) {
			if(strArray[j].equals(s)) {
				strArray[j].equals(strArray[j+1]);
			}
		}
		strArray[strArray.length].equals("");
		return false;
	}
	
	
	private void resize(){
		//implement
		String[] arr = new String[strArray.length*2];
		System.arraycopy(strArray, 0, arr, 0, strArray.length);
		strArray = arr;
	}
	public String toString(){
		//implement
		
		String output = "[";
		
		for(int i = 0; i<size; i++) {
			if(i == size-1) {
				output += strArray[i] +"]";
			}else {
				output += strArray[i] +",";
			}
		}
		
		return output;
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		//copy test code and run it
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.get(8);
	}

}