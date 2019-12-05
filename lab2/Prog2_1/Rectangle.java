package lab2.Prog2_1;

public final class Rectangle {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}


	public double getLength() {
		return length;
	}


	public double computeArea(double width, double length) {
		double area = width * length;
		return area;
	}

}
