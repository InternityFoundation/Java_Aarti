package com.hibernate.fetch;

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
        cfg.configure("com/hibernate/fetch/hibernate.config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = (Session) factory.openSession();
        Transaction tx = session.beginTransaction();
        //Intern Detailss
        Interns intern = new Interns();
        intern.setId(1);
        intern.setName("Gita Gupta");
        intern.setStream("Java");
        
        //Intern Detailss
        Interns intern1 = new Interns();
        intern1.setId(2);
        intern1.setName("Riya Mandal");
        intern1.setStream("Java");
        session.save(intern);
        session.save(intern1);      
        tx.commit();
        session.close();
		 factory.close();
		 
       
        
    }
}
