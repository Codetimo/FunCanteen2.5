   package com.funcanteen.controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Promotion;
import com.funcanteen.pojo.Window;
import com.funcanteen.service.Windowservice;

@Controller
public class Windowcontroller {

	@Autowired
	private Windowservice aservice;
	
	
	@RequestMapping(value="gowinlogin.action")
	public String gowinlogin(){
		return "windowjsp/windowlogin";
	}
	
	@RequestMapping(value="winlogin.action")
	public String winlogin(String winname,String winpwd,Model model,HttpSession httpSession) {
		Integer windid = aservice.selWindidByWname(winname);
		if(windid==null) {
			model.addAttribute("error", "请先注册或请输入正确商户名！");
			return "login";
		}
		Window window = aservice.selWinBywinid(windid);
		String pwd = window.getWinpwd();
		if(!pwd.equals(winpwd)) {
			model.addAttribute("error", "您的密码不正确！");
			return "login";
		}
		httpSession.setAttribute("USER_SESSION1", winname);
		return "redirect:/gotowinmain.action?wid=" + windid;
	}
	
	//展示优惠活动
	@RequestMapping(value = "gotopro.action")
	public String proList(Model model) {
		List<Promotion> prolist = aservice.selProAll();
		model.addAttribute("activity", prolist);
		return "promotion";
	}

	@RequestMapping(value = "gotowinmain.action")
	public String gotowinmain(Model model, Integer wid,String page, HttpServletRequest request) {
		List<Dish> dishlist = aservice.selDishByWid(wid);
		request.getSession().setAttribute("windid", wid);
		model.addAttribute("dishbywidlist", dishlist);
		return "windowjsp/windowmain";
	}

	//添加优惠活动
	@RequestMapping(value = "addpro.action")
	public String addPro(HttpServletRequest request,String proname, String content, String time, String windowname) throws Exception {
		Object wid = request.getSession().getAttribute("windid");
		Integer windid=(Integer)wid;
		Promotion pro = new Promotion();
		pro.setProname(proname);
		pro.setContent(content);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date ptime = df.parse(time);
		pro.setTime(ptime);
		Integer id = aservice.selWindidByWname(windowname);
		if(id==null) {
			return "redirect:/dishlist.action"; 
		}
		pro.setWindoid(id);
		aservice.addProByWindname(pro);
		return "redirect:/gotowinmain.action?wid="+windid;
	}

	@RequestMapping(value = "gotoaddDish.action")
	public String goaddDish() {
		return "windowjsp/addDish";
	}

	@RequestMapping(value = "addDish.action")
	public String addDish(HttpServletRequest request, String dishname, String price, MultipartFile photo)
			throws Exception {
		Dish dish = new Dish();
		Object winid = request.getSession().getAttribute("windid");
		Integer wid = (Integer) winid;
		//上传图片到服务器
		String newName = String.valueOf(System.currentTimeMillis()) + ".jpg";
		String path = request.getServletContext().getRealPath("img");
		File targetFile = new File(path + "\\" + newName);
		photo.transferTo(targetFile);

		dish.setDishname(dishname);
		Double pri = Double.parseDouble(price);
		dish.setPrice(pri);
		dish.setPhoto(newName);
		dish.setWinid(wid);

		aservice.addDish(dish);
		return "redirect:/gotowinmain.action?wid=" + wid;
	}

	// 展示需要修改的菜品
	@RequestMapping(value = "goupDish.action")
	public String goupdish(Integer did, Model model) {
		Dish selDishBydid = aservice.selDishBydid(did);
		model.addAttribute("dish", selDishBydid);
		return "windowjsp/updatedish";
	}

	@RequestMapping(value = "updateDish.action")
	public String updateDish(HttpServletRequest request,String did, String dishname, String price, MultipartFile photo)
			throws Exception {
		Dish dish = new Dish();
		Object winid = request.getSession().getAttribute("windid");
		Integer wid = (Integer) winid;
		Integer dishid=Integer.parseInt(did);
		
		String newName = String.valueOf(System.currentTimeMillis()) + ".jpg";
		String path = request.getServletContext().getRealPath("img");
		File targetFile = new File(path + "\\" + newName);
		photo.transferTo(targetFile);
        
		dish.setDishid(dishid);
		dish.setDishname(dishname);
		Double pri = Double.parseDouble(price);
		dish.setPrice(pri);
		dish.setPhoto(newName);
		dish.setWinid(wid);
		aservice.changeDish(dish);
		return "redirect:/gotowinmain.action?wid=" + wid;
	}

	@RequestMapping(value = "delDish.action")
	public String delDish(Model model, Integer did) {
		Integer winid = aservice.selDishBydid(did).getWinid();
		aservice.delDishByDishid(did);
		return "redirect:/gotowinmain.action?wid=" + winid;
	}
}
