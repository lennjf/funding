package cn.ning.manager.dao;

import cn.ning.bean.accountTypeCert;
import cn.ning.bean.accountTypeCertExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountTypeCertMapper {
    int countByExample(accountTypeCertExample example);

    int deleteByExample(accountTypeCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(accountTypeCert record);

    int insertSelective(accountTypeCert record);

    List<accountTypeCert> selectByExample(accountTypeCertExample example);

    accountTypeCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") accountTypeCert record, @Param("example") accountTypeCertExample example);

    int updateByExample(@Param("record") accountTypeCert record, @Param("example") accountTypeCertExample example);

    int updateByPrimaryKeySelective(accountTypeCert record);

    int updateByPrimaryKey(accountTypeCert record);
}