package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneTest {

	public static void main(String[] args) {

		// SessionFactory factory = new  Configuration().configure("com/hibernate/mapping/hibernate.config.xml").buildSessionFactory();
		Configuration cfg = new Configuration();
		cfg.configure("com/hibernate/mapping/hibernate.config.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// create One to one object
		OnetoOne one = new OnetoOne();
		one.setId(001);
		one.setName("Manika Sambhor");
		// creating object for employees 
		Employee emp = new Employee();
		 emp.setEmployee_id(001);
		 emp.setAssigned_work("to solve problems is you job");
		 emp.setOnetoone(one);
		 one.setEmployee(emp);


		session.save(one);
		session.save(emp);
		tx.commit();
		session.close();
		factory.close();

	}

}
