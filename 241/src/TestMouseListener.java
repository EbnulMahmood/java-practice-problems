import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestMouseListener {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(200, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf = new JTextField(15);
		f.add(tf);
		f.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tf.setText("Clicked at x: " + e.getX() + ", y: " + e.getY());
			}
		});
		f.setVisible(true);
	}
}