package exercise7;

import java.awt.Color;
import java.awt.Point;

public class Sphere extends Circle{
	public Sphere(int radius, Color colour, Point position) {
		super(radius, colour, position);
	}
	public double getVolume() {
		return (4/3F) * Math.PI * Math.pow(this.radius, 3);
	}
	@Override
	public String getDetails() {
		return super.getDetails() + ", Volume:" + getVolume();
	}
}
