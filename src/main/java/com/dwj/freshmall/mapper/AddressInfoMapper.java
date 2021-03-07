package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.AddressInfo;
import java.util.List;

public interface AddressInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(AddressInfo record);

    AddressInfo selectByPrimaryKey(String id);

    List<AddressInfo> selectAll();

    int updateByPrimaryKey(AddressInfo record);
}