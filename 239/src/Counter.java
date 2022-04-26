import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter {
	
	JFrame f;
	JTextField tf;
	
	public Counter() {
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
		b.addActionListener(new CounterAction());
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Counter();
	}
	public class CounterAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
		}
	}
}
