

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Question ques = new Question();
		ques.setQ_id(1);
		ques.setQuestion("what is Spring");
		
		Answer answer = new Answer ();
		answer.setAnswer_id(1);
		answer.setAnswer("Spring is a framework");
		ques.setAnswer(answer);
		
		
		Question ques2 = new Question();
		ques2.setQ_id(2);
		ques2.setQuestion("what is Bootstrap");
		
		Answer answer2 = new Answer ();
		answer2.setAnswer_id(2);
		answer2.setAnswer("Bootstrap is a CSS framework");
		ques2.setAnswer(answer);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ques2);
		session.save(ques);
		session.save(answer2);
		session.save(answer);
		tx.commit();
		session.close();
	}

}
