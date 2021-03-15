package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.CartInfo;
import com.dwj.freshmall.vo.ShoppingCart;

import java.util.List;


public interface CartInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CartInfo record);

    CartInfo selectByPrimaryKey(Integer id);

    List<CartInfo> selectAll();

    int updateByPrimaryKey(CartInfo record);

    List<ShoppingCart> queryMyShoppingCart(Integer userid);

}