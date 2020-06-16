package com.hibernate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.fetch.*;
public class Fetch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("com/hibernate/fetch/hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = (Session) factory.openSession();
		
        
     	
//        Example of get
     System.out.println("Calling of get returns null");
      Interns name1 = (Interns)session.get(Interns.class, 6);
      System.out.println(name1);
       

  //     Example of load
       System.out.println("Calling of load::::returns object not found");
     Interns stream = session.load(Interns.class, 6);
     System.out.println(stream);
     	
       
       //Example of get
       System.out.println("Calling of get As a fully initialized object");
      Interns name = (Interns)session.get(Interns.class, 2);
       //System.out.println("Intern information::::");
      //System.out.println(name.getName()+"::::"+name.getStream());
        	
		
       System.out.println("CAlling of load showing proxy object");
      Interns stream1 = session.load(Interns.class, 2);
       System.out.println(stream1);
        
     
   
       
       

	}

}
