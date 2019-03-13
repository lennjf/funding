package cn.ning.manager.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ning.bean.User;
import cn.ning.manager.dao.UserMapper;

public interface UserService {

	User login(HashMap<String, String> map);
	
}
