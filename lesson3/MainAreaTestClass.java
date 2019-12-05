package lesson3;

public class MainAreaTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(1.4);
		String strDouble = String.format("%.2f", c.getArea());  
		System.out.println("Area Of A Circle Is:"+ strDouble);
		
		Rectangle r = new Rectangle(5,9);
		System.out.println("Area Of A Rectangle Is:"+ r.getArea());
		
		Square s = new Square(9);
		System.out.println("Area Of A Square Is:"+ s.getArea());
		

	}

}
