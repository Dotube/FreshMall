package com.dwj.freshmall.service.impl;

import com.dwj.freshmall.mapper.UserInfoMapper;
import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl  implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int login(UserInfo userInfo) {
        int flag=0;
        UserInfo u = userInfoMapper.selectByUserName(userInfo.getName());
        if(u!=null){
            if(u.getPassword().equals(userInfo.getPassword())) flag=1;
        }
        else {
            flag=2;
        }
        return flag;
    }

    @Override
    public int register(UserInfo userInfo) {
        int flag=0;
        UserInfo u = userInfoMapper.selectByUserName(userInfo.getName());
        if(u ==null){
            userInfoMapper.insert(userInfo);
        }
        else {
            flag=2;
        }
        return flag;
    }

    @Override
    public List<UserInfo> selAll() {
            System.out.println();
            return userInfoMapper.selectAll();
        }

    @Override
    public String selAva(String name) {
        return userInfoMapper.selectavator(name);
    }

    @Override
    public UserInfo selbyname(String name) {
        return userInfoMapper.selectByUserName(name);
    }


}
