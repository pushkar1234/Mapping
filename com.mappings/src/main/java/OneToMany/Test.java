package OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		 Student student =new Student("pushkar", 101,null);
	     Address address = new Address("karad",415110,"main road");
	     Address address2= new Address("pune",411028,"manjari road"); 
	     Student student2=new Student("raj",102,null);
	     Address address3=new Address("satara",787879,"pune road");
	     Address address4=new Address("mumbai",787879,"mira road");
	       Session session = HibernateUtility1.getfactory().openSession();
	       Transaction tx= session.beginTransaction();
	       List<Address> addresses= new ArrayList<Address>();
	       List<Address> addresses1= new ArrayList<Address>();
	       addresses.add(address);
	       addresses.add(address2);
	       addresses1.add(address3);
	       addresses1.add(address4);
	       student.setAddress(addresses);
	       student2.setAddress(addresses1);
	        session.persist(student);
	        session.persist(student2);
	        
	         
	        List<Student> students = (List<Student>)session.createQuery("from Student ").list();
	        for(Student s: students){
	            System.out.println("Details : "+s);
	           
	        }
	        tx.commit();
	        session.close();  
	    }
	 

}
