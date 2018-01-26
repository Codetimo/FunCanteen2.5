package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funcanteen.dao.OrderMapper;
import com.funcanteen.pojo.Order;

@Service
public class Orderserviceimpl implements Orderservice{

	@Autowired
	public OrderMapper  ordermapper; 
	//看订单
	public List<Order> selOrderAll() {
		return ordermapper.selOrderAll();
	}

	@Override
	public void delOrderByOid(Integer oid) {
		ordermapper.deleteByPrimaryKey(oid);
	}

	@Override
	public List<Order> selOrderByWindid(Integer wid) {
		return ordermapper.selOrderByWindid(wid);
	}

	@Override
	public void upOrderByOid(Integer did, Integer oid) {
		ordermapper.upOrderByOid(did, oid);
	}

	@Override
	public Order selOrderByOid(Integer oid) {
		return ordermapper.selectByPrimaryKey(oid);
	}

	@Override
	public Integer selDidByOid(Integer oid) {
		return ordermapper.selDidByOid(oid);
	}

	@Override
	public Integer insert(Order order) {
		int insert = ordermapper.insert(order);
		return insert;
	}

	@Override
	public List<Order> selOrderByUid(Integer uid) {
		return ordermapper.selOrderByUid(uid);
	}

	@Override
	public void delOrderByUid(Integer uid) {
		ordermapper.delByUid(uid);
	}

}
