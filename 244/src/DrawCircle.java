import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DrawCircle extends JFrame implements MouseListener {
	int x = -10, y = -10, d = 20;

	public DrawCircle() {
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
	}

	public void paint(Graphics g) {
		if (x > 0 && y > 0) {
			g.drawOval(x, y, d, d);
		}
	}

	public void mouseClicked(MouseEvent e) {
		x = e.getX() - d / 2;
		y = e.getY() - d / 2;
		repaint();
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public static void main(String[] args) {
		new DrawCircle();
	}
}
