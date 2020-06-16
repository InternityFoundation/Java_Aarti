package com.hibernate.OneToMany;
import com.hibernate.OneToMany.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoManyTest {

	public static void main(String[] args) {
		
		// SessionFactory factory = new  Configuration().configure("com/hibernate/mapping/hibernate.config.xml").buildSessionFactory();
				Configuration cfg = new Configuration();
				cfg.configure("com/hibernate/OneToMany/hibernate.config.xml");
				SessionFactory factory = cfg.buildSessionFactory();
				Session session = factory.openSession();
				Transaction tx = session.beginTransaction();
				
				University uni = new University();
			uni.setU_name("GGSIPU");
				
			
				Student student =  new Student();
				student.setS_name("Aaradhya");
				student.setS_branch("IT");
			student.setUniversity(uni);
				
				Student student1 =  new Student();
				
				student1.setS_name("Gita");
				student1.setS_branch("CS");
				student1.setUniversity(uni);
				
				
				Student student2 =  new Student();
				student2.setS_branch("CSE");
				student2.setS_name("Riya");
				student2.setUniversity(uni);	
				
				List<Student> st = new ArrayList<Student>();
				st.add(student);
				st.add(student1);
				st.add(student2);
			
				uni.setStudent(st);
				
				
				session.save(uni);
			session.save(student);
				session.save(student1);
				session.save(student2);
				
				
				University u = session.get(University.class, 1);
				System.out.println(u.getU_id()+"::::::"+u.getU_name()+"::::::");
				//System.out.println(u.getStudent().size());
				
				tx.commit();
				session.close();
				
				
				

	}

}
