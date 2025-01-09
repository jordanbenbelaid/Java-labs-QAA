package exercise7;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>(); 
		
		shapes.add(new Shape(Color.blue, new Point(1,1)));
		shapes.add(new Rectangle(5,10, Color.blue, new Point(1,1)));
		shapes.add(new Circle(5, Color.blue, new Point(1,1)));
		shapes.add(new Sphere(10, Color.blue, new Point(1,1)));
		
		for (Shape shape : shapes) {
			System.out.println(shape.getDetails());
		}
	}

}
