import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Counter4 extends JFrame implements ActionListener {

	JTextField tf;
	JButton b,r;
	
	public Counter4() {
		super("Counter");
		setForeground(Color.WHITE);
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new FlowLayout());
		setSize(200, 100);
		getContentPane().add(new JLabel("Counter"));
		tf = new JTextField("0", 10);
		b = new JButton("Count");
		r = new JButton("Reset");
		getContentPane().add(tf); getContentPane().add(b); getContentPane().add(r);
		setVisible(true);
		b.addActionListener(this);
		r.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == b)
			tf.setText(Integer.parseInt(tf.getText()) + 1 + "");
		else if (obj == r)
			tf.setText("0");
	}
	
	public static void main(String[] args) {

		new Counter4();
	}
}
