package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.GoodsInfo;
import java.util.List;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsInfo record);

    GoodsInfo  selectByPrimaryKey(Integer id);

    List<GoodsInfo> selectAll();

    int updateByPrimaryKey(GoodsInfo record);

    List<GoodsInfo>  selectbykind(Integer category);

    List<GoodsInfo>  selectByName(String name);


}