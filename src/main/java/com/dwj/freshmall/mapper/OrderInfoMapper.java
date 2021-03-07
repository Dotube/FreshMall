package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.OrderInfo;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(String id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}