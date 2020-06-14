package com.basepackage.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.function.BiPredicate;

import com.basepackage.service.DeleteData;
import com.basepackage.utility.DatabaseConnection;

public class DeleteDataImpl implements DeleteData{
	
	@Override
	public void deleteData(){
		
	try
	{
		Connection con=new DatabaseConnection().buildConnection();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username to perform delete operation::");
		System.out.println("username");
		String u_name=sc.nextLine();
		
		System.out.println("Password:");
		int password=sc.nextInt();
		
		
		BiPredicate<String,Integer> bp =(a,b)->(a.equals("Chahat") && b==1234);
		boolean checkAdmin=bp.test(u_name,password);
		System.out.println(checkAdmin);
		String sql = "delete  from interns where Id=3";
		
		if(checkAdmin)
		{
			PreparedStatement stmt = con.prepareStatement(sql);
			
			
			 int affectedRecords = stmt.executeUpdate();
	            System.out.println("Number of deleted records:- " + affectedRecords);
		}
		else
			System.out.println("you are not a user");
		sc.close();
	}
			
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	}
