package travelling_Ticket;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Plane_Seating extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plane_Seating frame = new Plane_Seating();
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
	public Plane_Seating() {
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
		
		JLabel lblNewLabel = new JLabel("Window Seat");
		lblNewLabel.setBounds(16, 48, 84, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblBMiddle = new JLabel("Middle Seat");
		lblBMiddle.setBounds(112, 48, 72, 16);
		contentPane.add(lblBMiddle);
		
		JLabel lblAisleSeat = new JLabel("Aisle Seat");
		lblAisleSeat.setBounds(196, 48, 66, 16);
		contentPane.add(lblAisleSeat);
		
		JLabel lblAisleSeat_1 = new JLabel("Aisle Seat");
		lblAisleSeat_1.setBounds(511, 48, 72, 16);
		contentPane.add(lblAisleSeat_1);
		
		JLabel lblMiddleSeat = new JLabel("Middle Seat");
		lblMiddleSeat.setBounds(595, 48, 84, 16);
		contentPane.add(lblMiddleSeat);
		
		JLabel label_1 = new JLabel("Window Seat");
		label_1.setBounds(685, 48, 84, 16);
		contentPane.add(label_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1A");
		rdbtnNewRadioButton.setBounds(6, 73, 55, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtna = new JRadioButton("1B");
		rdbtna.setBounds(112, 76, 55, 23);
		contentPane.add(rdbtna);
		
		JRadioButton rdbtna_1 = new JRadioButton("1C");
		rdbtna_1.setBounds(206, 73, 55, 23);
		contentPane.add(rdbtna_1);
		
		JRadioButton rdbtnb = new JRadioButton("2A");
		rdbtnb.setBounds(6, 108, 55, 23);
		contentPane.add(rdbtnb);
		
		JRadioButton rdbtnb_1 = new JRadioButton("2B");
		rdbtnb_1.setBounds(112, 111, 55, 23);
		contentPane.add(rdbtnb_1);
		
		JRadioButton rdbtnb_2 = new JRadioButton("2C");
		rdbtnb_2.setBounds(207, 108, 55, 23);
		contentPane.add(rdbtnb_2);
		
		JRadioButton rdbtnd = new JRadioButton("1D");
		rdbtnd.setBounds(511, 73, 55, 23);
		contentPane.add(rdbtnd);
		
		JRadioButton rdbtnd_1 = new JRadioButton("2D");
		rdbtnd_1.setBounds(511, 108, 55, 23);
		contentPane.add(rdbtnd_1);
		
		JRadioButton rdbtne = new JRadioButton("1E");
		rdbtne.setBounds(605, 76, 55, 23);
		contentPane.add(rdbtne);
		
		JRadioButton rdbtne_1 = new JRadioButton("2E");
		rdbtne_1.setBounds(605, 108, 55, 23);
		contentPane.add(rdbtne_1);
		
		JRadioButton rdbtnf = new JRadioButton("1F");
		rdbtnf.setBounds(685, 76, 55, 23);
		contentPane.add(rdbtnf);
		
		JRadioButton rdbtnf_1 = new JRadioButton("2F");
		rdbtnf_1.setBounds(685, 111, 55, 23);
		contentPane.add(rdbtnf_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 272, 753, 12);
		contentPane.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Class");
		lblNewLabel_1.setBounds(360, 97, 84, 16);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtna_2 = new JRadioButton("3A");
		rdbtna_2.setBounds(6, 167, 55, 23);
		contentPane.add(rdbtna_2);
		
		JRadioButton rdbtnb_3 = new JRadioButton("3B");
		rdbtnb_3.setBounds(112, 170, 55, 23);
		contentPane.add(rdbtnb_3);
		
		JRadioButton rdbtnc_1 = new JRadioButton("4C");
		rdbtnc_1.setBounds(207, 202, 55, 23);
		contentPane.add(rdbtnc_1);
		
		JRadioButton rdbtnc = new JRadioButton("3C");
		rdbtnc.setBounds(206, 167, 55, 23);
		contentPane.add(rdbtnc);
		
		JRadioButton rdbtnb_4 = new JRadioButton("4B");
		rdbtnb_4.setBounds(112, 205, 55, 23);
		contentPane.add(rdbtnb_4);
		
		JRadioButton rdbtna_3 = new JRadioButton("4A");
		rdbtna_3.setBounds(6, 202, 55, 23);
		contentPane.add(rdbtna_3);
		
		JRadioButton rdbtnd_2 = new JRadioButton("3D");
		rdbtnd_2.setBounds(511, 167, 55, 23);
		contentPane.add(rdbtnd_2);
		
		JRadioButton rdbtnd_3 = new JRadioButton("4D");
		rdbtnd_3.setBounds(511, 202, 55, 23);
		contentPane.add(rdbtnd_3);
		
		JRadioButton rdbtne_3 = new JRadioButton("4E");
		rdbtne_3.setBounds(605, 202, 55, 23);
		contentPane.add(rdbtne_3);
		
		JRadioButton rdbtne_2 = new JRadioButton("3E");
		rdbtne_2.setBounds(605, 170, 55, 23);
		contentPane.add(rdbtne_2);
		
		JRadioButton rdbtnf_2 = new JRadioButton("3F");
		rdbtnf_2.setBounds(685, 167, 55, 23);
		contentPane.add(rdbtnf_2);
		
		JRadioButton rdbtnf_3 = new JRadioButton("4F");
		rdbtnf_3.setBounds(685, 205, 55, 23);
		contentPane.add(rdbtnf_3);
		
		JLabel lblComfort = new JLabel("Comfort");
		lblComfort.setBounds(360, 206, 60, 16);
		contentPane.add(lblComfort);
		
		JRadioButton rdbtna_4 = new JRadioButton("5A");
		rdbtna_4.setBounds(6, 237, 55, 23);
		contentPane.add(rdbtna_4);
		
		JRadioButton rdbtnb_5 = new JRadioButton("5B");
		rdbtnb_5.setBounds(112, 240, 55, 23);
		contentPane.add(rdbtnb_5);
		
		JRadioButton rdbtnc_8 = new JRadioButton("11C");
		rdbtnc_8.setBounds(207, 471, 66, 23);
		contentPane.add(rdbtnc_8);
		
		JRadioButton rdbtnc_2 = new JRadioButton("5C");
		rdbtnc_2.setBounds(206, 237, 55, 23);
		contentPane.add(rdbtnc_2);
		
		JRadioButton rdbtnb_11 = new JRadioButton("11B");
		rdbtnb_11.setBounds(112, 474, 72, 23);
		contentPane.add(rdbtnb_11);
		
		JRadioButton rdbtna_10 = new JRadioButton("11A");
		rdbtna_10.setBounds(6, 471, 66, 23);
		contentPane.add(rdbtna_10);
		
		JRadioButton rdbtnd_4 = new JRadioButton("5D");
		rdbtnd_4.setBounds(511, 237, 55, 23);
		contentPane.add(rdbtnd_4);
		
		JRadioButton rdbtnd_10 = new JRadioButton("11D");
		rdbtnd_10.setBounds(511, 471, 72, 23);
		contentPane.add(rdbtnd_10);
		
		JRadioButton rdbtne_10 = new JRadioButton("11E");
		rdbtne_10.setBounds(605, 471, 74, 23);
		contentPane.add(rdbtne_10);
		
		JRadioButton rdbtne_4 = new JRadioButton("5E");
		rdbtne_4.setBounds(605, 240, 55, 23);
		contentPane.add(rdbtne_4);
		
		JRadioButton rdbtnf_4 = new JRadioButton("5F");
		rdbtnf_4.setBounds(685, 237, 55, 23);
		contentPane.add(rdbtnf_4);
		
		JRadioButton rdbtnf_10 = new JRadioButton("11F");
		rdbtnf_10.setBounds(685, 474, 74, 23);
		contentPane.add(rdbtnf_10);
		
		JRadioButton rdbtna_5 = new JRadioButton("6A");
		rdbtna_5.setBounds(6, 296, 55, 23);
		contentPane.add(rdbtna_5);
		
		JRadioButton rdbtna_6 = new JRadioButton("7A");
		rdbtna_6.setBounds(6, 331, 55, 23);
		contentPane.add(rdbtna_6);
		
		JRadioButton rdbtna_7 = new JRadioButton("8A");
		rdbtna_7.setBounds(6, 366, 55, 23);
		contentPane.add(rdbtna_7);
		
		JRadioButton rdbtna_8 = new JRadioButton("9A");
		rdbtna_8.setBounds(6, 401, 55, 23);
		contentPane.add(rdbtna_8);
		
		JRadioButton rdbtnb_6 = new JRadioButton("6B");
		rdbtnb_6.setBounds(112, 299, 55, 23);
		contentPane.add(rdbtnb_6);
		
		JRadioButton rdbtnb_7 = new JRadioButton("7B");
		rdbtnb_7.setBounds(112, 334, 55, 23);
		contentPane.add(rdbtnb_7);
		
		JRadioButton rdbtnb_8 = new JRadioButton("8B");
		rdbtnb_8.setBounds(112, 369, 55, 23);
		contentPane.add(rdbtnb_8);
		
		JRadioButton rdbtnb_9 = new JRadioButton("9B");
		rdbtnb_9.setBounds(112, 404, 55, 23);
		contentPane.add(rdbtnb_9);
		
		JRadioButton rdbtnc_6 = new JRadioButton("9C");
		rdbtnc_6.setBounds(207, 401, 55, 23);
		contentPane.add(rdbtnc_6);
		
		JRadioButton rdbtnc_5 = new JRadioButton("8C");
		rdbtnc_5.setBounds(206, 366, 55, 23);
		contentPane.add(rdbtnc_5);
		
		JRadioButton rdbtnc_4 = new JRadioButton("7C");
		rdbtnc_4.setBounds(207, 331, 55, 23);
		contentPane.add(rdbtnc_4);
		
		JRadioButton rdbtnc_3 = new JRadioButton("6C");
		rdbtnc_3.setBounds(206, 296, 55, 23);
		contentPane.add(rdbtnc_3);
		
		JLabel lblMainCabin = new JLabel("Main Cabin");
		lblMainCabin.setBounds(360, 390, 72, 16);
		contentPane.add(lblMainCabin);
		
		JRadioButton rdbtnd_5 = new JRadioButton("6D");
		rdbtnd_5.setBounds(511, 296, 55, 23);
		contentPane.add(rdbtnd_5);
		
		JRadioButton rdbtnd_6 = new JRadioButton("7D");
		rdbtnd_6.setBounds(511, 331, 55, 23);
		contentPane.add(rdbtnd_6);
		
		JRadioButton rdbtnd_7 = new JRadioButton("8D");
		rdbtnd_7.setBounds(511, 366, 55, 23);
		contentPane.add(rdbtnd_7);
		
		JRadioButton rdbtnd_8 = new JRadioButton("9D");
		rdbtnd_8.setBounds(511, 401, 55, 23);
		contentPane.add(rdbtnd_8);
		
		JRadioButton rdbtne_5 = new JRadioButton("6E");
		rdbtne_5.setBounds(605, 299, 55, 23);
		contentPane.add(rdbtne_5);
		
		JRadioButton rdbtne_6 = new JRadioButton("7E");
		rdbtne_6.setBounds(605, 331, 55, 23);
		contentPane.add(rdbtne_6);
		
		JRadioButton rdbtne_7 = new JRadioButton("8E");
		rdbtne_7.setBounds(605, 369, 55, 23);
		contentPane.add(rdbtne_7);
		
		JRadioButton rdbtne_8 = new JRadioButton("9E");
		rdbtne_8.setBounds(605, 401, 55, 23);
		contentPane.add(rdbtne_8);
		
		JRadioButton rdbtnf_5 = new JRadioButton("6F");
		rdbtnf_5.setBounds(685, 296, 55, 23);
		contentPane.add(rdbtnf_5);
		
		JRadioButton rdbtnf_6 = new JRadioButton("7F");
		rdbtnf_6.setBounds(685, 334, 55, 23);
		contentPane.add(rdbtnf_6);
		
		JRadioButton rdbtnf_7 = new JRadioButton("8F");
		rdbtnf_7.setBounds(685, 366, 55, 23);
		contentPane.add(rdbtnf_7);
		
		JRadioButton rdbtnf_8 = new JRadioButton("9F");
		rdbtnf_8.setBounds(685, 404, 55, 23);
		contentPane.add(rdbtnf_8);
		
		JRadioButton rdbtna_9 = new JRadioButton("10A");
		rdbtna_9.setBounds(6, 436, 66, 23);
		contentPane.add(rdbtna_9);
		
		JRadioButton rdbtnb_10 = new JRadioButton("10B");
		rdbtnb_10.setBounds(112, 439, 72, 23);
		contentPane.add(rdbtnb_10);
		
		JRadioButton rdbtnc_7 = new JRadioButton("10C");
		rdbtnc_7.setBounds(207, 436, 66, 23);
		contentPane.add(rdbtnc_7);
		
		JRadioButton rdbtnd_9 = new JRadioButton("10D");
		rdbtnd_9.setBounds(511, 436, 72, 23);
		contentPane.add(rdbtnd_9);
		
		JRadioButton rdbtne_9 = new JRadioButton("10E");
		rdbtne_9.setBounds(605, 436, 74, 23);
		contentPane.add(rdbtne_9);
		
		JRadioButton rdbtnf_9 = new JRadioButton("10F");
		rdbtnf_9.setBounds(685, 439, 74, 23);
		contentPane.add(rdbtnf_9);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(6, 143, 753, 12);
		contentPane.add(separator_1);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PassengerInfo window = new PassengerInfo();
				window.frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(18, 519, 117, 53);
		contentPane.add(btnNewButton_1);
		
		JButton button_1 = new JButton("Next");
		button_1.setBounds(652, 519, 117, 53);
		contentPane.add(button_1);
	}
}
