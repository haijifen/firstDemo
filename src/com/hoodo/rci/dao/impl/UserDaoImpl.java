package com.hoodo.rci.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hoodo.rci.dao.IUserDao;
import com.hoodo.rci.model.User;


/**
 * 用户DAO实现类
 * @author GJ
 * @date   2015年4月15日
 */

public class UserDaoImpl implements IUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

	@Override
	public User login(String userName, String password) {
		String hql = "from User u where u.userName = '"+userName+"' and u.password = '"+password+"'";
		Session session = sessionFactory.openSession();
        Query query = session.createQuery(hql);
		List<User> users = query.list();
		if (users!= null && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
