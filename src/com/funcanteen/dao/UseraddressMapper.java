package com.funcanteen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.funcanteen.pojo.Useraddress;

public interface UseraddressMapper {
     List<Useraddress> selAddByUserid(Integer uid);
     
     Useraddress selAddByAddid(Integer id);
     
     void upAddByAddid(@Param("address") String address,@Param("addid") Integer addid);
     
     void inAddByUserid(@Param("address") String address,@Param("userid") Integer userid);
     
     void delAddByAddid(Integer aid);
}
