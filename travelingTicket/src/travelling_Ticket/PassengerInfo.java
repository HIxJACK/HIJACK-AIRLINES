package travelling_Ticket;

import java.sql.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

import travelling_Ticket.Flight_Times;
import travelling_Ticket.Plane_Seating;

import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class PassengerInfo extends javax.swing.JFrame {

	JFrame frame;
	private JTextField textFirstName;
	private JTextField textLastName;
	private JTextField textSkymile;
	private JTextField textHomeAddress;
	private JTextField textCity;
	private JTextField textState;
	private JTextField textZip;
	private JPasswordField passwordField_1;
	private JTextField textEmail;
//	private final Action action = new SwingAction();
	private JTextField textUsername;

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
	Connection connection = null;
	/**
	 * Create the application.
	 */
	public PassengerInfo() {
		initialize();	
		connection= sqliteConnection.dbConnector();  //initialize method for connection
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 777, 595);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 5, 760, 30);
		frame.getContentPane().add(panel);
		
		JLabel lblLogo = new JLabel("HIJACK AIRLINES");
		lblLogo.setFont(new Font("Algerian", Font.PLAIN, 15));
		panel.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(42, 65, 77, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setBounds(42, 100, 77, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SkyMile Number");
		lblNewLabel_2.setBounds(399, 100, 108, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Home Address");
		lblNewLabel_3.setBounds(40, 180, 108, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City");
		lblNewLabel_4.setBounds(399, 180, 36, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		textFirstName = new JTextField();
		textFirstName.setBounds(131, 65, 254, 26);
		frame.getContentPane().add(textFirstName);
		textFirstName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setBounds(131, 100, 254, 26);
		frame.getContentPane().add(textLastName);
		textLastName.setColumns(10);
		
		textSkymile = new JTextField();
		textSkymile.setBounds(519, 100, 130, 26);
		frame.getContentPane().add(textSkymile);
		textSkymile.setColumns(10);
		
		textHomeAddress = new JTextField();
		textHomeAddress.setBounds(141, 180, 246, 26);
		frame.getContentPane().add(textHomeAddress);
		textHomeAddress.setColumns(10);
		
		JLabel lblState = new JLabel("State");
		lblState.setBounds(578, 180, 36, 16);
		frame.getContentPane().add(lblState);
		
		textCity = new JTextField();
		textCity.setBounds(434, 180, 134, 26);
		frame.getContentPane().add(textCity);
		textCity.setColumns(10);
		
		textState = new JTextField();
		textState.setBounds(613,180, 36, 26);
		frame.getContentPane().add(textState);
		textState.setColumns(10);
		
		JLabel lblZip = new JLabel("Zip");
		lblZip.setBounds(648, 180, 25, 16);
		frame.getContentPane().add(lblZip);
		
		textZip = new JTextField();
		textZip.setBounds(674, 180, 67, 26);
		frame.getContentPane().add(textZip);
		textZip.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(23, 131, 61, 16);
		frame.getContentPane().add(label);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(42, 308, 77, 16);
		frame.getContentPane().add(lblUsername);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(131, 373, 185, 26);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(42,380, 61, 16);
		frame.getContentPane().add(lblPassword);
		class SwingAction extends AbstractAction {
			public SwingAction() {
				putValue(NAME, "SwingAction");
				putValue(SHORT_DESCRIPTION, "Some short description");
			}
			public void actionPerformed(ActionEvent e) {
			}
		}
		JButton btnLOGIN = new JButton("LOGIN");
		btnLOGIN.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				try {		//create database
					String query = "insert into PassengerID(FirstName,LastName,Skymile,HomeAddress,City,State,Zip,email,username,password) values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst= connection.prepareStatement(query);
					pst.setString(1,textFirstName.getText() );
					pst.setString(2,textLastName.getText() );
					pst.setInt(3,Integer.parseInt(textSkymile.getText()));
				//	pst.setString(3,textSkymiles.getText() );
					pst.setString(4,textHomeAddress.getText() );
					pst.setString(5,textCity.getText() );
					pst.setString(6,textState.getText() );
					pst.setString(7,textZip.getText() );
					pst.setString(8,textEmail.getText() );
					pst.setString(9,textUsername.getText() );
					pst.setInt(10,Integer.parseInt(passwordField_1.getText()));
					ResultSet rs=pst.getGeneratedKeys();
			//		ResultSet rs = pst.getResultSet();
					pst.execute();
					JOptionPane.showMessageDialog(null,"Saved!");
					
					int count = 0;
					while(rs.next()){
						count=count+1;
						
					}
					if (count ==1)
					{
						JOptionPane.showMessageDialog(null,"Username and password are correct! ");	
					}
					else if (count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and password ");
					}
					else{ 
						JOptionPane.showMessageDialog(null, "Username and password is not correct. Please try again!");
					}
					
				
					pst.close();
					rs.close();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
			
			frame.dispose();
			Plane_Seating seating = new Plane_Seating();
			seating.setVisible(true);
			}	
		});
		btnLOGIN.setSelectedIcon(null);
//		btnLOGIN.setAction(action);
		btnLOGIN.setBounds(560, 482, 120, 58);
		frame.getContentPane().add(btnLOGIN);
		
		JLabel lblNewLabel_5 = new JLabel("email");
		lblNewLabel_5.setBounds(42, 240, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		textEmail = new JTextField();
		textEmail.setBounds(96, 240, 254, 26);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 280, 765, 38);
		frame.getContentPane().add(separator);
		
		textUsername = new JTextField();
		textUsername.setBounds(133, 308, 185, 26);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			Flight_Times flight = new Flight_Times();
			flight.setVisible(true);
				
				
			}
		});
		btnBack.setBounds(330, 482, 120, 58);
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
		btnExit.setBounds(100, 482, 120, 58);
		frame.getContentPane().add(btnExit);
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Tahoma", Font.PLAIN, 15));
	/*	btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				frame.dispose();
			Plane_Seating seating = new Plane_Seating();
			seating.setVisible(true);
				
				
			}
		});
		btnNext.setBounds(640, 482, 120, 58);
		frame.getContentPane().add(btnNext);*/
	}
	
	}
//passenger info