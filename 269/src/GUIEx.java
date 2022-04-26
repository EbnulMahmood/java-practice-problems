import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIEx {

	public GUIEx() {
		JFrame f = new JFrame("GUI");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		f.setLayout(null);
		JLabel jl = new JLabel("Enter Sale");
		JTextField jt = new JTextField(10);
		JButton jb = new JButton("Record");
		JLabel jl2 = new JLabel("Total sales: ");
		JTextField jt2 = new JTextField("0",5);
		jp.add(jl);
		jp.add(jt);
		jp.add(jb);
		jp.add(jl2);
		jp.add(jt2);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {

				int count = Integer.parseInt(jt.getText());
				
				int sum = 0;
					sum += count;
					jt2.setText("" + sum);
			
			}
		});
		
		f.setContentPane(jp);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new GUIEx();
	}

}
