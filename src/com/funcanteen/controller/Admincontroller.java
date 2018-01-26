package com.funcanteen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funcanteen.pojo.Admin;
import com.funcanteen.pojo.Window;
import com.funcanteen.service.Adminservice;

@Controller
public class Admincontroller {
    @Autowired
	private Adminservice aservice;

   
    @RequestMapping(value="goadminlogin.action")
    public String goAdminLogin() {
    	return "sysjsp/adminlogin";
    }
    
    @RequestMapping(value="adminlogin.action")
    public String adminLogin(String adminname,String adminpwd,Model model,HttpSession httpsession,HttpServletRequest req) {
    	Admin admin = aservice.selAdminByaname(adminname);
    	if(admin==null){
    		model.addAttribute("error", "请输入正确账户名");
    		return  "login";
    	}
    	Integer aid = admin.getAdminid();
    	String adminpwd2 = admin.getAdminpwd();
    	if(!adminpwd.equals(adminpwd2)) {
    		model.addAttribute("error", "您的密码输入错误");
    		return "login";
    	}
    	req.getSession().setAttribute("aid", aid);
    	httpsession.setAttribute("USER_SESSION1", adminpwd2);
    	return "redirect:admain.action";
    }
    
    @RequestMapping(value="admain.action")
    public String adminMain(HttpServletRequest req,Model model) {
    	Object adminid = req.getSession().getAttribute("aid");
    	Integer aid=(Integer)adminid;
    	List<Window> windowlist = aservice.selwindowAll();
    	model.addAttribute("winlist", windowlist);
    	return "sysjsp/admian";
    }
    
    @RequestMapping(value="deletewin.action")
    public String delWindow(Integer wid) {
    	aservice.delWindowByWid(wid);
    	return "redirect:admain.action";
    }
    
    @RequestMapping(value="goinsertWin.action")
    public String goAddWindow() {
    	return "sysjsp/addwindow";
    }
    
    @RequestMapping(value="addWindow.action")
    public String addWindow(String winname,String winpwd) {
    	Window win=new Window();
    	win.setWindowname(winname);
    	win.setWinpwd(winpwd);
    	win.setCanid(1);
    	aservice.addWindow(win);
    	return "redirect:admain.action";
    }
    
    @RequestMapping(value="goupdatewin.action")
    public String goUpWin(Integer wid,Model model) {
    	Window window = aservice.selWinByWid(wid);
    	model.addAttribute("win", window);
    	return "sysjsp/updateWindow";
    }
    
    @RequestMapping(value="updatewin.action")
    public String upWin(String wname,String wpwd,Integer wid) {
    	Window win =new Window();
    	win.setWindowid(wid);
    	win.setWindowname(wname);
    	win.setWinpwd(wpwd);
    	win.setCanid(1);
    	aservice.updateWin(win);
    	return "redirect:admain.action";
    }
}
