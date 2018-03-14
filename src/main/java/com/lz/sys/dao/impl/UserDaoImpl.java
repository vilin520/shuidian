package com.lz.sys.dao.impl;

import org.springframework.stereotype.Repository;

import com.lz.common.dao.impl.BaseDaoImpl;
import com.lz.sys.dao.UserDao;
import com.lz.sys.model.User;

@Repository("userDaoImpl")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
