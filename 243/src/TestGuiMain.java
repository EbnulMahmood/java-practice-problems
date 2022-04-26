import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import javax.swing.*;

import java.util.*;

public class TestGuiMain extends JFrame {
	static int diameter = 20;

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setSize(300, 400);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});

		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Graphics g = f.getGraphics();
				Random rand = new Random();
				g.setColor(new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
				g.drawOval(e.getX() - diameter / 2, e.getY() - diameter / 2, diameter, diameter);
				f.setVisible(true);
				System.out.println(e.getX() + ":" + e.getY());
			}
		});

		f.setVisible(true);
	}

}
