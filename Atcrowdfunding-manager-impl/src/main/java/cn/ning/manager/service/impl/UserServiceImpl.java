package cn.ning.manager.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ning.bean.User;
import cn.ning.bean.UserExample;
import cn.ning.exception.LoginFailureException;
import cn.ning.manager.dao.UserMapper;
import cn.ning.manager.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(HashMap<String, String> map) {
		UserExample userExample = new UserExample();
		userExample.createCriteria().andLoginacctEqualTo(map.get("loginAcct")).andUserpswdEqualTo(map.get("userpswd"));
		List<User> list = userMapper.selectByExample(userExample);
		if (list.size()<1) {
			throw new LoginFailureException("用户登录失败，用户账号或密码不正确");
		};
		User user = list.get(0);
		return user;
	}

	

	
	
	
}
