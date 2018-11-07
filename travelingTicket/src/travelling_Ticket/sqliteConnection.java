package travelling_Ticket;
import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	Connection  conn = null;
	public static Connection dbConnector()
	{
		
		try {		//create database
			Class.forName("org.sqlite.JDBC");
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/Users/sarahhinton/Documents/data structures/FinalHijax/Passenger.db");
			JOptionPane.showMessageDialog(null,"Connection Successful");
			return connection;
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}

