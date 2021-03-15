package com.dwj.freshmall.controller;


import com.dwj.freshmall.model.GoodsInfo;
import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.GoodsInfoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class goodsController {

    @Resource
    private GoodsInfoService goodsInfoService;

    @RequestMapping("selAll")
    public List<GoodsInfo> selAll(){
        // System.out.println(userInfo);
        return goodsInfoService.selAll();
    };

    @RequestMapping("selbyid/{id}")
    public GoodsInfo selbyid(@PathVariable Integer id){
        return goodsInfoService.selbyid(id);
    };


    @RequestMapping("selbykind/{category}")
    public List<GoodsInfo> selbykind(@PathVariable Integer category){
        return goodsInfoService.selbykind(category);
    };

    @RequestMapping("selbyname/{name}")
    public List<GoodsInfo> selbyname(@PathVariable String name){
        return goodsInfoService.selbyname(name);
    };
}
