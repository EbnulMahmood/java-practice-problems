import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTextField = new JTextField();
		txtTextField.setHorizontalAlignment(SwingConstants.CENTER);
		txtTextField.setBackground(Color.PINK);
		txtTextField.setForeground(Color.BLACK);
		txtTextField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtTextField.setText("Text Field");
		txtTextField.setBounds(10, 11, 119, 33);
		contentPane.add(txtTextField);
		txtTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 72, 59, 48);
		contentPane.add(btnNewButton);
		
		JButton button_3 = new JButton("4");
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(10, 149, 59, 48);
		contentPane.add(button_3);
		
		JButton button_1 = new JButton("3");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(206, 72, 59, 48);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_2.setBackground(Color.PINK);
		button_2.setBounds(361, 72, 59, 48);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("5");
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_4.setBackground(Color.MAGENTA);
		button_4.setBounds(105, 149, 59, 48);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_5.setBackground(Color.BLUE);
		button_5.setBounds(206, 149, 59, 48);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("-");
		button_6.setForeground(Color.BLACK);
		button_6.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(361, 149, 59, 48);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.setForeground(Color.WHITE);
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_7.setBackground(Color.DARK_GRAY);
		button_7.setBounds(10, 228, 59, 48);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_8.setBackground(Color.RED);
		button_8.setBounds(105, 228, 59, 48);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.setForeground(Color.BLACK);
		button_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_9.setBackground(Color.ORANGE);
		button_9.setBounds(206, 228, 59, 48);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("0");
		button_10.setForeground(Color.BLACK);
		button_10.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_10.setBackground(Color.GREEN);
		button_10.setBounds(361, 228, 59, 48);
		contentPane.add(button_10);
		
		JButton button = new JButton("2");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBackground(Color.GRAY);
		button.setBounds(105, 72, 59, 48);
		contentPane.add(button);
		
		JButton button_11 = new JButton("=");
		button_11.setForeground(Color.BLACK);
		button_11.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(206, 11, 59, 33);
		contentPane.add(button_11);
	}
}
