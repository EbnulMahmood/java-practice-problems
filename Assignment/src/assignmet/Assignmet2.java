package assignmet;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignmet2 extends JFrame {

	private JPanel contentPane;
	private JTextField number1;
	private JTextField number2;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignmet2 frame = new Assignmet2();
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
	public Assignmet2() {
		setTitle("My Assignment - 2");
		setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber = new JLabel("Number 1 : ");
		lblNumber.setBounds(49, 32, 68, 25);
		contentPane.add(lblNumber);
		
		number1 = new JTextField();
		number1.setBounds(37, 56, 86, 20);
		contentPane.add(number1);
		number1.setColumns(10);
		
		JLabel lblNumber_1 = new JLabel("Number 2 : ");
		lblNumber_1.setBounds(258, 32, 71, 25);
		contentPane.add(lblNumber_1);
		
		number2 = new JTextField();
		number2.setColumns(10);
		number2.setBounds(248, 56, 86, 20);
		contentPane.add(number2);
		
		JButton button = new JButton("+");
		button.setBackground(Color.RED);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Sum
				int num1 = Integer.parseInt(number1.getText());
				int num2 = Integer.parseInt(number2.getText());
				int sum = num1 + num2;
				result.setText("" + sum);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button.setBounds(37, 98, 48, 41);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBackground(Color.ORANGE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//Sub
				int num1 = Integer.parseInt(number1.getText());
				int num2 = Integer.parseInt(number2.getText());
				int sub = num1 - num2;
				result.setText("" + sub);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_1.setBounds(124, 98, 48, 41);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.setBackground(Color.MAGENTA);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Mult
				int num1 = Integer.parseInt(number1.getText());
				int num2 = Integer.parseInt(number2.getText());
				int mult = num1 * num2;
				result.setText("" + mult);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_2.setBounds(205, 98, 48, 41);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.setBackground(Color.GREEN);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    //Div
				int num1 = Integer.parseInt(number1.getText());
				int num2 = Integer.parseInt(number2.getText());
				
				int div = num1 / num2;
				result.setText("" + div);
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		button_3.setBounds(286, 98, 48, 41);
		contentPane.add(button_3);
		
		JLabel lblResult = new JLabel("Result : ");
		lblResult.setBounds(142, 175, 68, 25);
		contentPane.add(lblResult);
		
		result = new JTextField();
		result.setColumns(10);
		result.setBounds(124, 199, 86, 20);
		contentPane.add(result);
	}

}
