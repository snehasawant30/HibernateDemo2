package com.sneha.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "EmpID")
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "EmpName")
	private String fullName;
	@Column(name = "City")
	private String city;
	@Column(name = "Age")
	private int age;
	@Column(name = "salary")
	private long salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", city=" + city + ", age=" + age + ", salary="
				+ salary + "]";
	}
	
	
}
