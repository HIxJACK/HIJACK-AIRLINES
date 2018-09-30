package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class Flight_Times extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flight_Times frame = new Flight_Times();
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
	public Flight_Times()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 788, 30);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		
		JLabel label = new JLabel("HIJACK AIRLINES");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel.add(label);
		
		table = new JTable();
		table.setBounds(113, 132, 615, 171);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Summary");
		btnNewButton.setBounds(677, 519, 117, 53);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TicketAndSeatPriceSummary summary = new TicketAndSeatPriceSummary();
				summary.setVisible(true);
				dispose();
				//=== Summary ===//
				
				
				
				
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Build1 window = new Build1();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(6, 519, 117, 53);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Flight Times and Seat Prices");
		lblNewLabel.setBounds(259, 78, 276, 31);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Main Cabin");
		rdbtnNewRadioButton.setBounds(113, 345, 117, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Comfort");
		rdbtnNewRadioButton_1.setBounds(370, 345, 92, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("FirstClass");
		rdbtnNewRadioButton_2.setBounds(622, 345, 106, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("$100.00");
		lblNewLabel_1.setBounds(150, 380, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("$500.00");
		label_1.setBounds(401, 380, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("$1000.00");
		label_2.setBounds(653, 380, 61, 16);
		contentPane.add(label_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 468, 788, 12);
		contentPane.add(separator);
	}
}
