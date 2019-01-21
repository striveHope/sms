package com.sms.mapper.base;

import com.sms.entity.base.Operator;
import com.sms.entity.base.OperatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperatorMapper {
    long countByExample(OperatorExample example);

    int deleteByExample(OperatorExample example);

    int insert(Operator record);

    int insertSelective(Operator record);

    List<Operator> selectByExample(OperatorExample example);

    int updateByExampleSelective(@Param("record") Operator record, @Param("example") OperatorExample example);

    int updateByExample(@Param("record") Operator record, @Param("example") OperatorExample example);
}