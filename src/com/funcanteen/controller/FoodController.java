package com.funcanteen.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Evaluate;
import com.funcanteen.pojo.MyCollection;
import com.funcanteen.pojo.Order;
import com.funcanteen.pojo.User;
import com.funcanteen.pojo.Window;
import com.funcanteen.service.Canservice;
import com.funcanteen.service.Dishservice;
import com.funcanteen.service.Orderservice;

@Controller
public class FoodController {
	@Autowired
	private Dishservice dservice;
	@Autowired
	private Canservice cservice;
	@Autowired
	private Orderservice oservice;

	// 制作初级订单
	@RequestMapping(value = "dishdetail.action")
	public String makeOrder(Integer dishid, Model model, Integer uid) {
		Order order = new Order();
		Dish dish = dservice.selectDishByid(dishid);
		String dishname = dish.getDishname();
		Integer winid = dish.getWinid();
		User user = cservice.selectUserById(uid);
		String address = user.getAddress();
		order.setAddresses(address);
		order.setDishesid(dishid);
		order.setDishname(dishname);
		order.setWindid(winid);
		order.setUserid(uid);
		oservice.insert(order);
		return "redirect:/dishlist.action?uid=" + uid;
	}

	// 显示购物车
	@RequestMapping(value = "usercar.action")
	public String usercar(Integer uid, Model model) {
		List<Dish> cars = dservice.selDishByUid(uid);
		Integer mprice = new Integer(0);
		for (int i = 0; i < cars.size(); i++) {
			mprice = (int) (mprice + cars.get(i).getPrice());
		}
		model.addAttribute("mprice", mprice);
		model.addAttribute("cars", cars);
		model.addAttribute("uid", uid);
		return "destine";
	}

	// 清空购物车
	@RequestMapping(value = "delAllCar.action")
	public String delAll(HttpServletRequest request) {
		Object userid = request.getSession().getAttribute("uid");
		Integer uid = (Integer) userid;
		oservice.delOrderByUid(uid);
		return "redirect:/usercar.action?uid=" + uid;
	}

	// 转入银行接口
	@RequestMapping(value = "pay.action")
	public String pay(Model model, Integer price) {
		Integer pri = price * 100;
		model.addAttribute("price", pri);
		return "index";
	}

	// 显示商户评价
	@RequestMapping(value = "disheva.action")
	public String dishEvaBydishid(Integer dishid, Model model) {
		Dish dish = dservice.selectDishByid(dishid);
		List<Evaluate> evalist = cservice.selEvaByWinid(dish.getWinid());
		String wname[] = new String[evalist.size()];
		for (int i = 0; i < evalist.size(); i++) {
			Window window = cservice.selWindowById(evalist.get(i).getWindowesid());
			wname[i] = window.getWindowname();
		}
		model.addAttribute("wnames", wname);
		model.addAttribute("evalist", evalist);
		return "alleva";
	}

	// 添加收藏
	@RequestMapping(value = "addcollection.action")
	public String addCollection(HttpServletRequest request, Integer did) {
		String dishid = did.toString();
		MyCollection coll = new MyCollection();
		Object userid = request.getSession().getAttribute("uid");
		Integer uid = (Integer) userid;
		coll.setContent(dishid);
		coll.setUserid(uid);

		dservice.addcoll(coll);
		return "redirect:/dishlist.action?uid=" + uid;
	}

	// 删除收藏
	@RequestMapping(value = "delcollection.action")
	public String delCollection(HttpServletRequest request, Integer cid) {
		Object userid = request.getSession().getAttribute("uid");
		Integer uid = (Integer) userid;
		String did=cid.toString();
		cservice.delCollectionByDid(did,uid);
		return "redirect:/userCollection.action?id=" + uid;
	}

}
