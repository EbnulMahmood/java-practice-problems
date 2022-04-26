package guiExample;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class GuiExample2 {

	public static void main(String[] args) {

		JFrame f = new JFrame("My Frame");

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 200);

		JPanel p = new JPanel();
		p.setBackground(Color.cyan);
		JButton b = new JButton("Click here");
		b.setBackground(Color.red);
		b.setForeground(Color.BLUE);
		b.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 14));
		p.add(b);
		f.setContentPane(p);
		f.setVisible(true);
	}
}
