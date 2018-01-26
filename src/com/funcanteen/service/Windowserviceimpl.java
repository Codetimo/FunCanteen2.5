package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funcanteen.dao.DishMapper;
import com.funcanteen.dao.PromotionMapper;
import com.funcanteen.dao.WindowMapper;
import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Promotion;
import com.funcanteen.pojo.Window;

@Service
public class Windowserviceimpl implements Windowservice {
    @Autowired
	private PromotionMapper pmapper;
    @Autowired
    private WindowMapper wmapper;
    @Autowired
    private DishMapper dmapper;
	
	@Override
	public List<Promotion> selProAll() {
		return pmapper.selProAll();
	}

	@Override
	public void addProByWindname(Promotion pro) {
		pmapper.addProByWindname(pro);
	}

	@Override
	public Integer selWindidByWname(String name) {
		return wmapper.selWindidByWname(name);
	}

	@Override
	public List<Dish> selDishByWid(Integer wid) {
		return dmapper.selDishByWid(wid);
	}

	@Override
	public void addDish(Dish dish) {
		dmapper.insert(dish);
	}

	@Override
	public void delDishByDishid(Integer Dishid) {
		dmapper.deleteByPrimaryKey(Dishid);
	}

	@Override
	public void changeDish(Dish dish) {
		dmapper.changeDish(dish);
	}

	@Override
	public Dish selDishBydid(Integer did) {
		return dmapper.selectByPrimaryKey(did);
	}

	@Override
	public Window selWinBywinid(Integer wid) {
		return wmapper.selectByPrimaryKey(wid);
	}
	
	@Override
	public List<Dish> getdishByPage1(Integer winid,Integer line,Integer cloumn)
	{
		return dmapper.getdishByPage1(winid, line, cloumn);
		
	}

}
