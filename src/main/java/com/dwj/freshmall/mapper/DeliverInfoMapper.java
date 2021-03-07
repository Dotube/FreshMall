package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.DeliverInfo;
import java.util.List;

public interface DeliverInfoMapper {
    int deleteByPrimaryKey(String wlid);

    int insert(DeliverInfo record);

    DeliverInfo selectByPrimaryKey(String wlid);

    List<DeliverInfo> selectAll();

    int updateByPrimaryKey(DeliverInfo record);
}