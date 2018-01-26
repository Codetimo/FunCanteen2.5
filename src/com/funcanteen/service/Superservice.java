package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Superadmin;

public interface Superservice {
   List<Admin> selectAdminAll();
   void deleteAdmin(int adminId);
   Integer insert(Admin record);
   Integer updateByPrimaryKey(Admin record);
   
   Admin selAdminByAid(Integer aid);
   
   void addAdmin(Admin admin);
   
   Superadmin selSuperByname(String name);
   
}
