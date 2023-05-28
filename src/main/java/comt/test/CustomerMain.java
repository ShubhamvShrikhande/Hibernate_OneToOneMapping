package comt.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerMain {
	public static void main(String[] args) {
		Configuration  configuration = new Configuration(); 
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory(); 
		Session session = sessionFactory.openSession();
		Transaction transection =session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setFirstname("ganesh");
		customer.setLastname("tapre");
		customer.setPhoneNumber("3456789");
		
		Transactions transactions = new Transactions();
		transactions.setDate(new Date());
		transactions.setTotal(5000);
		
		customer.setTransactions(transactions);
		
		session.save(customer);
		transection.commit();
		session.close();
		sessionFactory.close();
		}

}
