package cn.ning.manager.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface TestDao {
	
	public void insert(@Param("name")String name);
}
