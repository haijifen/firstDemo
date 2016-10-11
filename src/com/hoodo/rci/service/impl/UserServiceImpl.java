package com.hoodo.rci.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.hoodo.rci.dao.IUserDao;
import com.hoodo.rci.model.User;
import com.hoodo.rci.service.IUserService;


/**
 * 登陆业务实现类
 * @author GJ
 * @date   2015年4月15日
 */
@Transactional(readOnly=false)
@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao userDao;
	
	@Override
	public User login(String userName, String password) {
		return userDao.login(userName, password);
	}

	
	

}
