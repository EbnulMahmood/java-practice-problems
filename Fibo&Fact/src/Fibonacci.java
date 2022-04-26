import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Fibonacci extends JFrame {

	private JPanel contentPane;
	private JTextField number;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci frame = new Fibonacci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter number :");
		lblEnterNumber.setBounds(27, 36, 98, 14);
		contentPane.add(lblEnterNumber);
		
		number = new JTextField();
		number.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			
			
			}
		});
		number.setBounds(110, 33, 86, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JButton fibo = new JButton("Fibonacci");
		fibo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int n1 = 0;
				int n2 = 1;
				int fi = 0;
				int n = Integer.parseInt(number.getText());
				for (int i = 1; i <= n; i++) {
					
				fi = n1 + n2;
				n1 = n2;
				n2 = fi;
				}
				result.setText("" + fi);
			}
		});
		fibo.setBounds(110, 93, 89, 23);
		contentPane.add(fibo);
		
		result = new JTextField();
		result.setText("Result");
		result.setBounds(110, 162, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}
