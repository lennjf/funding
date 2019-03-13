package cn.ning.manager.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ning.manager.dao.TestDao;
import cn.ning.manager.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	@Override
	public void insert() {
		
		testDao.insert("zhangsan");
		
	}

}
