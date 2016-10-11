package com.hoodo.rci.service;


import com.hoodo.rci.model.User;


/**
 * 通用dao，包括基本的CRUD方法
 * @author Ljh
 *
 */

public interface IUserService {
 
	public User login(String userName,String passWord);
}
 
