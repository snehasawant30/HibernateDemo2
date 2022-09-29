package com.sneha.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//insert the data
		Employee emp1 = new Employee();
		emp1.setFullName("Sneha");
		emp1.setAge(29);
		emp1.setCity("Mumbai");
		emp1.setSalary(1000000);
		
		Employee emp2 = new Employee();
		emp2.setFullName("Vishal");
		emp2.setAge(34);
		emp2.setCity("Mumbai");
		emp2.setSalary(2100000);
		
		session.save(emp1);
		session.save(emp2);
		transaction.commit();
		session.close();
		
		System.out.println("All records added...");
	}

}
