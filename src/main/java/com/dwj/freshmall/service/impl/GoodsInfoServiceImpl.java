package com.dwj.freshmall.service.impl;

import com.dwj.freshmall.mapper.GoodsInfoMapper;
import com.dwj.freshmall.mapper.UserInfoMapper;
import com.dwj.freshmall.model.GoodsInfo;
import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoServiceImpl  implements GoodsInfoService {

    @Autowired
    private GoodsInfoMapper goodsInfoMapper;


    @Override
    public List<GoodsInfo> selAll() {
        System.out.println();
        return goodsInfoMapper.selectAll();
    }

    @Override
    public GoodsInfo selbyid(Integer id) {
        return goodsInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GoodsInfo> selbykind(Integer category) {
        return goodsInfoMapper.selectbykind(category);
    }

    @Override
    public List<GoodsInfo> selbyname(String name) {
        return goodsInfoMapper.selectByName(name);
    }


}
