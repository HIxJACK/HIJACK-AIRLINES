package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TicketAndSeatPriceSummary extends JFrame  {

	private JPanel contentPane;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtSeating;
	private JTextField txtFromTime;
	private JTextField txtToTime;
	private JLabel lblNewLabel_1;
	private JLabel label;
	private JTextField txtPPP;
	private JLabel lblNewLabel_2;
	private JTextField txtTaxes;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JLabel label_1;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicketAndSeatPriceSummary frame = new TicketAndSeatPriceSummary();
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
	public TicketAndSeatPriceSummary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 195, 588, 12);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flight_Times flight = new Flight_Times();
				flight.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(6, 219, 117, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continue");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(477, 219, 117, 53);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(29, 51, 1, 12);
		contentPane.add(separator_3);
		
		txtFrom = new JTextField();
		txtFrom.setBounds(29, 72, 72, 26);
		contentPane.add(txtFrom);
		txtFrom.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(143, 72, 78, 26);
		contentPane.add(txtTo);
		
		JLabel lblNewLtoabel = new JLabel("To");
		lblNewLtoabel.setBounds(113, 77, 18, 16);
		contentPane.add(lblNewLtoabel);
		
		txtSeating = new JTextField();
		txtSeating.setColumns(10);
		txtSeating.setBounds(337, 72, 91, 26);
		contentPane.add(txtSeating);
		
		txtFromTime = new JTextField();
		txtFromTime.setColumns(10);
		txtFromTime.setBounds(29, 110, 72, 26);
		contentPane.add(txtFromTime);
		
		txtToTime = new JTextField();
		txtToTime.setColumns(10);
		txtToTime.setBounds(143, 110, 78, 26);
		contentPane.add(txtToTime);
		
		lblNewLabel_1 = new JLabel("Seating");
		lblNewLabel_1.setBounds(279, 77, 46, 16);
		contentPane.add(lblNewLabel_1);
		
		label = new JLabel("__");
		label.setBounds(113, 110, 16, 16);
		contentPane.add(label);
		
		txtPPP = new JTextField();
		txtPPP.setBounds(472, 72, 91, 26);
		contentPane.add(txtPPP);
		txtPPP.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Price Per Passenger");
		lblNewLabel_2.setBounds(462, 59, 132, 16);
		contentPane.add(lblNewLabel_2);
		
		txtTaxes = new JTextField();
		txtTaxes.setBounds(472, 125, 91, 26);
		contentPane.add(txtTaxes);
		txtTaxes.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Taxes");
		lblNewLabel_3.setBounds(497, 110, 46, 16);
		contentPane.add(lblNewLabel_3);
		
		panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(6, 9, 588, 30);
		contentPane.add(panel);
		
		label_1 = new JLabel("HIJACK AIRLINES");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel.add(label_1);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(217, 150, 166, 1);
		contentPane.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(449, 60, 18, 123);
		contentPane.add(separator_2);
		
		btnNewButton_2 = new JButton("Show Summary");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFrom.setText("Atlanta");
				txtTo.setText("Dubai");
				txtFromTime.setText("10:00am");
				txtToTime.setText("4:00pm");
				txtSeating.setText("Main Cabin");
				txtPPP.setText("$500.00");
				txtTaxes.setText("$55.00");
				
			}
		});
		btnNewButton_2.setBounds(24, 154, 125, 29);
		contentPane.add(btnNewButton_2);
	}
}
