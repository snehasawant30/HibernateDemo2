package com.sneha.pojo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

import com.mysql.cj.Query;

public class Select {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//select data
		org.hibernate.query.Query query = session.createQuery("from Employee");
		List<Employee> emplist = query.list();
		
		for (Employee e : emplist) {
			System.out.println("Id = +e.getId");
			System.out.println("Full Name = "+e.getFullName());
			System.out.println("Age = "+e.getAge());
			System.out.println("City = "+e.getCity());
			System.out.println("Salary = "+e.getSalary());
		}
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Record....");
	}

}
