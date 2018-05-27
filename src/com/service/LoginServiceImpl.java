package com.service;

import com.mapper.UserMapper;
import com.po.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by QQQ on 2018/5/27.
 */
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User confirmLogin(String id) {
		return userMapper.comfirmLogin(id);
	}
}
