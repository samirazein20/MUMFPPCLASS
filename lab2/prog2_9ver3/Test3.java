package lab2.prog2_9ver3;

import lab2.prog2_9_ver2.Polygon;
import lab2.prog2_9_ver2.Rectangle;
import lab2.prog2_9_ver2.Square;
import lab2.prog2_9_ver2.Triangle;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polygon[] objects = {new Square(3), new Triangle(4, 5, 6), new Rectangle(3, 4) };
		// compute areas
		for (Polygon cc : objects) {
			String n = cc.getClass().getSimpleName();

//			System.out.println("The Sides Of  " + n + " Are " + cc.getNumberOfSides());
			System.out.println("The Perimeter Of The " + n + " is " + cc.computePerimeter());

		}

	}

}
