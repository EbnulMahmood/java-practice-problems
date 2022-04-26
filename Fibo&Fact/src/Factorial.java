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

public class Factorial extends JFrame {

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
					Factorial frame = new Factorial();
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
	public Factorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter Number :");
		lblEnterNumber.setBounds(44, 35, 88, 14);
		contentPane.add(lblEnterNumber);
		
		number = new JTextField();
		number.setBounds(142, 32, 86, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JButton factorial = new JButton("Factorial");
		factorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			int f = 1;
			int n = Integer.parseInt(number.getText());
			
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			result.setText("" + f);
			}
		});
		factorial.setBounds(139, 99, 89, 23);
		contentPane.add(factorial);
		
		result = new JTextField();
		result.setText("Result");
		result.setBounds(142, 166, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
	}
}
