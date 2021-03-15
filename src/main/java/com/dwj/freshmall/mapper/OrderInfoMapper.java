package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.OrderInfo;
import com.dwj.freshmall.vo.Myorder;
import com.dwj.freshmall.vo.ShoppingCart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);

    @Insert("insert into `order`(orderid, goodid,status, `date`, price, num, userid) values(orderid,goodid,status,date,price,num,userid)")
    void addOrder(OrderInfo orderInfo);


    List<Myorder> queryMyorder(Integer userid);
}