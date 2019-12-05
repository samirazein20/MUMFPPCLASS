package lab2.prog2_7.case1;

import java.time.LocalDate;

public class Person {

	private String name;
	private LocalDate dateOfBirth;
	
	Person(String name, int year, int month, int dayOfMonth) {
		this.name = name;
		dateOfBirth = LocalDate.of(year, month, dayOfMonth);
	}
	public String getName() {
		return name;
	}
	
	public boolean equals(Object aperson) {
		
		if(aperson == null) return false;
		if(!(aperson instanceof Person)) return false;
		
		Person p = (Person)aperson;
		boolean equal = (this.name.equals(p.name) && this.dateOfBirth.equals(p.dateOfBirth));
		
		return equal;
	}
	
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Joe", 2018, 10, 21);
		Person p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		Person p2 = new PersonWithJob("Joe", 2018, 10, 21, 800);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));

	}

}
