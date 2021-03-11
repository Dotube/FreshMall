package com.dwj.freshmall.controller;


import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.UserInfoService;
import com.dwj.freshmall.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("login")
    public ResultVO login(@RequestBody UserInfo userInfo){
            int status = userInfoService.login(userInfo);
            ResultVO  resultVO= new ResultVO(200,status+"");
            return resultVO;
    };

    @RequestMapping("register")
    public ResultVO register(@RequestBody UserInfo userInfo){
        int status = userInfoService.register(userInfo);
        ResultVO  resultVO= new ResultVO(200,status+"");
        return resultVO;
    };

    @RequestMapping("selAll")
    public List<UserInfo> selAll(){
        return userInfoService.selAll();
    };

    @RequestMapping("selAva")
    public String selAva(String name){
        return userInfoService.selAva(name);
    };


    @RequestMapping("selbyname/{name}")
    public UserInfo selbyname(@PathVariable String name){
        return userInfoService.selbyname(name);
    };
  }
