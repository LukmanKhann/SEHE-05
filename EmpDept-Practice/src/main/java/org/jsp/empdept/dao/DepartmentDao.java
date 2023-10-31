package org.jsp.empdept.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.empdept.dto.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDao {
  
	@Autowired
  private EntityManager manager;
	
	public Department saveDept(Department dept) {
		manager.persist(dept);
	     EntityTransaction transaction = manager.getTransaction();
	     transaction.begin();
	     transaction.commit();
	     return dept;
	}
	public Department updateDept (Department dept) {
		manager.merge(dept);
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		transaction.commit();
		return dept;
	}
}
