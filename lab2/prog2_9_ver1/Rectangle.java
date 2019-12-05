package lab2.prog2_9_ver1;

public class Rectangle extends ClosedCurve{
	
	private double width;
	private double length;
	

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}



	@Override
	public double computeArea() {
		
		double area = width*length;
		
		return area;
	}

}
