package com.funcanteen.dao;

import com.funcanteen.pojo.Dish;
import com.funcanteen.pojo.DishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishMapper {
    int countByExample(DishExample example);

    int deleteByExample(DishExample example);

    int deleteByPrimaryKey(Integer dishid);

    int insert(Dish record);

    int insertSelective(Dish record);
    
    List<Dish> selectDishAll();
    
    List<Dish> selDishByUid(Integer uid);

    List<Dish> selDishByWid(Integer winid);
    
    List<Dish> selectByExample(DishExample example);

    List<Dish> getdishByPage(Integer line,Integer cloumn);
    List<Dish> getdishByPage1(Integer winid,Integer line,Integer cloumn);
    Dish selectByPrimaryKey(Integer dishid);

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);

    int updateByPrimaryKeySelective(Dish record);

    int updateByPrimaryKey(Dish record);
    
    void changeDish(Dish dish);
}