package com.funcanteen.dao;

import com.funcanteen.pojo.Superadmin;
import com.funcanteen.pojo.SuperadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuperadminMapper {
    int countByExample(SuperadminExample example);

    int deleteByExample(SuperadminExample example);

    int deleteByPrimaryKey(Integer supadminid);

    int insert(Superadmin record);

    int insertSelective(Superadmin record);
    
    Superadmin selSuperByname(String sname);

    List<Superadmin> selectByExample(SuperadminExample example);

    Superadmin selectByPrimaryKey(Integer supadminid);

    int updateByExampleSelective(@Param("record") Superadmin record, @Param("example") SuperadminExample example);

    int updateByExample(@Param("record") Superadmin record, @Param("example") SuperadminExample example);

    int updateByPrimaryKeySelective(Superadmin record);

    int updateByPrimaryKey(Superadmin record);
}