package lab2.prog2_7.case3;

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
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
		
	public static void main(String[] args) {

		Person p = new Person("Joe", 2018, 10, 21);
		PersonWithJob p1 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		PersonWithJob p2 = new PersonWithJob("Joe", 2018, 10, 21, 500);
		
		System.out.println(p.equals(p2));
		System.out.println(p1.equals(p2));
	}

}
