package com.dwj.freshmall.service;

import com.dwj.freshmall.model.CartInfo;
import com.dwj.freshmall.vo.ShoppingCart;

import java.util.List;

public interface CartInfoService {

    void add(CartInfo cartInfo);

    List<ShoppingCart> queryMyShoppingCart(Integer userid);
}
