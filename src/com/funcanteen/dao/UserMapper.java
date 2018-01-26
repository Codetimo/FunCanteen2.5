package com.funcanteen.dao;

import com.funcanteen.pojo.User;
import com.funcanteen.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectUserAll();
    
    List<User> selectByExample(UserExample example);
    
    User SelectByPhone(String phone);
    
    //根据姓名查询
    List<User> SelectByusername(String username);

    User selectByPrimaryKey(Integer userid);
    
    void updatepwdByPhone(@Param("userpwd") String userpwd,@Param("phone")String phone);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}