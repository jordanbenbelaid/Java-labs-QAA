package exercise7;

import java.awt.Color;
import java.awt.Point;

public class Shape {
	Color colour;
	Point position;

	public Shape(Color colour, Point position) {
		this.colour = colour;
		this.position = position;
	}
	
	public Color getColour() {
		return colour;
	}
	public void setColour(Color colour) {
		this.colour = colour;
	}
	public Point getPosition() {
		return position;
	}
	public void setPosition(Point position) {
		this.position = position;
	}
	
	public String getDetails() {
		return "Colour: " + colour + ", X:" + position.x + ", Y:" + position.y;
	}

	
}
