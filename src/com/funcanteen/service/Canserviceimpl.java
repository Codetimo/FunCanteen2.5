package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.funcanteen.dao.DishMapper;
import com.funcanteen.dao.EvaluateMapper;
import com.funcanteen.dao.MycollectionMapper;
import com.funcanteen.dao.OrderMapper;
import com.funcanteen.dao.UserMapper;
import com.funcanteen.dao.UseraddressMapper;
import com.funcanteen.dao.WindowMapper;
import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Evaluate;
import com.funcanteen.pojo.Order;
import com.funcanteen.pojo.User;
import com.funcanteen.pojo.Useraddress;
import com.funcanteen.pojo.Window;

@Service
@Transactional(isolation=Isolation.REPEATABLE_READ,readOnly=true,propagation=Propagation.REQUIRED)
public class Canserviceimpl implements Canservice {
	@Autowired
	private UserMapper usermapper;
	@Autowired
	private DishMapper dishmapper;
	@Autowired
	private MycollectionMapper colmapper;
	@Autowired
	private EvaluateMapper evamapper;
	@Autowired
	private WindowMapper winmapper;
	@Autowired
	private UseraddressMapper uaddmapper;


	@Override
	public List<User> SelectUserAll() {
		return usermapper.selectUserAll();
	}

	@Override
	public List<Dish> SelectdishAll() {
		List<Dish> s = dishmapper.selectDishAll();
		return s;
	}

	@Override
	public List<Dish> getdishByPage(Integer line,Integer cloumn)
	{
		List<Dish> p=dishmapper.getdishByPage(line, cloumn);
		return p;
		
	}
	// 找手机号
	@Override
	public String SelPhoneByusername(String name) {
		List<User> selectByName = usermapper.SelectByusername(name);
		if (selectByName.size()>=1) {
			String phone = selectByName.get(0).getPhone();
			return phone;
		} else {
			return null;
		}
	}
	
	

	//根据id查用户
	public User selectUserById(Integer id){
		return usermapper.selectByPrimaryKey(id);
	}
	
	//根据用户id查收藏
	public List<String> selCollectionById(Integer id){
		return colmapper.SelCollectionById(id);
	}

	//根据用户id查评价
	public List<Evaluate> selEvaByUserid(Integer id) {
		return evamapper.selectByUserid(id);
	}

	//根据名字查用户
	public List<User> selUserByName(String name) {
		return usermapper.SelectByusername(name);
	}
	
	//根据主键查商户
	public Window selWindowById(Integer id) {
		return winmapper.selectByPrimaryKey(id);
	}
	
	//根据主键查地址
	public Useraddress selAddByAddid(Integer id) {
		return uaddmapper.selAddByAddid(id);
	}
	//查个人所有地址
	public List<Useraddress> selAddressByUserid(Integer id) {
		return uaddmapper.selAddByUserid(id);
	}
	//改地址
	@Transactional(isolation=Isolation.REPEATABLE_READ,readOnly=false,propagation=Propagation.REQUIRED)
	public void upAddByAddid(String address,Integer uid) {
		 uaddmapper.upAddByAddid(address, uid);
	}
	
	//添加地址
	@Transactional(isolation=Isolation.REPEATABLE_READ,readOnly=false,propagation=Propagation.REQUIRED)
	public void inAddByUserid(String address,Integer aid) {
		uaddmapper.inAddByUserid(address, aid);
	}

	//删除地址
	public void delAddByAddid(Integer aid) {
		uaddmapper.delAddByAddid(aid);
	}

	@Override
	public void addEvaluate(Evaluate eva) {
		evamapper.addEvaluate(eva);
	}

	@Override
	public void addUser(User user) {
		usermapper.insert(user);
	}

	@Override
	public List<Evaluate> selEvaByWinid(Integer wid) {
		return evamapper.selectByWinid(wid);
	}

	@Override
	public User selUserByPhone(String phone) {
		return usermapper.SelectByPhone(phone);
	}

	@Override
	public void updatepwdByPhone(String userpwd, String phone) {
		usermapper.updatepwdByPhone(userpwd, phone);
	}

	@Override
	public void delCollectionByDid(String did,Integer uid) {
		colmapper.delCollectionByDid(did,uid);
	}
	
}
