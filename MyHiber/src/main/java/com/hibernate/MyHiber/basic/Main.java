package com.hibernate.MyHiber.basic;

import java.util.Date;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

public class Main 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
    	
        System.out.println( "Hello Interns and Coaches!...." );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = (Session) factory.openSession();
        Transaction tx = (Transaction) session.beginTransaction();
        
        //Intern Detailss
        Interns intern = new Interns();
        intern.setIntern_name("Sakshi");
        intern.setIntern_stream("Java");
        intern.setJoiningDate(new Date());
        intern.setX(2356);
        
        //Intern Detailss
        Interns intern1 = new Interns();
        intern1.setIntern_name("Riya_Mandal");
        intern1.setIntern_stream("Java");
        intern1.setJoiningDate(new Date());
        intern1.setX(2344);
       
        //Intern Detailss
        Interns intern2 = new Interns();
        intern2.setIntern_name("Gita_Gupta");
        intern2.setIntern_stream("Java");
        intern2.setJoiningDate(new Date());
        
      
       
        System.out.println(intern);
        System.out.println(intern1);
        System.out.println(intern2);
     
        session.save(intern);
        session.save(intern1);
        session.save(intern2);
   
        tx.commit();
		 session.close();
		 
		// SECOND level cache
		 
		 Session session1 = factory.openSession();
		 Interns student = session1.get(Interns.class,1);
		 System.out.println("Second level caching is executed;;");
		 System.out.println(student.getIntern_id()+":::"+student.getIntern_name()+"::::"+student.getIntern_stream());
		
		 
		 session.close();
		 factory.close();
		 System.out.println("Data Inserted properly");
       
        
    }
}
