package org.jsp.empdept.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String location;
 private String depcode;
 @OneToMany(mappedBy = "departments")
 private List<Employee> employees;
public List<Employee> getEmployees() {
	return employees;
}
public void setEmployees(List<Employee> employees) {
	this.employees = employees;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDepcode() {
	return depcode;
}
public void setDepcode(String depcode) {
	this.depcode = depcode;
}
@Override
public String toString() {
	return "Department [id=" + id + ", location=" + location + ", depcode=" + depcode + "]";
}
 
}
