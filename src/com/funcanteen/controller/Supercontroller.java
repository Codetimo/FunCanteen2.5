package com.funcanteen.controller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Superadmin;
import com.funcanteen.service.Superservice;

@Controller
public class Supercontroller {
	@Autowired
   private Superservice sservice;
   
	//去超级管理员登录界面
	@RequestMapping(value="gosuperlogin.action")
	public String goSuperlogin() {
		return "sysjsp/superlogin";
	}
	
	//超管登录
	@RequestMapping(value="superlogin.action")
	public String superLogin(String supername,String superpwd,Model model,HttpSession httpSession) {
		Superadmin superadmin = sservice.selSuperByname(supername);
		if(superadmin==null) {
			model.addAttribute("error", "名称输入错误");
			return "login";
		}
		String sname = superadmin.getSupadminname();
		String supadminpwd = superadmin.getSupadminpwd();
		if(!superpwd.equals(supadminpwd)) {
			return "login";
		}
		httpSession.setAttribute("USER_SESSION1", sname);
		return "redirect:/supermain.action";
	}
	
	
	
	@RequestMapping(value="supermain.action")
	public String selAdminAll(Model model) {
		List<Admin> adminlist = sservice.selectAdminAll();
		model.addAttribute("adminlist", adminlist);
		return "sysjsp/superadmin";
	}
	@RequestMapping(value="deleteAdmin.action")
	public String deleteAdmin(Integer adminId)
	{
		sservice.deleteAdmin(adminId);
	  return "redirect:/supermain.action";
		
	}
	@RequestMapping(value="goupdateadmin.action")
	public String goUpadmin(Integer adminId,Model model) {
		Admin admin = sservice.selAdminByAid(adminId);
		model.addAttribute("admin", admin);
		return "sysjsp/updateAdmin";
	}
	//修改管理员
	@RequestMapping(value="updateadmin.action")
	public String updateByPrimaryKey(String aname,String apwd,Integer adminid)
	{   Admin record1=new Admin();
		record1.setAdminname(aname);
		record1.setAdminpwd(apwd);
		record1.setAdminid(adminid);
		sservice.updateByPrimaryKey(record1);
		return "redirect:/supermain.action";
	}
	
	//去添加管理员页面
	@RequestMapping(value="goinsertAdmin.action")
	public String goaddAdmin() {
		return "sysjsp/addAdmin";
	}
	
	//添加管理员
	@RequestMapping(value="addAdmin.action")
	public String addAdmin(String adminname,String adminpwd) {
		Admin admin=new Admin();
		admin.setAdminname(adminname);
		admin.setAdminpwd(adminpwd);
		sservice.addAdmin(admin);
		return "redirect:/supermain.action";
	}
}
