package com.funcanteen.controller;


import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Evaluate;
import com.funcanteen.pojo.Order;
import com.funcanteen.pojo.Superadmin;
import com.funcanteen.pojo.User;
import com.funcanteen.pojo.Useraddress;
import com.funcanteen.pojo.Window;
import com.funcanteen.service.Canservice;
import com.funcanteen.service.Dishservice;
import com.funcanteen.service.Orderservice;
import com.funcanteen.service.Superservice;
import com.funcanteen.service.Windowservice;

@Controller
public class Cancontroller {
	@Autowired
	private Windowservice aservice;
	@Autowired
	private Canservice canservice;
	@Autowired
	private Orderservice oservice;
	@Autowired
	private Dishservice dservice;
	@Autowired
	private Superservice sservice;
	
	
	//用户注销
	@RequestMapping(value="goback.action")
	public String goback() {
		
		return "login";
	}
	
	//用户注册
	@RequestMapping(value="forlogin.action")
	public String goregister() {
		return "register";
	}
	
	@RequestMapping(value="loginregister.action")
	public String register(Model model,String username,String  phone,String password,String repassword,String sex,String address) {
		User user=new User();
		user.setUsername(username);
		user.setPhone(phone);
		user.setSex(sex);
		user.setAddress(address);
		user.setUserpwd(repassword);
		canservice.addUser(user);
		return "login";
	}

	// 用户列表
	@RequestMapping(value = "userlist.action")
	public String selectUserAll(Model model, Integer id) {
		User user = canservice.selectUserById(id);
		model.addAttribute("userlist", user);
		return "userlist";
	}

	// 餐品列表
		@RequestMapping(value = "dishlist.action")
		public String getdishByPage(Model model,String page) {
			
			Integer cloumn = 5;
			  List<Dish> dishes = new ArrayList<Dish>();  
			  dishes=this.canservice.SelectdishAll();
			  model.addAttribute("dishNum", dishes.size());//查询到的总菜数量
			  Integer pageTimes;
			  if(dishes.size()%cloumn == 0)
				       {
				             pageTimes = dishes.size()/cloumn;
				        }else
				        {
				            pageTimes = dishes.size()/cloumn + 1;
				        }
				           model.addAttribute("pageTimes", pageTimes);
				        
				          //页面初始的时候page没有值
				         if(null == page)
				         {
				               page = "1";
				          }
				         Integer line = (Integer.parseInt(page)-1) * cloumn;
				         dishes = this.canservice.getdishByPage(line, cloumn);
				         model.addAttribute("currentPage", Integer.parseInt(page));
				         model.addAttribute("dishlist", dishes);
			
			return "dishlist";
		}
	//选择查询
	@RequestMapping(value="onlyselect.action")
	public String onlySelect(HttpServletRequest request,Model model,String name,String price) {
		Object userid = request.getSession().getAttribute("uid");
		Integer uid=(Integer)userid;
		if(price.length()<1) {
			model.addAttribute("error", "咋的？想吃不要钱的菜哈？！回去把菜钱给报上了！");
			return "dishlist";
		}
		Double prices=Double.valueOf(price);
		List<Dish> dishlist = dservice.selDishBy(name, prices);
		model.addAttribute("dishlist", dishlist);
		model.addAttribute("uid", uid);
		return "dishlist";
	}
	// 去登陆的页面
	@RequestMapping(value = "/login.action", method = RequestMethod.GET)
	public String Beforelogin() {
		return "login";
	}
	
	@RequestMapping(value = "/login.action", method = RequestMethod.POST)
	public String login(String username, String userpwd, HttpSession httpSession, Model model,HttpServletRequest request,Integer identity) {
		switch (identity) {
		case 0:
			User user = canservice.selUserByPhone(username);
			if (user == null) {
				model.addAttribute("error", "请注册或请输入正确用户名！");
				return "login";
			}
			String pwd = user.getUserpwd();
			Integer uid = user.getUserid();
			if (!pwd.equals(userpwd)) {
				model.addAttribute("error", "请输入正确密码！");
				return "login";
			}
			request.getSession().setAttribute("uid", uid);
			httpSession.setAttribute("USER_SESSION1", username);
			return "redirect:/dishlist.action?uid="+uid;

		case 1:
			Integer windid = aservice.selWindidByWname(username);
			if(windid==null) {
				model.addAttribute("error", "请先注册或请输入正确商户名！");
				return "login";
			}
			Window window = aservice.selWinBywinid(windid);
			String pwd1 = window.getWinpwd();
			if(!pwd1.equals(userpwd)) {
				model.addAttribute("error", "您的密码不正确！");
				return "login";
			}
			httpSession.setAttribute("USER_SESSION1", pwd1);
			return "redirect:/gotowinmain.action?wid=" + windid;

		case 2:
			return "redirect:/adminlogin.action?adminname="+username+"&adminpwd="+userpwd;

		case 3:
			Superadmin superadmin = sservice.selSuperByname(username);
			if(superadmin==null) {
				model.addAttribute("error", "名称输入错误");
				return "login";
			}
			String sname = superadmin.getSupadminname();
			String supadminpwd = superadmin.getSupadminpwd();
			if(!userpwd.equals(supadminpwd)) {
				return "login";
			}
			httpSession.setAttribute("USER_SESSION1", sname);
			return "redirect:/supermain.action";
		}
		return "";

	}

