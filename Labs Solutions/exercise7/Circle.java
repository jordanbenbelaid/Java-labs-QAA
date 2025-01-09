package exercise7;

import java.awt.Color;
import java.awt.Point;

public class Circle extends Shape{

	int radius;
	
	public Circle(int radius, Color colour, Point position) {
		super(colour, position);
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getCircumfrence() {
		return 2 * Math.PI * this.radius;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + ", Radius:" + radius + ", area:" + getArea() + ", Circumfrence:" + getCircumfrence();
	}
}
