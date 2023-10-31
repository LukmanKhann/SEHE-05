package org.jsp.springdemo;

public class User {
	private String name;
	private long phone;
	private String email;
	private int age;
	private double salary;
	public User() {
		System.out.println("No Argument Constructor");
	}
	public void display() {
		System.out.println("Name"+name);
		System.out.println("phone"+phone);
		System.out.println("email"+email);
		System.out.println("age"+age);
		System.out.println("salary"+salary);
		
	}
	public User(String name,long phone,String email,int age,double salary) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.salary = salary;
		System.out.println("Argument Constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
