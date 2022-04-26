import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TestGuiMain extends JFrame {
	int x = 100, y = 80;

	public TestGuiMain() {
		super("Graphics");
		setSize(300, 200);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x, y, 20, 10);
	}

	public static void main(String[] args) {
		TestGuiMain t = new TestGuiMain();
		t.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				t.x = e.getX();
				t.y = e.getY();
				t.repaint();
			}
		});
	}
}
