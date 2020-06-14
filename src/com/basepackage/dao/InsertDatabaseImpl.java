package com.basepackage.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.basepackage.bean.Csv;
import com.basepackage.utility.DatabaseConnection;



public class InsertDatabaseImpl implements InsertDatabase  {
	public void insertValue(List<Csv> csvList){ 
		
		try
		{
			
	        Connection con =new DatabaseConnection().buildConnection();
	        System.out.println("Successful !");
	       // System.out.println(String.format("getCatalog() returns : %s", con.getCatalog()));
	        String sql = "insert  into interns( Id,username , password , job_status , company) "+" values(?,?,?,?,?)";
	      PreparedStatement  stmt = con.prepareStatement(sql);
	       
			for(Csv list: csvList) {
				stmt.setInt(1, list.getId());
				stmt.setString(2,  list.getUsername());
				stmt.setString(3,  list.getPassword());
				stmt.setString(4,  list.getJob_status());
				stmt.setString(5,  list.getCompany());
				stmt.executeUpdate();				
			}
			System.out.println("data inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		public void selectData()
		{
			try
			{
				Connection con=new DatabaseConnection().buildConnection();
		        String sql = "select * from interns where Id=3";
		        
		        PreparedStatement stmt = con.prepareStatement(sql);
				ResultSet rs=stmt.executeQuery();
				
				String InternInfo="";
				while(rs.next())
				{
					InternInfo = rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5);
					System.out.println("intern data whose ID=3");
					System.out.println(InternInfo);
				}
					

				stmt.close();
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
		}
}

