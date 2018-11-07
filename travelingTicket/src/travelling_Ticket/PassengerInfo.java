package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
//check
public class PassengerInfo extends JFrame {

	JFrame frame;
	JTextField txtFirstName;
	JTextField txtMiddleName;
	JTextField txtLastName;
	JTextField txtEmail;
	JPasswordField psPassword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerInfo window = new PassengerInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PassengerInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(0, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 5, 760, 30);
		frame.getContentPane().add(panel);
		
		JLabel lblLogo = new JLabel("HIJACK AIRLINES");
		lblLogo.setFont(new Font("Algerian", Font.PLAIN, 15));
		panel.add(lblLogo);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setToolTipText("Reset Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setBounds(20, 482, 120, 58);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				frame.dispose();
			Plane_Seating seating = new Plane_Seating();
			seating.setVisible(true);
				
				
			}
		});
		btnNext.setBounds(640, 482, 120, 58);
		frame.getContentPane().add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			Flight_Times flight = new Flight_Times();
			flight.setVisible(true);
				
				
			}
		});
		btnBack.setBounds(488, 482, 120, 58);
		frame.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.setToolTipText("Exit Button");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?\nYour unsaved information will be lost.", "HIJACK AIRLINES",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
				
			}
		});
		btnExit.setBounds(170, 482, 120, 58);
		frame.getContentPane().add(btnExit);
		
		JLabel lblPassenger = new JLabel("Passenger 1");
		lblPassenger.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassenger.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPassenger.setBounds(25, 70, 125, 25);
		frame.getContentPane().add(lblPassenger);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFirstName.setBounds(50, 120, 125, 20);
		frame.getContentPane().add(lblFirstName);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(35, 150, 125, 25);
		frame.getContentPane().add(txtFirstName);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		lblMiddleName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMiddleName.setBounds(250, 120, 125, 20);
		frame.getContentPane().add(lblMiddleName);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(235, 150, 125, 25);
		frame.getContentPane().add(txtMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastName.setBounds(450, 120, 125, 20);
		frame.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(435, 150, 125, 25);
		frame.getContentPane().add(txtLastName);
		
		JLabel lblSuffix = new JLabel("Suffix:");
		lblSuffix.setHorizontalAlignment(SwingConstants.LEFT);
		lblSuffix.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSuffix.setBounds(650, 120, 125, 20);
		frame.getContentPane().add(lblSuffix);
		
		JComboBox drpSuffix = new JComboBox();
		drpSuffix.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpSuffix.setModel(new DefaultComboBoxModel(new String[] {"Select", "II", "III", "IV", "J.D.", "Jr", "M.Ed.", "PE", "Ph.D.", "Sr"}));
		drpSuffix.setBounds(615, 150, 125, 25);
		frame.getContentPane().add(drpSuffix);
		
		JLabel lblDOB = new JLabel("Date of Birth:");
		lblDOB.setHorizontalAlignment(SwingConstants.LEFT);
		lblDOB.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDOB.setBounds(50, 220, 125, 20);
		frame.getContentPane().add(lblDOB);
		
		JComboBox drpMonth = new JComboBox();
		drpMonth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpMonth.setModel(new DefaultComboBoxModel(new Integer[] {null, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}));
		drpMonth.setBounds(35, 250, 65, 30);
		frame.getContentPane().add(drpMonth);
		
		JComboBox drpDay = new JComboBox();
		drpDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpDay.setModel(new DefaultComboBoxModel(new Integer[] {null, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31}));
		drpDay.setBounds(110, 250, 65, 30);
		frame.getContentPane().add(drpDay);
		
		JComboBox drpYear = new JComboBox();
		drpYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		drpYear.setModel(new DefaultComboBoxModel(new Integer[] {null, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999}));
		drpYear.setBounds(186, 250, 104, 30);
		frame.getContentPane().add(drpYear);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(325, 220, 125, 20);
		frame.getContentPane().add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(325, 250, 200, 25);
		frame.getContentPane().add(txtEmail);
		
		JLabel lblPassword = new JLabel("Create Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(600, 220, 150, 20);
		frame.getContentPane().add(lblPassword);
		
		psPassword = new JPasswordField();
		psPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		psPassword.setColumns(10);
		psPassword.setBounds(600, 250, 125, 25);
		frame.getContentPane().add(psPassword);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

//passenger info