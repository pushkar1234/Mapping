package OneToOneBi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 Student student =new Student("pushkar", 101,null);
	        Address address = new Address("karad",415110,"main road",null);
	         
	         
	        Session session = HibernateUtility1.getfactory().openSession();
	       Transaction tx= session.beginTransaction();
	       // address.setAddressId(student.getStudentId());
	        student.setAddress(address);
	        address.setStudent(student);
	        session.persist(address);
	        //session.persist(student);
	         
	        List<Student> students = (List<Student>)session.createQuery("from Student ").list();
	        for(Student s: students){
	            System.out.println("Details : "+s);
	           
	        }
	        tx.commit();
	        session.close();  
	    }
	 

}
