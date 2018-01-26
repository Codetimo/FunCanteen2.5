package com.funcanteen.service;

import java.util.List;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Dish2;
import com.funcanteen.pojo.MyCollection;

public interface Dishservice {
	Dish2 seldishByid(Integer id);
    Dish selectDishByid(Integer did);
    //看个人购物车
    List<Dish> selDishByUid(Integer uid);
    
    List<Dish> selDishBy(String name,Double price);
    
    
	void addcoll(MyCollection coll);
           
}
