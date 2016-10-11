package com.hoodo.rci.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.hoodo.rci.dao.IUserDao;
import com.hoodo.rci.model.User;
@Repository("userDao")
public class UserDaoIbatis implements IUserDao {

	@Resource 
    public SqlSessionTemplate sqlSession;

	@Override
	public User login(String userName, String password) {
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("userName", userName);
		parameter.put("password", password);
		return sqlSession.selectOne("user.login", parameter);
	}

}
