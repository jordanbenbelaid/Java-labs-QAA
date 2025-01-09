package exercise7;

import java.awt.Color;
import java.awt.Point;

public class Rectangle extends Shape{
	int sideA, sideB;
	
	public Rectangle(int sideA, int sideB, Color colour, Point position) {
		super(colour, position);
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
	public double getArea() {
		return sideA * sideB;
	}
	public double getCircumfrence() {
		return 2 * (sideA + sideB);
	}
	
	@Override
	public String getDetails() {
		return super.getDetails() + ", sideA:" + sideA + ", sideB:" + sideB + ", area:" + getArea() + ", Circumfrence:" + getCircumfrence();
	}
}
