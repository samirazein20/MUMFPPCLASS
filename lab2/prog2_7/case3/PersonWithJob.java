package lab2.prog2_7.case3;


public class PersonWithJob{
	private double salary;
	private Person person;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		person = new Person(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
}
