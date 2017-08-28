package OneToOneUni;

import javax.crypto.CipherOutputStream;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.PRIVATE_MEMBER;

public class HibernateUtility {
	static SessionFactory getfactory()
	{
		SessionFactory factory=new Configuration().configure("OneToOne.cfg.xml").buildSessionFactory();
		return factory;
		
	}

}
