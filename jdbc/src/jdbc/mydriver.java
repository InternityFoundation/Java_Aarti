package jdbc;

import java.sql.*;
import java.lang.*;

public class mydriver {
	public static void main(String[] args) {
			try {
			//Get Connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			//Create a stmt
			Statement myStmt = con.createStatement();
			//Execute a query
			String sql = "insert into information " 
					+ "(lastname , firstname , gender , dob, roollnumber)" 
					+ "values ('srivastava','Bhumi','female','1980-05-27','5')";
			String sql1 = "insert into information " 
					+ "(lastname , firstname , gender , dob, roollnumber)" 
					+ "values ('Yadav','Aarti','female','1981-06-14','6')";
			String sql2 = "insert into information " 
					+ "(lastname , firstname , gender , dob, roollnumber)" 
					+ "values ('Kumar','Shrijeet','male','1990-06-04','7')";
			String sql3 = "insert into information " 
					+ "(lastname , firstname , gender , dob, roollnumber)" 
					+ "values ('Yadav','Anshul','male','2000-01-23','8')";
					
	              myStmt.executeUpdate(sql);
	              myStmt.executeUpdate(sql1);
	              myStmt.executeUpdate(sql2);
	              myStmt.executeUpdate(sql3);
			   
			    System.out.println("insert complete");
			 ResultSet myRs = myStmt.executeQuery("select* from information");
			
			}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}

}

