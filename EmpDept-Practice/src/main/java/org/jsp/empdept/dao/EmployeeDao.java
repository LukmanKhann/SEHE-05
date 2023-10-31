package org.jsp.empdept.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.empdept.dto.Department;
import org.jsp.empdept.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	private EntityManager manager;
	
	public Employee saveEmp(Employee emp,int id) {
		Department d = manager.find(Department.class, id);
		if(d!=null) {
			d.getEmployees().add(emp);
			emp.setDepartments(d);
			manager.persist(emp);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return emp;
		}
		return null;
	}
	
	public Employee updateEmp(Employee emp ,int id) {
		Department d = manager.find(Department.class, id);
		if(d!=null) {
			d.getEmployees().add(emp);
			emp.setDepartments(d);
			manager.merge(emp);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return emp;
		}
		return null;
	}
	public Employee findEmp(int did,int eid) {
		Department d = manager.find(Department.class, did);
		if(d!=null) {
		 Employee e = manager.find(Employee.class, eid);
		 System.out.println(e);
		 
		}
		return null;
	}
	
	public boolean deleteEmp(int did,int eid) {
		Department d = manager.find(Department.class, did);
		if(d!=null) {
			Employee e = manager.find(Employee.class, eid);
			if(e!=null) {
				manager.remove(e);
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			transaction.commit();
			return true;
			}
		}
		return false;
	}

}
