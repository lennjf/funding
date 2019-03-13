package cn.ning.manager.dao;

import cn.ning.bean.ParamExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ParamMapper {
    int countByExample(ParamExample example);

    int deleteByExample(ParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Param record);

    int insertSelective(Param record);

    List<Param> selectByExample(ParamExample example);

    Param selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@org.apache.ibatis.annotations.Param("record") Param record, @Param("example") ParamExample example);

    int updateByExample(@Param("record") Param record, @Param("example") ParamExample example);

    int updateByPrimaryKeySelective(Param record);

    int updateByPrimaryKey(Param record);
}