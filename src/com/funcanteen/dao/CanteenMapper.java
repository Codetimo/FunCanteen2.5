package com.funcanteen.dao;

import com.funcanteen.pojo.Canteen;
import com.funcanteen.pojo.CanteenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CanteenMapper {
    int countByExample(CanteenExample example);

    int deleteByExample(CanteenExample example);

    int deleteByPrimaryKey(Integer canteenid);

    int insert(Canteen record);

    int insertSelective(Canteen record);

    List<Canteen> selectByExample(CanteenExample example);

    Canteen selectByPrimaryKey(Integer canteenid);

    int updateByExampleSelective(@Param("record") Canteen record, @Param("example") CanteenExample example);

    int updateByExample(@Param("record") Canteen record, @Param("example") CanteenExample example);

    int updateByPrimaryKeySelective(Canteen record);

    int updateByPrimaryKey(Canteen record);
}