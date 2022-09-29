package com.sneha.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//update data
		Employee emp = session.get(Employee.class, 2);
		emp.setFullName("Vishal Jadhav");
		session.update(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("Record updated....");

	}

}
