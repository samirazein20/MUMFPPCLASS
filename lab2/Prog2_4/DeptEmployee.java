package lab2.Prog2_4;

import java.time.LocalDate;

public abstract class DeptEmployee {
	
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public String getName() {
		return name;
	}
	
	public abstract double computeSalary();
	
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	
	

}
