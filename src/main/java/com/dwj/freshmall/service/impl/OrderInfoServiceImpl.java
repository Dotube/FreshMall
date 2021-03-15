package com.dwj.freshmall.service.impl;

import com.dwj.freshmall.mapper.GoodsInfoMapper;
import com.dwj.freshmall.mapper.OrderInfoMapper;
import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.model.OrderInfo;
import com.dwj.freshmall.service.OrderInfoService;
import com.dwj.freshmall.vo.Myorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderInfoServiceImpl  implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public void add(OrderInfo orderInfo) {
        orderInfoMapper.insert(orderInfo);
    }

    @Override
    public List<Myorder> queryMyorder(Integer userid) {
        return orderInfoMapper.queryMyorder(userid);
    }

    @Override
    public void addOrder(OrderInfo orderInfo) {
        Date date=new Date();
        orderInfo.setDate(date);
        orderInfoMapper.addOrder(orderInfo);
    }


}
