package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Order;

public interface Orderservice {

	//看未配送的订单
	List<Order> selOrderAll();
	
	//根据商户看order
	List<Order> selOrderByWindid(Integer wid);
	
	List<Order> selOrderByUid(Integer uid);
	
	Order selOrderByOid(Integer oid);
	
	void delOrderByOid(Integer oid);
	
	void upOrderByOid(Integer did,Integer oid);
	
	Integer selDidByOid(Integer oid);
	
	Integer insert(Order order);
	
	void delOrderByUid(Integer uid);
}
