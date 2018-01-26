package com.funcanteen.dao;

import com.funcanteen.pojo.Window;
import com.funcanteen.pojo.WindowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WindowMapper {
    int countByExample(WindowExample example);

    int deleteByExample(WindowExample example);

    int deleteByPrimaryKey(Integer windowid);

    int insert(Window record);

    int insertSelective(Window record);
    
    int selWindidByWname(String name);
    
    List<Window> selWindAll();

    List<Window> selectByExample(WindowExample example);

    Window selectByPrimaryKey(Integer windowid);

    int updateByExampleSelective(@Param("record") Window record, @Param("example") WindowExample example);

    int updateByExample(@Param("record") Window record, @Param("example") WindowExample example);

    int updateByPrimaryKeySelective(Window record);

    int updateByPrimaryKey(Window record);
}