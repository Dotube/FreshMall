package com.dwj.freshmall.service;


import com.dwj.freshmall.model.OrderInfo;
import com.dwj.freshmall.vo.Myorder;
import com.dwj.freshmall.vo.ShoppingCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderInfoService {

    void add(OrderInfo orderInfo);

    List<Myorder> queryMyorder(Integer userid);

    void addOrder(OrderInfo orderInfo);
}
