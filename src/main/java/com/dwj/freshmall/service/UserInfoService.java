package com.dwj.freshmall.service;
import com.dwj.freshmall.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserInfoService {


    int login(UserInfo userInfo);

    int register(UserInfo userInfo);

    List<UserInfo> selAll();

    String selAva(String name);
    
}

