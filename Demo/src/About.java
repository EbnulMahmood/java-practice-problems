import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JScrollBar;
import javax.swing.JMenuBar;
import java.awt.TextArea;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;

public class About extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
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
	public About() {
		setForeground(Color.RED);
		setBackground(Color.RED);
		setResizable(false);
		setTitle("About Us");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, 0, 400, 500);
		getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setText("Project Name      : BLOOOD DONATION\r\n\r\nGroup Members :\r\n\r\n1. Mirza Ebnul Mahmood Shovan (011 162 058)\r\nEmail: shovonmahmood67@gmail.com\r\n Mobile: +8801789546973\r\n\r\n2. Samir Hossain (011 162 075) \r\nEmail: santobepu@gmail.com\r\nMobile: +8801853750577\r\n\r\nProject  Characteristics :\r\n\r\ni. Donor information\r\nii. Search option\r\niii. Update option\r\n\r\nQuick Facts About the Blood Donation Process :\r\n\r\nBlood donation is a simple, four-step process: registration, medical history and mini-physical, \r\ndonation and refreshments. It is a safe process, and a sterile needle is used only once for \r\neach donor and then discarded.\r\n\r\nThe actual blood donation typically takes less than 10-12 minutes. The entire process, from \r\nthe time you arrive to the time you leave, takes about an hour and 15 minutes.\r\n\r\nThe average adult has about 10 pints of blood in his body. Roughly one pint is given during a donation.\r\n\r\nA healthy donor may donate red blood cells every 56 days, or double red cells every 112 days. \r\nThere are four types of transfusable products that can be derived from blood: red cells,\r\nplatelets, plasma and cryoprecipitate. Typically, two or three of these are produced from a pint\r\nof donated whole blood \u2014 hence each donation can help save more than one life.");
		textArea.setBounds(0, 0, 380, 461);
		getContentPane().add(textArea);
	}
}
