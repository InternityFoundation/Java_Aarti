package com.basepackage.data;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.basepackage.bean.Csv;
import com.basepackage.dao.DaoInterfaceForInsertion;
import com.helper.FactoryProvider;

@SuppressWarnings("deprecation")
public class SaveData extends HttpServlet implements DaoInterfaceForInsertion {
	private static final long serialVersionUID = 1L;

	@Override
		public void insertValue(List<Csv> csvList ,HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException 
  		{
			try {
					for(Csv csvGet :csvList){
						String Id= request.getParameter("Id");
						String username= request.getParameter("username");
						String password= request.getParameter(" password");
						String  phone_no = request.getParameter(" phone_no");
						String job_status = request.getParameter("job_status");
						String  company = request.getParameter(" company");
						
						Session session = FactoryProvider.getFactory().openSession();
						Transaction tx = session.beginTransaction();
						session.save(csvGet);
						tx.commit();
						
						Csv csvGet1 = new Csv(Id, username, password, phone_no, job_status , company);
						Session s = FactoryProvider.getFactory().openSession();
						Transaction tx1 = s.beginTransaction();
						s.save(csvGet1);
						tx1.commit();
						s.close();
					
					}	
					
					
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	@Override
	public void checkAdmin(){
		
		try {
			
			System.out.println("Enter username to perform delete operation:");
			Scanner sc= new Scanner(System.in);
			String u_name = sc.nextLine();
			System.out.println("Enter username to perform delete operation:");
			String password = sc.nextLine();
			
			BiPredicate<String,String> bp = (a,b)-> (a.equals("Chahat") && b.equals("1234"));
			boolean check = bp.test(u_name, password);
			System.out.println(check);
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();
			Query query= (Query) session.createQuery("delete Interns where Id=1;");
			
			
	
			if(query != null) {
				int result= query.executeUpdate();
				System.out.println("Number of recors deleted:"+result);
				tx.commit();
			}
			else
				System.out.println("You entered wrong username or password");
			session.close();
			sc.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
