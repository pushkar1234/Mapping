package OneToOneBi;

import javax.crypto.CipherOutputStream;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.PRIVATE_MEMBER;

public class HibernateUtility1 {
	static SessionFactory getfactory()
	{
		SessionFactory factory=new Configuration().configure("OneToOne2.xml").buildSessionFactory();
		return factory;
		
	}

}
