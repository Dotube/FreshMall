package com.dwj.freshmall.controller;


import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.model.GoodsInfo;
import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.AddressInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Resource
    private AddressInfoService addressInfoService;

    @RequestMapping("selbyuser/{userid}")
    public List<AddressInfo> selbyuser(@PathVariable Integer userid){
        return addressInfoService.selbyuser(userid);
    };


}
