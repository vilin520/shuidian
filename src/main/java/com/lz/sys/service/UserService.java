package com.lz.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lz.common.dao.BaseDao;
import com.lz.common.service.BaseService;
import com.lz.sys.dao.UserDao;
import com.lz.sys.model.User;


@Service("userService")
public class UserService extends BaseService<User> {

	@Autowired
	private UserDao userDaoImpl;
	
	@Override
	public BaseDao<User> getBaseDao() {
		return userDaoImpl;
	}
	
}
