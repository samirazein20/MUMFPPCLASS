package lab2.Prog2_1;

import lab2.Prog2_1.Circle;
import lab2.Prog2_1.Rectangle;
import lab2.Prog2_1.Triangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objects = { new Triangle(5,7), new Rectangle(3,7),new Circle(3) };
		
		for (Object o : objects) {
			if (o instanceof Triangle) {
				Triangle t = (Triangle) o;
				System.out.println("Area Of A Triangle: "+t.computeArea(5,7));
			}
			if (o instanceof Rectangle) {
				Rectangle s = (Rectangle) o;
				System.out.printf("Area Of A Rectangle: "+"%.2f",s.computeArea(3,7));
			}
			if (o instanceof Circle) {
				Circle c = (Circle) o;
				System.out.printf("\nArea Of A Circle: "+"%.2f",c.computeArea(3));
			}
		}

	}

}
