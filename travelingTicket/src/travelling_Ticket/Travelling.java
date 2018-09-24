package travelling_Ticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Travelling {

	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtChild;
	private JTextField txtAdult;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	
	private JTextField txtTicketNo;
	
	private JTextField textField;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(6, 6, 888, 43);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("HIJACK AIRLINES");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Class");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_1.setBounds(105, 60, 135, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(6, 88, 98, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setBounds(6, 117, 98, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(6, 152, 98, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single ticket");
		rdbtnSingleTicket.setBounds(119, 88, 110, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return ticket");
		rdbtnReturnTicket.setBounds(119, 123, 113, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(242, 89, 73, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(244, 123, 65, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmdDestination = new JComboBox();
		cmdDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination...", "Dubai", "New York", "Atlanta", "Washington", "London", "France", "Spain", "Italy", "Yo Mama's House"}));
		cmdDestination.setBounds(129, 152, 186, 27);
		frame.getContentPane().add(cmdDestination);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 187, 355, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 78, 355, 12);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tax");
		lblNewLabel_2.setBounds(16, 214, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(16, 244, 61, 16);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(16, 276, 61, 16);
		frame.getContentPane().add(lblTotal);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setToolTipText("Reset Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				rdbtnFirstClass.setSelected(false);
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				cmdDestination.setSelectedItem("Destination...");
				txtClass.setText(null);
				txtTicket.setText(null);
				txtAdult.setText(null);
				txtChild.setText(null);txtTax.setText(null);
				txtFrom.setText(null);
				txtTo.setText(null);txtTax.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				//txtTicketNo.setText(null);
				txtTicketNo.setText(null);
				//txtRoute.setText(null);
				
				
				
			}
		});
		btnNewButton.setBounds(119, 327, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setToolTipText("Exit Button");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "HIJACK AIRLINES",
				JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
				System.exit(0);
		}
				
				
				
			}
		});
		btnExit.setBounds(244, 327, 117, 29);
		frame.getContentPane().add(btnExit);
		
		txtTax = new JTextField();
		txtTax.setBounds(99, 211, 130, 26);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(99, 239, 130, 26);
		frame.getContentPane().add(txtSubTotal);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(99, 271, 130, 26);
		frame.getContentPane().add(txtTotal);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(16, 304, 345, 12);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(430, 88, -40, 16);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(373, 88, 1, 12);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(373, 128, 1, 12);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(378, 78, 12, 278);
		frame.getContentPane().add(separator_6);
		
		JLabel lblSub = new JLabel("Class");
		lblSub.setHorizontalAlignment(SwingConstants.CENTER);
		lblSub.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSub.setBounds(422, 61, 65, 16);
		frame.getContentPane().add(lblSub);
		
		JComboBox txtClass = new JComboBox();
		txtClass.setModel(new DefaultComboBoxModel(new String[] {"Economy", "Business", "First Class"}));
		txtClass.setBounds(402, 87, 98, 26);
		frame.getContentPane().add(txtClass);
		
		JLabel lblSu = new JLabel("Ticket");
		lblSu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSu.setBounds(536, 61, 65, 16);
		frame.getContentPane().add(lblSu);
		
		JComboBox txtTicket = new JComboBox();
		txtTicket.setModel(new DefaultComboBoxModel(new String[] {"Round Trip", "One Way"}));
		txtTicket.setBounds(523, 87, 98, 26);
		frame.getContentPane().add(txtTicket);
		
		JLabel lblSub_1 = new JLabel("Adult");
		lblSub_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSub_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblSub_1.setBounds(761, 60, 61, 16);
		frame.getContentPane().add(lblSub_1);
		
		JComboBox txtAdult = new JComboBox();
		txtAdult.setModel(new DefaultComboBoxModel(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
		txtAdult.setBounds(754, 87, 98, 26);
		frame.getContentPane().add(txtAdult);
		
		JLabel lblChild = new JLabel("Child");
		lblChild.setHorizontalAlignment(SwingConstants.CENTER);
		lblChild.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblChild.setBounds(637, 60, 79, 16);
		frame.getContentPane().add(lblChild);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(402, 78, 450, 12);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(402, 115, 450, 12);
		frame.getContentPane().add(separator_8);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblFrom.setBounds(402, 156, 65, 16);
		frame.getContentPane().add(lblFrom);
		
		JComboBox txtFrom = new JComboBox();
		txtFrom.setModel(new DefaultComboBoxModel(new String[] {"Destination...", "Dubai", "New York", "Atlanta", "Washington", "London", "France", "Spain", "Italy", "Yo Mama's House"}));
		txtFrom.setBounds(482, 151, 108, 26);
		frame.getContentPane().add(txtFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblTo.setBounds(402, 214, 65, 16);
		frame.getContentPane().add(lblTo);
		
		JComboBox txtTo = new JComboBox();
		txtTo.setModel(new DefaultComboBoxModel(new String[] {"Destination...", "Dubai", "New York", "Atlanta", "Washington", "London", "France", "Spain", "Italy", "Yo Mama's House"}));
		txtTo.setBounds(482, 209, 108, 26);
		frame.getContentPane().add(txtTo);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblDate.setBounds(402, 275, 65, 16);
		frame.getContentPane().add(lblDate);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(482, 271, 108, 26);
		frame.getContentPane().add(txtDate);
		
		JLabel lblTime = new JLabel("Time:");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblTime.setBounds(402, 331, 65, 16);
		frame.getContentPane().add(lblTime);
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		txtTime.setBounds(482, 327, 108, 26);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(637, 135, 12, 221);
		frame.getContentPane().add(separator_9);
		
		JLabel lblTicketNumber = new JLabel("Ticket No.");
		lblTicketNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketNumber.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblTicketNumber.setBounds(671, 155, 110, 16);
		frame.getContentPane().add(lblTicketNumber);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(671, 171, 98, 26);
		frame.getContentPane().add(txtTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblPrice.setBounds(690, 213, 65, 16);
		frame.getContentPane().add(lblPrice);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(671, 239, 98, 26);
		frame.getContentPane().add(textField);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoute.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblRoute.setBounds(690, 276, 65, 16);
		frame.getContentPane().add(lblRoute);
		
		txtRoute = new JTextField();
		txtRoute.setBounds(671, 304, 98, 26);
		frame.getContentPane().add(txtRoute);
		txtRoute.setColumns(10);
		
		JButton btnTotal1 = new JButton("Total");
		btnTotal1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//=== Time ===//
				 
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				//=== Date ===//
				SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));
				
				// txtFrom.setText("London ");
				// txtTo.setText((String) cmdDestination.getSelectedItem()+ " *");
				
				//=== Random Number Generator ===//
				int num1;
				String q1 = "";
				num1 = 1325 + (int) (Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				//================================
				txtRoute.setText("ANY");
				
			}
		});
		btnTotal1.setBounds(6, 327, 117, 29);
		frame.getContentPane().add(btnTotal1);
		
		
		
		
		
		
		
	}
}
