package lab2.prog2_9ver3;

public class Triangle implements Polygon{
	
	private double side1;
	private double side2;
	private double side3;
	
	public double[] getArrayOfSides() {
		
		double[] arr = {side1, side2, side3};
		
		return arr;
	}

}
