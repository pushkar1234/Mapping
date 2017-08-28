package OneToOneUni;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 Student student =new Student("pushkar", 101,null);
	        Address address = new Address("karad",415110,"main road");
	         
	         
	        Session session = HibernateUtility.getfactory().openSession();
	       Transaction tx= session.beginTransaction();
	        address.setAddressId(student.getStudentId());
	        student.setAddress(address);
	        session.save(student); 
	       /* List<Student> students = (List<Student>)session.createQuery("from Student ").list();
	       for(Student s: students){
	            System.out.println("Details : "+s);
	           
	        }*/
	        session.flush();
	       tx.commit();
	        session.close(); 
	        Session session2=HibernateUtility.getfactory().openSession();
	        Student student2=(Student) session2.load(Student.class, 4);
	        session2.close();
	        
	        //System.out.println(student.getAddress());
	        
	    }
	
	 

}
