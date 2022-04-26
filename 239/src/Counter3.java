import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Counter3 {

	JFrame f;
	JTextField tf;
	
	public Counter3() {
		f = new JFrame("Counter");
		f.setLayout(new FlowLayout());
		f.setSize(500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new JLabel("Counter"));
		tf = new JTextField(10);
		f.add(tf);
		tf.setText("0");
		JButton b = new JButton("Count");
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
			}
		});
		f.setVisible(true);
	}
	public static void main(String[] args) {

		new Counter3();
	}
}
