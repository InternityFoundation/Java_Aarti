package com.basepackage.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.basepackage.bean.Csv;
import com.basepackage.utility.*;



public class InsertDatabaseImpl implements InsertDatabase  {
	public void insertValue(List<Csv> csvList){ 
		 PreparedStatement stmt = null;
		
		try
		{
			
	        Connection con =new DatabaseConnection().buildConnection();
	        System.out.println("Successful !");
	       // System.out.println(String.format("getCatalog() returns : %s", con.getCatalog()));
	        String sql = "insert  into interns(username , password , job_status , company) "+" values(?,?,?,?)";
	        stmt = con.prepareStatement(sql);
	       
			for(Csv list: csvList) {
				
				stmt.setString(1,  list.getUsername());
				stmt.setString(2,  list.getPassword());
				stmt.setString(3,  list.getJob_status());
				stmt.setString(4,  list.getCompany());
				stmt.executeUpdate();				
			}
			System.out.println("data inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
    } 
	@Override
	public void checkAdmin() {
		try {
			Connection con = new DatabaseConnection().buildConnection();
			
			System.out.println("Enter username to perform delete operation.");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String u_name = sc.nextLine();
			System.out.print("Enter password:");
			String password = sc.nextLine();
			
			BiPredicate<String,String> cred =(a,b) -> (a.equals("Chahat") && b.equals("1234"));
			boolean verifyAdmin = cred.test(u_name, password);
			System.out.println(verifyAdmin);
			
			String sql = "delete from interns where Id=2";
			
			if(verifyAdmin) {
				
				PreparedStatement stmt = con.prepareStatement(sql);
				
				int rows = stmt.executeUpdate();
				System.out.println("Deleted rows::"+rows);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

	
	
	
} 

