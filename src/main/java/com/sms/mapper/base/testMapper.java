package com.sms.mapper.base;

import com.sms.entity.base.test;
import com.sms.entity.base.testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testMapper {
    long countByExample(testExample example);

    int deleteByExample(testExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(test record);

    int insertSelective(test record);

    List<test> selectByExample(testExample example);

    test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") test record, @Param("example") testExample example);

    int updateByExample(@Param("record") test record, @Param("example") testExample example);

    int updateByPrimaryKeySelective(test record);

    int updateByPrimaryKey(test record);
}