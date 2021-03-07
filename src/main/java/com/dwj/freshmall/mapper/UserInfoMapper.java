package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.UserInfo;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(String id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByUserName(String name);
}