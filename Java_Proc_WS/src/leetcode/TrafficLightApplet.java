package leetcode;

import java.applet.Applet;
import java.awt.*;

public class TrafficLightApplet extends Applet implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color currentColor = Color.RED;
	private Thread thread;

	@Override
	public void init() {
		setSize(200, 600);
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(50, 50, 100, 300);

		if (currentColor.equals(Color.RED)) {
			g.setColor(Color.RED);
			g.fillOval(75, 75, 50, 50);
		} else {
			g.setColor(Color.GRAY);
			g.fillOval(75, 75, 50, 50);
		}

		if (currentColor.equals(Color.YELLOW)) {
			g.setColor(Color.YELLOW);
			g.fillOval(75, 175, 50, 50);
		} else {
			g.setColor(Color.GRAY);
			g.fillOval(75, 175, 50, 50);
		}

		if (currentColor.equals(Color.GREEN)) {
			g.setColor(Color.GREEN);
			g.fillOval(75, 275, 50, 50);
		} else {
			g.setColor(Color.GRAY);
			g.fillOval(75, 275, 50, 50);
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (currentColor.equals(Color.RED)) {
					Thread.sleep(1000); // Red for 30 seconds
					currentColor = Color.GREEN;
				} else if (currentColor.equals(Color.GREEN)) {
					Thread.sleep(1000); // Green for 25 seconds
					currentColor = Color.YELLOW;
				} else if (currentColor.equals(Color.YELLOW)) {
					Thread.sleep(1000); // Yellow for 5 seconds
					currentColor = Color.RED;
				}
				repaint();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
