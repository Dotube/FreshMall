package com.dwj.freshmall.service;
import com.dwj.freshmall.model.GoodsInfo;
import com.dwj.freshmall.model.UserInfo;

import java.util.List;


public interface GoodsInfoService {


    List<GoodsInfo> selAll();


    GoodsInfo selbyid(Integer id);

    List<GoodsInfo> selbykind(Integer category);

}

