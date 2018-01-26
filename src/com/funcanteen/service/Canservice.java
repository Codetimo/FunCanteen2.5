package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Evaluate;
import com.funcanteen.pojo.Order;
import com.funcanteen.pojo.User;
import com.funcanteen.pojo.Useraddress;
import com.funcanteen.pojo.Window;

public interface Canservice {
    
	List<User> SelectUserAll();
	
	List<Dish> SelectdishAll();
	
	void addUser(User user);
	
	User selUserByPhone(String phone);
	
	List<User> selUserByName(String name);
	
	String SelPhoneByusername(String name);
	
	User selectUserById(Integer id);
	
	List<String> selCollectionById(Integer id);
	
	List<Evaluate> selEvaByUserid(Integer id);
	
	List<Evaluate> selEvaByWinid(Integer wid);
	
	//根据主键查窗口名
	Window selWindowById(Integer id);
	
	Useraddress selAddByAddid(Integer id);
	
	List<Useraddress> selAddressByUserid(Integer id);
	
	void delCollectionByDid(String did,Integer uid);
	
	void updatepwdByPhone(String userpwd,String phone);
	
	void upAddByAddid(String address,Integer id);
	
	void inAddByUserid(String address,Integer id);
	
	void delAddByAddid(Integer id);
	
	void addEvaluate(Evaluate eva);

	List<Dish> getdishByPage(Integer line, Integer cloumn);

}
