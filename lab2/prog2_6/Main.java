package lab2.prog2_6;

import java.util.*;

//import lab2.Prog2_5.Employee;

public class Main {
	
	Employee[] emps;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
		
	}
		
		Main(){
			emps = new Employee[3];
			emps[0] = new Employee("Jim Daley", 2000, 9, 4);
			emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
			emps[2] = new Employee("Susan Randolph", 1997, 2,13);

			emps[0].createNewChecking(10500);
			emps[0].createNewSavings(1000);
			emps[0].createNewRetirement(9300);

			emps[1].createNewChecking(34000);
			emps[1].createNewSavings(27000);

			emps[2].createNewChecking(10038);
			emps[2].createNewSavings(12600);
			emps[2].createNewRetirement(9000);
			
			System.out.println("A. See a report of all accounts.");
			System.out.println("B. Make a deposit.");
			System.out.println("C. Make a withdrawal.");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Make a selection (A/B/C):");
			
			String input = sc.next();
			if(input.equalsIgnoreCase("A")) {
				
				String str = getFormattedAccountInfo();
				
				System.out.println(str);
			
			}
			
			if(input.equalsIgnoreCase("B")) {
				for(Object ob: emps) {
					int i = 0;
					System.out.println(i + " ." + ob.getClass().getSimpleName());
					++i;
				}
				Scanner s = new Scanner(System.in);
				System.out.println("Select An Employee (Type a number):");
				
				String number = s.next();
				
				if(number!=null) {
					
				}
				
			}
			
			if(input.equalsIgnoreCase("C")) {
				
			}
		}
		
		String getFormattedAccountInfo() {
			String newline = System.getProperty("line.separator");
			String retVal = "";
			for(int i = 0; i < emps.length; ++i){
				retVal +=(emps[i].getFormattedAcctInfo()+newline);
			}
			return retVal;
		}
}


