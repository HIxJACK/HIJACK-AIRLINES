package travelling_Ticket;
import java.sql.DriverManager;

import javax.swing.*;

import com.sun.corba.se.pept.transport.Connection;

public class sqliteConnection {
 Connection conn=null;
	public static Connection dbConnector(){
		
		try{
			Class.forName("org.sqlite.JDBC");
			Connection conn = (Connection) DriverManager.getConnection("jdbc:sqlite:\\Desktop\\EmployeeData.db");
			return conn;
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}
		
	}

}
