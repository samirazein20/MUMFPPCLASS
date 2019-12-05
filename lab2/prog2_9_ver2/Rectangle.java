package lab2.prog2_9_ver2;

public class Rectangle extends ClosedCurve implements Polygon{
	
	private double width;
	private double length;
	private Polygon pol;
	
	
	@Override
	public int getNumberOfSides() {
		
		return 4;
	}
	
	@Override
	public double computePerimeter() {
		
		double perim = width + length + width + length;
		
		return perim;
		
	}

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
