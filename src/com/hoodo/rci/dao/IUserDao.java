package com.hoodo.rci.dao;

import com.hoodo.rci.model.User;


/**
 * 用户DAO
 * @author GJ
 * @date   2015年4月15日
 */
public interface IUserDao {
 
	User login(String userName,String password);
}
 
