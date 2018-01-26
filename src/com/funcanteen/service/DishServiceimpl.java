package com.funcanteen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funcanteen.dao.DishMapper;
import com.funcanteen.dao.MycollectionMapper;
import com.funcanteen.dao.SelectDishMapper;
import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.Dish2;
import com.funcanteen.pojo.DishExample;
import com.funcanteen.pojo.MyCollection;

@Service
public class DishServiceimpl implements Dishservice{
	@Autowired
	private SelectDishMapper dishmapper;
	@Autowired
	private DishMapper dmapper;
	@Autowired
	private MycollectionMapper cmapper;
	
    private	DishExample dexample=new DishExample(); 
	
	@Override
	public Dish2 seldishByid(Integer id)
	{
		return dishmapper.seldishByid(id);
	}
	
	public Dish selectDishByid(Integer did) {
		return dmapper.selectByPrimaryKey(did);
	}
	
	//看购物车
	public List<Dish> selDishByUid(Integer uid){
		return dmapper.selDishByUid(uid);
	}
    
	//选择查询
	public List<Dish> selDishBy(String name,Double price){
		dexample.createCriteria().andDishnameEqualTo(name).andPriceEqualTo(price);
		return dmapper.selectByExample(dexample);
	}

    //添加收藏
	@Override
	public void addcoll(MyCollection coll) {
		cmapper.InsertCollectionById(coll);
	}
}
	
	
	
	
