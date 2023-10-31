package org.jsp.empdept.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String name;
 private String email;
 private int age;
 private long phone;
 @CreationTimestamp
 private LocalDate ordertime;
 @UpdateTimestamp
 private LocalDate deliverytime;
 public LocalDate getOrdertime() {
	return ordertime;
}
public void setOrdertime(LocalDate ordertime) {
	this.ordertime = ordertime;
}
public LocalDate getDeliverytime() {
	return deliverytime;
}
public void setDeliverytime(LocalDate deliverytime) {
	this.deliverytime = deliverytime;
}
@ManyToOne
 @JoinColumn
 private Department departments;
public Department getDepartments() {
	return departments;
}
public void setDepartments(Department departments) {
	this.departments = departments;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + "]";
}

 
 
}
