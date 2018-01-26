package com.funcanteen.dao;

import com.funcanteen.pojo.Sendmessage;
import com.funcanteen.pojo.SendmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SendmessageMapper {
    int countByExample(SendmessageExample example);

    int deleteByExample(SendmessageExample example);

    int insert(Sendmessage record);

    int insertSelective(Sendmessage record);

    List<Sendmessage> selectByExample(SendmessageExample example);

    int updateByExampleSelective(@Param("record") Sendmessage record, @Param("example") SendmessageExample example);

    int updateByExample(@Param("record") Sendmessage record, @Param("example") SendmessageExample example);
}