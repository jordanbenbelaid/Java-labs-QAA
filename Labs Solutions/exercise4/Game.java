package exercise4;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Game extends Canvas {

	Ball[] balls = { new Ball(30, 30, 20, 30, 5, 3), 
			new Ball(30, 50, 20, 15, 3, 2, SHAPE_TYPE.Oval),
			new Ball(40, 60, 30, 20, 2, 3, SHAPE_TYPE.Oval) };

	Game() {
		JFrame frame = new JFrame();
		this.setSize(500, 500);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(1, 1, Ball.worldW, Ball.worldH);
		for (Ball ball : balls) {
			ball.move();

			if (ball.getShapeType() == SHAPE_TYPE.Oval)
				g.drawOval(ball.x, ball.y, ball.w, ball.h);

			else if (ball.getShapeType() == SHAPE_TYPE.Rectangle)
				g.drawRect(ball.x, ball.y, ball.w, ball.h);
		}
	}
}
