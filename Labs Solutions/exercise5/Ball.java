package exercise5;

import exercise4.SHAPE_TYPE;

public class Ball {
	public static int worldX = 0, worldY = 0, worldW, worldH;
	public int x, y, w, h;
	private int dirX, dirY;
	private SHAPE_TYPE shapeType;
	
	public Ball(int x, int y, int h, int w, int dirX, int dirY) {
		this(x, y, h, w, dirX, dirY, SHAPE_TYPE.Rectangle);
	}

	public Ball(int x, int y, int h, int w, int dirX, int dirY, SHAPE_TYPE shapeType) {
		Ball.setWorld(300, 400);
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		this.dirX = dirX;
		this.dirY = dirY;
		this.shapeType = shapeType;
	}
	
	public SHAPE_TYPE getShapeType() {
		return this.shapeType;
	}

	public static void setWorld(int worldH, int worldW) {
		Ball.worldX = 0;
		Ball.worldY = 0;
		Ball.worldH = worldH;
		Ball.worldW = worldW;
	}

	public void move() {
		x += dirX;
		y += dirY;
		if (x < worldX) {
			x = worldX;
			dirX = -dirX;
		}
		if (y < worldY) {
			y = worldY;
			dirY = -dirY;
		}
		if (x > (Ball.worldW - w)) {
			x = Ball.worldW - w;
			dirX = -dirX;
		}
		if (y > (Ball.worldH - h)) {
			y = Ball.worldH - h;
			dirY = -dirY;
		}
	}
}




