package com.channelsoft.ssm.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.channelsoft.ssm.domain.User;
import com.channelsoft.ssm.mapper.UserMapper;
import com.channelsoft.ssm.service.IUserService;

@Service
public class UserService implements IUserService{
	private static Logger logger=Logger.getLogger(UserService.class);
	@Autowired
	private UserMapper userMapper;
	
	public int deleteByPrimaryKey(Integer uid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer uid) {
		logger.debug("进入selectByPrimaryKey()方法...");
		return userMapper.selectByPrimaryKey(uid);
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
