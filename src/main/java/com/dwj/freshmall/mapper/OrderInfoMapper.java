package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.OrderInfo;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}