	// 我的收藏
	@RequestMapping(value = "userCollection.action")
	public String userCollection(Integer id, Model model) {
		List<String> collection = canservice.selCollectionById(id);
		List<Integer> dishid= new ArrayList<>();
		List<Dish> mydish=new ArrayList<>();
		for (String coll : collection) {
			dishid.add(Integer.parseInt(coll));
		}
		for (Integer did : dishid) {
			mydish.add(dservice.selectDishByid(did));
		}
		
		model.addAttribute("collection", mydish);
		return "mycollection";
	}

	// 写评价
	@RequestMapping(value = "gotoevaluate.action")
	public String gotoEvaluate(Integer uid, Model model, Integer oid) {
		model.addAttribute("uid", uid);
		model.addAttribute("oid", oid);
		return "addeva";
	}

	//添加评价
	@RequestMapping(value = "addeva.action")
	public String addeva(HttpServletRequest request,String evaluatecontent, MultipartFile evaluatepic, Integer evastar, Integer uid,
			Integer ordeid) throws Exception {
		Evaluate eva=new Evaluate();
       
		//String odlName = evaluatepic.getName();
		String newName = String.valueOf(System.currentTimeMillis()) + ".jpg";
		String path = request.getServletContext().getRealPath("img");
		File targetFile = new File(path + "\\" + newName);
		evaluatepic.transferTo(targetFile);
       
		Order order = oservice.selOrderByOid(ordeid);
        Integer windid = order.getWindid();
		eva.setEvaluatecontent(evaluatecontent);
		eva.setEvaluatepic(newName);
		eva.setEvaluatestar(evastar);
		eva.setEvaluatetime(new Date());
		eva.setOrdeid(ordeid);
		eva.setUid(uid);
		eva.setWindowesid(windid);
		canservice.addEvaluate(eva);
        return "redirect:/dishlist.action?uid="+uid;
	}

	// 我的评价
	@RequestMapping(value = "userEvaluate.action")
	public String userEvaluate(Integer id, Model model) {
		List<Evaluate> eva = canservice.selEvaByUserid(id);
		String wname[] = new String[eva.size()];
		for (int i = 0; i < eva.size(); i++) {
			Window window = canservice.selWindowById(eva.get(i).getWindowesid());
			wname[i] = window.getWindowname();
		}
		model.addAttribute("wnames", wname);
		model.addAttribute("evaluate", eva);
		return "myevaluate";
	}

	// 我的记录地址
	@RequestMapping(value = "userAddress.action")
	public String userAddress(Integer id, Model model) {
		List<Useraddress> address = canservice.selAddressByUserid(id);
		model.addAttribute("useraddress", address);
		return "myaddress";
	}

	// 改地址
	@RequestMapping(value = "upAddress.action")
	public String upAddByAddid(String address, Integer addid, Integer userid) {
		canservice.upAddByAddid(address, addid);
		return "redirect:/userAddress.action?id=" + userid;
	}

	// 添加地址
	@RequestMapping(value = "insertAddress.action")
	public String inAddByUserid(String address, String uid) {
		Integer userid=Integer.parseInt(uid);
		canservice.inAddByUserid(address, userid);
		return "redirect:/userAddress.action?id=" + userid;
	}

	@RequestMapping(value = "goAddress.action")
	public String goAdd(Model model,HttpServletRequest req) {
		Object id = req.getSession().getAttribute("uid");
		Integer userid=(Integer)id;
		model.addAttribute("uid", userid);
		return "addAddress";
	}

	@RequestMapping(value = "gotoAddress.action")
	public String gotoAdd(Model model, Integer addid) {
		Useraddress add = canservice.selAddByAddid(addid);
		model.addAttribute("address", add);
		return "editaddress";
	}

	@RequestMapping(value = "delAddress.action")
	public String delAddByAddid(Model model, Integer addid) {
		Useraddress address = canservice.selAddByAddid(addid);
		int userid = address.getUserid();
		canservice.delAddByAddid(addid);
		return "redirect:/userAddress.action?id=" + userid;
	}

	// 根据姓名查id
	public Integer selUseridByname(String name) {
		List<User> user = canservice.selUserByName(name);
		if (user.size() > 0) {
			Integer id = user.get(0).getUserid();
			return id;
		} else {
			return null;
		}
	}
}
