package com.basepackage.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.basepackage.bean.Csv;
import com.basepackage.service.FilterData;
import com.basepackage.utility.DatabaseConnection;

public class FilterDataImpl implements FilterData {

	@Override
	public void filterData() {
		 
			 ArrayList<Csv> listOfInterns = new ArrayList<Csv>();
		  try { 
 			  Connection con=new DatabaseConnection().buildConnection(); 
			  String sql =  "select * from interns";
		
		  
		  PreparedStatement stmt = con.prepareStatement(sql); 
		  ResultSet rs=stmt.executeQuery();
		  
		  
		 while(rs.next()) { 
			 listOfInterns.add(new  Csv(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString (5)));
	}
		 System.out.println(listOfInterns); 
		 List<Csv> nameStartWith=listOfInterns.stream().filter(f->f.getUsername().startsWith("A")).
				 collect(Collectors.toList()); 
		 System.out.println("intern data whose Name starts with A");
		 System.out.println(nameStartWith);
		  
		   List<Csv> JobLocation=listOfInterns.stream().filter(f->f.getCompany().equals("Mi")).collect( Collectors.toList());
		   System.out.println("intern data whose job is at Mi");
		  System.out.println(JobLocation);
				   stmt.close(); 
		  }
		 
		  catch(Exception e) { 
			  e.printStackTrace();
			  }
		  
		  }
	}

