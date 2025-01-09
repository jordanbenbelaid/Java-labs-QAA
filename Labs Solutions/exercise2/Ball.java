package exercise2;

public class Ball {
	public static int worldX = 0, worldY = 0, worldW, worldH;
	public int x, y, w, h;
	private int dirX, dirY;
	
    int worldWidth = 300;
    int worldHeight = 300;

    public Ball(int x, int y, int h, int w, int dirX, int dirY) {

		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	public void move() {
		x += dirX;
		y += dirY;
		if (x < 1) {
			x = 1;
			dirX = -dirX;
		}
		if (y < 1) {
			y = 1;
			dirY = -dirY;
		}
		if (x > (worldWidth - w)) {
			x = worldWidth - w;
			dirX = -dirX;
		}
		if (y > (worldHeight - h)) {
			y = worldHeight - h;
			dirY = -dirY;
		}
	}
}
