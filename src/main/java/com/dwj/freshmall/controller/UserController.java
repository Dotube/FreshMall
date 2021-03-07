package com.dwj.freshmall.controller;


import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.UserInfoService;
import com.dwj.freshmall.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    }

}
