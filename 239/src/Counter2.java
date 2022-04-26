import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.event.ActionEvent;

public class Counter2 implements ActionListener {

	JFrame f;
	JTextField tf;
	
	public Counter2() {
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
		b.addActionListener(this);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent arg0) {

		tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
		
	}
	
	public static void main(String[] args) {

		new Counter2();
	}
}
