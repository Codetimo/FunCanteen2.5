package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Promotion;
import com.funcanteen.pojo.Window;

public interface Windowservice {
	//显示所有活动
    List<Promotion>  selProAll();
    //商家添加活动
    void addProByWindname(Promotion pro);
    
    Integer selWindidByWname(String name);
    
    Window  selWinBywinid(Integer wid);
    //对菜增删改查
    Dish selDishBydid(Integer did);
    
    List<Dish> selDishByWid(Integer wid);
    
    void addDish(Dish dish);
    
    void delDishByDishid(Integer Dishid);
    
    void changeDish(Dish dish);
    
    
	List<Dish> getdishByPage1(Integer wid, Integer line, Integer cloumn);
    
}
