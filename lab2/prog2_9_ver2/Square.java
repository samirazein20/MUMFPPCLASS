package lab2.prog2_9_ver2;
public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	public double computeArea() {
		return side * side;
	}
	
	@Override
	public int getNumberOfSides() {
		
		return 4;
	}
	
	@Override
	public double computePerimeter() {
		
		double perim = side + side + side + side;
		
		return perim;
		
	}


}
