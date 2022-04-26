package guiExample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class GUIExample1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIExample1 frame = new GUIExample1();
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
	public GUIExample1() {
		setTitle("Schedule an Appointment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Title :");
		lblTitle.setBounds(40, 25, 46, 14);
		contentPane.add(lblTitle);
		
		textField = new JTextField();
		textField.setBounds(74, 22, 339, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDate = new JLabel("Date :");
		lblDate.setBounds(40, 60, 46, 14);
		contentPane.add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(74, 57, 139, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblStartTime = new JLabel("Start Time :");
		lblStartTime.setBounds(260, 60, 73, 14);
		contentPane.add(lblStartTime);
		
		textField_2 = new JTextField();
		textField_2.setBounds(330, 57, 83, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(74, 88, 139, 20);
		contentPane.add(textField_3);
		
		JLabel lblEndDate = new JLabel("End Date :");
		lblEndDate.setEnabled(false);
		lblEndDate.setBounds(20, 91, 66, 14);
		contentPane.add(lblEndDate);
		
		JLabel lblDuration = new JLabel("Duration :");
		lblDuration.setBounds(260, 91, 60, 14);
		contentPane.add(lblDuration);
		
		textField_4 = new JTextField();
		textField_4.setBounds(320, 88, 41, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(366, 88, 46, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblHr = new JLabel("hr");
		lblHr.setBounds(350, 76, 21, 14);
		contentPane.add(lblHr);
		
		JLabel lblMin = new JLabel("min");
		lblMin.setBounds(392, 76, 21, 14);
		contentPane.add(lblMin);
		
		JLabel lblRecurring = new JLabel("Recurring ?");
		lblRecurring.setBounds(20, 129, 66, 14);
		contentPane.add(lblRecurring);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(87, 125, 21, 23);
		contentPane.add(chckbxNewCheckBox);
	}
}
