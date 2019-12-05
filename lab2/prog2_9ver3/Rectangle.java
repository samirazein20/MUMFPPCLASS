package lab2.prog2_9ver3;

public class Rectangle implements Polygon{
	
	private double width;
	private double length;
	
	Polygon poly;
	
	public double[] getArrayOfSides() {
		
		double[] arr = {width, width, length,length};
		
		return arr;
	}

}
