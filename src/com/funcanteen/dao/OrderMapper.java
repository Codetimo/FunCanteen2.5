package com.funcanteen.dao;

import com.funcanteen.pojo.Order;
import com.funcanteen.pojo.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);
    
    List<Order> selOrderAll();
    
    List<Order> selOrderByWindid(Integer wid );
    
    List<Order> selOrderByUid(Integer uid);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderid);
    
    Integer selDidByOid(Integer orderid);
    
    void upOrderByOid(@Param("deliverid")Integer deliverid,@Param("orderid")Integer orderid);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    void delByUid(Integer uid);
}