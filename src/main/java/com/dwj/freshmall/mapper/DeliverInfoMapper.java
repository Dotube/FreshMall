package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.DeliverInfo;
import java.util.List;

public interface DeliverInfoMapper {
    int deleteByPrimaryKey(Integer wlid);

    int insert(DeliverInfo record);

    DeliverInfo selectByPrimaryKey(Integer wlid);

    List<DeliverInfo> selectAll();

    int updateByPrimaryKey(DeliverInfo record);
}