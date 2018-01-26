package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funcanteen.dao.AdminMapper;
import com.funcanteen.dao.SuperadminMapper;
import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Superadmin;

@Service
public class Superserviceimpl implements Superservice {
    @Autowired
	private AdminMapper admapper;
    @Autowired
    private SuperadminMapper smapper;
	
	@Override
	public List<Admin> selectAdminAll() {
	 return 	admapper.selAdminAll();
	}
	@Override
	public void deleteAdmin(int adminId)
	{
		
		 admapper.deleteByPrimaryKey(adminId);
	}
	
	@Override
	public Integer insert(Admin record)
	{
		
		int insert = admapper.insert(record);
		return insert;
	}
	@Override
	public Integer updateByPrimaryKey(Admin record)
	{
		int update=admapper.updateByPrimaryKey(record);		
		return update;
	}
	@Override
	public Admin selAdminByAid(Integer aid) {
		return admapper.selectByPrimaryKey(aid);
	}
	@Override
	public void addAdmin(Admin admin) {
		admapper.insert(admin);
	}
	@Override
	public Superadmin selSuperByname(String name) {
		return smapper.selSuperByname(name);
	}
}
