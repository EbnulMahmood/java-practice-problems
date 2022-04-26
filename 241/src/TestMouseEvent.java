import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestMouseEvent {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf = new JTextField(15);
		f.add(tf);
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Clicked at x: " + e.getX() + ", y: " + e.getY());
			}
		});
		f.setVisible(true);
	}
}