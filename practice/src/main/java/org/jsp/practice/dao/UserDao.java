package org.jsp.practice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.practice.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class UserDao {
       @Autowired
	private EntityManager manager;
       
       public User saveUser( User u ) {
    	   manager.persist(u);
    	   EntityTransaction transaction = manager.getTransaction();
    	   transaction.begin();
    	   transaction.commit();
    	   return u;
       }
       public User updateUser(User u ) {
    	   manager.merge(u);
    	   EntityTransaction transaction = manager.getTransaction();
    	   transaction.begin();
    	   transaction.commit();
    	   return u;
       }
       public User findUser(int id) {
    	  return manager.find(User.class, id);
       }
       public boolean deleteUser(int id) {
    	   User u = manager.find(User.class, id);
    	   if(u!=null) {
    		   manager.remove(u);
    		   EntityTransaction transaction = manager.getTransaction();
    		   transaction.begin();
    		   transaction.commit();
    		   return true;
    	   }
    	   else {
    		   return false;
    	   }
       }
}
