package exercise3;

public class Ball {
	public static int worldX = 0, worldY = 0, worldW, worldH;
	public int x, y, w, h;
	private int dirX, dirY;
	
	public Ball(int x, int y, int h, int w, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public static void setWorld(int worldH, int worldW) {
		Ball.worldX = 0;  // we can change the x & y by passing their values as parameters
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
		if (x > (worldW - w)) {
			x = worldW - w;
			dirX = -dirX;
		}
		if (y > (worldH - h)) {
			y = worldH - h;
			dirY = -dirY;
		}
	}
}
