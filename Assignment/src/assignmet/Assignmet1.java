package assignmet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignmet1 extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignmet1 frame = new Assignmet1();
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
	public Assignmet1() {
		getContentPane().setForeground(Color.CYAN);
		getContentPane().setBackground(Color.WHITE);
		setTitle("My Assignment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(28, 36, 46, 14);
		getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(73, 33, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(28, 78, 46, 14);
		getContentPane().add(lblGender);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(28, 201, 89, 23);
		getContentPane().add(btnSave);
		
		JComboBox combo = new JComboBox();
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			}
		});
		combo.setBounds(83, 74, 58, 22);
		combo.addItem("Male");
		combo.addItem("Female");
//		combo.setSelectedItem(null);
		getContentPane().add(combo);
	}
}
