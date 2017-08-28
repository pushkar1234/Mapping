package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Simple {

	public static void main(String[] args) {
		
		Configuration cfg=new AnnotationConfiguration().configure("OneToOne.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Student student=new Student();
		student.setStudentName("tsysys");
		student.setStudentRollno(122);
		
		session.save(student);
		System.out.println("sucesss");
		
		
	}
	
}
