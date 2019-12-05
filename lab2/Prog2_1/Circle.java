package lab2.Prog2_1;

public final class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	
	
	public double getRadius() {
		
		return radius;
	}


	public double computeArea(double radius) {
		
		double area = Math.PI*radius*radius;
		
		return area;
		
	}

}
