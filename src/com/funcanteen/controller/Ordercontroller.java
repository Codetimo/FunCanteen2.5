package com.funcanteen.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.funcanteen.pojo.Order;
import com.funcanteen.service.Orderservice;

@Controller
public class Ordercontroller {
  @Autowired
  private Orderservice oservice;

  
  //显示未配送订单
  @RequestMapping(value="gotoOrder.action")
  public String gotoOrder(Model model ,HttpServletRequest request) {
	  Object wid = request.getSession().getAttribute("windid");
	  Integer winid=(Integer)wid;
	  List<Order> orderlist = oservice.selOrderByWindid(winid);
	  List<Order> orders=new ArrayList<Order>();
	  for(int i=0;i<orderlist.size();i++) {
		  Integer deliverid = orderlist.get(i).getDeliverid();
		  if(deliverid==null) {
			  orders.add(orderlist.get(i));
		  }
	  }
	  model.addAttribute("orders", orders);
	  return "orderlist";
  }
  
  @RequestMapping(value="orderback.action")
  public String orderBack(HttpServletRequest request) {
	  Object wid = request.getSession().getAttribute("windid");
	  Integer windid=(Integer)wid;
	  return "redirect:/gotowinmain.action?wid="+windid;
  }
  
  @RequestMapping(value="runorder.action")
  public String runOrder(Model model,Integer oid) {
	  Integer did = oservice.selDidByOid(oid);
	  Integer windid = oservice.selOrderByOid(oid).getWindid();
	  oservice.upOrderByOid(did, oid);
	  return "redirect:/gotoOrder.action?id="+windid;
  }
}
