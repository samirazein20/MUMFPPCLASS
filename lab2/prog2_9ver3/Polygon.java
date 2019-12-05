package lab2.prog2_9ver3;

public interface Polygon {
	
	public double[] getArrayOfSides();
	
	
	
	static double sum(double[] arr) {
		double sum = 0.0;
		for(double c: arr) {
			sum+=c;
		}
		return sum;
	}
	
	default double computePerimeter() {
		
		return sum(getArrayOfSides());
	}

}
