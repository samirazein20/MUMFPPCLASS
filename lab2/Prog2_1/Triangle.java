package lab2.Prog2_1;

public final class Triangle {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea(double base, double height) {
		double area = 1/2 * base * height;
		
		return area;
	}

}
