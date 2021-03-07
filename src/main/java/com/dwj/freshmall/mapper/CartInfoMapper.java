package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.CartInfo;
import java.util.List;

public interface CartInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CartInfo record);

    CartInfo selectByPrimaryKey(String id);

    List<CartInfo> selectAll();

    int updateByPrimaryKey(CartInfo record);
}