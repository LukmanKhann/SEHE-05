package org.jsp.usersrpingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.jsp.usersrpingapp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
        @Autowired
	EntityManager manager ;
//	EntityTransaction t = manager.getTransaction();
	public User saveuser(User user) {
		EntityTransaction t = manager.getTransaction();
		manager.persist(user);
		t.begin();
		t.commit();
		return user;
	}
	
	public User updateuser(User user) {
		EntityTransaction t = manager.getTransaction();
		manager.merge(user);
		t.begin();
		t.commit();
		return user;
	}
	public User finduser(int id) {
		return manager.find(User.class, id);
	}
	public boolean deleteuser(int id) {
		EntityTransaction t = manager.getTransaction();
		User u = manager.find(User.class, id);
		if(u!=null) {
			manager.remove(u);
			t.begin();
			t.commit();
			return true;
		}
		return false;
	}
	
}
