package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class checkout extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkout frame = new checkout();
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
	public checkout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(6, 6, 788, 30);
		contentPane.add(panel);
		
		JLabel label = new JLabel("HIJACK AIRLINES");
		label.setFont(new Font("Dialog", Font.PLAIN, 15));
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("CHECKOUT");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel.setBounds(359, 48, 97, 16);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(6, 96, 130, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 178, 130, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(6, 258, 130, 42);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(6, 335, 130, 42);
		contentPane.add(textField_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 72, 788, 12);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 395, 386, 12);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seating Price");
		lblNewLabel_1.setBounds(148, 109, 91, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCarryOn = new JLabel("Carry on");
		lblCarryOn.setBounds(148, 191, 91, 16);
		contentPane.add(lblCarryOn);
		
		JLabel lblPets = new JLabel("Pets");
		lblPets.setBounds(148, 271, 91, 16);
		contentPane.add(lblPets);
		
		JLabel lblFood = new JLabel("Food");
		lblFood.setBounds(148, 348, 91, 16);
		contentPane.add(lblFood);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(6, 419, 130, 42);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(6, 489, 130, 42);
		contentPane.add(textField_5);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(148, 432, 91, 16);
		contentPane.add(lblSubtotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setBounds(148, 502, 91, 16);
		contentPane.add(lblTax);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(251, 489, 130, 42);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setBounds(297, 461, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(452, 108, 130, 30);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(653, 108, 130, 30);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBounds(452, 166, 244, 26);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(708, 166, 75, 26);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(452, 219, 75, 19);
		contentPane.add(textField_11);
		
		JLabel lblNewLabel_3 = new JLabel("CVC");
		lblNewLabel_3.setBounds(462, 204, 37, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Credit Card Number");
		lblNewLabel_4.setBounds(462, 150, 130, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setBounds(466, 96, 43, 16);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(663, 96, 61, 16);
		contentPane.add(lblSurname);
		
		JLabel lblNewLabel_6 = new JLabel("Exp Date");
		lblNewLabel_6.setBounds(711, 150, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thank_You thanks = new Thank_You();
				thanks.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btnNewButton.setBounds(634, 475, 148, 70);
		contentPane.add(btnNewButton);
	}
}
