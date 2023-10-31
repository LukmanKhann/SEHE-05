package org.jsp.springhibernatedemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.springhibernatedemo.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
  

private HibernateTemplate template;

public HibernateTemplate getTemplate() {
	return template;
}

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
@Transactional
   public Employee save(Employee e) {
	template.save(e);
	return e;
   }
@Transactional
   public Employee update (Employee e) {
	   template.update(e);
	   return e;
	   
   }
@Transactional
   public Employee find (int id ) {
	   return template.get(Employee.class, id);
   }
@Transactional
   public boolean delete(int id) {
	  Employee e =  template.get(Employee.class, id);
	   if(e!=null) {
		   template.delete(e);
		   return true;
	   }
	   return false;
   }

public List<Employee> findall(){
	return template.loadAll(Employee.class);
}
}
