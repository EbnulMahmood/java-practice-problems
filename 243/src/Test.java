import java.awt.*;
import javax.swing.*;

public class Test {
	
	JFrame f;
	public Test() {	
		f = new JFrame("Graphics");
		f.setSize(200, 200);
		f.setBackground(Color.WHITE);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void show() {
		Graphics g = f.getGraphics();
		g.setColor(Color.RED);
		g.fillRect(20, 20, 100, 100);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.show();
	}

}
