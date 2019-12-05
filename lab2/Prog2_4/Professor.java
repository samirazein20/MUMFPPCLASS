package lab2.Prog2_4;

public class Professor extends DeptEmployee{
	
	public int numberOfPublicashions;
	
	
	public int getNumberOfPublicashions() {
		return numberOfPublicashions;
	}

	public void setNumberOfPublicashions(int numberOfPublicashions) {
		this.numberOfPublicashions = numberOfPublicashions;
	}

	

	@Override
	public double computeSalary() {
		
		return 0.0;
		
	};

}
