import java.awt.*;
import javax.swing.*;

public class Test extends JFrame {

	public Test() {
		super("Graphics");
		setSize(300, 200);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(100, 80, 100, 50);
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
