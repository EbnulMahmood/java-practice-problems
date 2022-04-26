import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiExample extends JFrame {

	private JPanel contentPane;
	private JTextField result;
	private int number = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiExample frame = new GuiExample();
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
	public GuiExample() {
		setTitle("GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton add = new JButton("Add 5");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int sub = 5;
				if (number > -20 && number < 20) {
					number = number + sub;
				} else {
					JOptionPane.showMessageDialog(null, "Allowable range of numbers is -20 to 20.", "message",
							JOptionPane.INFORMATION_MESSAGE);
					result.setText(null);
				}
				result.setText("" + number);
			}
		});
		add.setBounds(21, 11, 89, 23);
		contentPane.add(add);

		JButton sub = new JButton("Sub 3");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int sub = 3;
				if (number > -18 && number < 20) {

					number = number - sub;
				} else {
					JOptionPane.showMessageDialog(null, "Allowable range of numbers is -20 to 20.", "message",
							JOptionPane.INFORMATION_MESSAGE);
					result.setText(null);
				}
				result.setText("" + number);
			}
		});
		sub.setBounds(151, 11, 89, 23);
		contentPane.add(sub);

		result = new JTextField("0");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				number = Integer.parseInt(result.getText());
			}
		});
		result.setBounds(151, 60, 86, 20);
		contentPane.add(result);
		result.setColumns(10);

		JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				result.setText("0");
				number = 0;
			}
		});
		clear.setBounds(289, 11, 89, 23);
		contentPane.add(clear);
	}
}
