package lesson3;

public class Circle {
	
	private double radius;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getArea() {
		//Implementation
		
		double area = Math.PI*radius*radius;
		
		return area;
	}

}
