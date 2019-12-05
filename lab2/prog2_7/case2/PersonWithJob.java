package lab2.prog2_7.case2;


public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, int year, int month, int dayOfMonth, double salary) {
		super(name, year, month, dayOfMonth);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object prsn) {

		if (prsn == null)
			return false;
		if (!(prsn.getClass() != this.getClass()))
			return false;

		PersonWithJob p = (PersonWithJob) prsn;
		boolean equalsTo = getName().equals(p.getName()) && getDateOfBirth().equals(p.getDateOfBirth()) && this.salary == p.salary;

		return equalsTo;
	}
}
