package com.funcanteen.dao;

import com.funcanteen.pojo.Recivemessage;
import com.funcanteen.pojo.RecivemessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecivemessageMapper {
    int countByExample(RecivemessageExample example);

    int deleteByExample(RecivemessageExample example);

    int insert(Recivemessage record);

    int insertSelective(Recivemessage record);

    List<Recivemessage> selectByExample(RecivemessageExample example);

    int updateByExampleSelective(@Param("record") Recivemessage record, @Param("example") RecivemessageExample example);

    int updateByExample(@Param("record") Recivemessage record, @Param("example") RecivemessageExample example);
}