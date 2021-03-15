package com.dwj.freshmall.service.impl;

import com.dwj.freshmall.mapper.CartInfoMapper;
import com.dwj.freshmall.mapper.GoodsInfoMapper;
import com.dwj.freshmall.model.CartInfo;
import com.dwj.freshmall.service.CartInfoService;
import com.dwj.freshmall.vo.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartInfoServiceImpl implements CartInfoService {

    @Autowired
    private CartInfoMapper cartInfoMapper;

    @Override
    public void add(CartInfo cartInfo) {
        cartInfoMapper.insert(cartInfo);
    }

    @Override
    public List<ShoppingCart> queryMyShoppingCart(Integer userid) {
        return cartInfoMapper.queryMyShoppingCart(userid);
    }
}
