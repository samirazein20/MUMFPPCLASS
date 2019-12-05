package lab2.prog2_9_ver2;
public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Circle(3),
								 new Rectangle(4,5)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String n = cc.getClass().getSimpleName();
			
			System.out.println("The Area Of The "+ n + " is "+ cc.computeArea());
			
		}
    
	}

}