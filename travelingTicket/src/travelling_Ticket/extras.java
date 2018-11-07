package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class extras extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					extras frame = new extras();
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
	public extras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
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
		
		JLabel lblNewLabel = new JLabel("EXTRAS");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(361, 48, 92, 51);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Carry on?");
		chckbxNewCheckBox.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(109, 132, 100, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox bagComboBox = new JComboBox();
		bagComboBox.setModel(new DefaultComboBoxModel(new Integer[] {0, 1, 2, 3, 4}));
		bagComboBox.setBounds(546, 133, 138, 27);
		contentPane.add(bagComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Baggages ");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(557, 116, 100, 16);
		contentPane.add(lblNewLabel_1);
		
		JComboBox petComboBox = new JComboBox();
		petComboBox.setModel(new DefaultComboBoxModel(new Integer[] {0, 1, 2}));
		petComboBox.setBounds(109, 190, 100, 27);
		contentPane.add(petComboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Pets");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(120, 171, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Special needs?");
		chckbxNewCheckBox_1.setBounds(109, 229, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Foods");
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(556, 172, 101, 16);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 87, 766, 12);
		contentPane.add(separator);
		
		JComboBox foodComboBox = new JComboBox();
		foodComboBox.setModel(new DefaultComboBoxModel(new String[] {"Vegetarian", "Vegan", "Regular"}));
		foodComboBox.setBounds(546, 190, 138, 27);
		contentPane.add(foodComboBox);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Plane_Seating seat = new Plane_Seating();
				seat.setVisible(true);
			}
		});
		btnNewButton.setBounds(6, 311, 151, 61);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Checkout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				checkout check = new checkout();
				check.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(628, 311, 166, 61);
		contentPane.add(btnNewButton_1);
	}
}
