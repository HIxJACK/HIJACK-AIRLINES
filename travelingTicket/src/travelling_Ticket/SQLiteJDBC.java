
/*
package travelling_Ticket;

import java.sql.*;

public class SQLiteJDBC {
	/*
public  static Connection SQLite() {
		Connection c = null;
		   Statement stmt = null;
		   try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:\\Users\\cjt1496\\sqlite\\test.db");
		      c.setAutoCommit(false);
		      System.out.println("Opened database successfully");  
		      stmt = c.createStatement();
		      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
		      
		      while ( rs.next() ) {
		         int id = rs.getInt("id");
		         String  name = rs.getString("name");
		         int age  = rs.getInt("age");
		         String  address = rs.getString("address");
		         float salary = rs.getFloat("salary");
		         
		         System.out.println( "DL 113 = " + id );
		         System.out.println( "11:00am - 12:00pm = " + name );
		         System.out.println( "$100.00 = " + age );
		         System.out.println( "$500.00 = " + address );
		         System.out.println( "1000.00 = " + salary );
		         System.out.println();
		      }
		      rs.close();
		      stmt.close();
		      c.close();
		      
		   } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		   }System.out.println("Operation done successfully");
		   return null;
		}
		

	}
	
*/


