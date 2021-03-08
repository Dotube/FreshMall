package com.dwj.freshmall.service;
import com.dwj.freshmall.model.UserInfo;
import org.springframework.stereotype.Service;



public interface UserInfoService {

    int login(UserInfo userInfo);

    int register(UserInfo userInfo);
}
