package com.sneha.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//delete data
		Employee emp3 = session.load(Employee.class, 2);
		session.delete(emp3);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Record deleted");

	}

}
