package com.dwj.freshmall.mapper;

import com.dwj.freshmall.model.UserInfo;
import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(UserInfo record);

    UserInfo selectByUserName(String name);

    List<UserInfo> selectAll();

    String selectavator(String name);

}