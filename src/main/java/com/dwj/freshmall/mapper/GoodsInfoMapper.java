package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.GoodsInfo;
import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(String id);

    List<GoodsInfo> selectAll();

    int updateByPrimaryKey(GoodsInfo record);
}