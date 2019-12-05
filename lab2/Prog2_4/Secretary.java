package lab2.Prog2_4;

public class Secretary extends DeptEmployee{
	
	public double overtimeHours;
	
	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	@Override
	public double computeSalary() {
		
		return 0.0;
	}

}
