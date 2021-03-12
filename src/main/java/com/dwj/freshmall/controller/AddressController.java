package com.dwj.freshmall.controller;


import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.model.GoodsInfo;
import com.dwj.freshmall.model.UserInfo;
import com.dwj.freshmall.service.AddressInfoService;
import com.dwj.freshmall.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("del/{id}")
    public ResultVO del(@PathVariable Integer id){
        addressInfoService.del(id);
        ResultVO resultVO = new ResultVO(200,"success!");
        return resultVO;
    }

    @RequestMapping("update")
    public  ResultVO update(@RequestBody AddressInfo addressInfo){
        addressInfoService.update(addressInfo);
        ResultVO resultVO = new ResultVO(200,"success!");
        return resultVO;
    }

    @RequestMapping("add")
    public  ResultVO add(@RequestBody AddressInfo addressInfo){
        addressInfoService.add(addressInfo);
        ResultVO resultVO = new ResultVO(200,"success!");
        return resultVO;
    }

    @RequestMapping("selbyid/{id}")
    public AddressInfo selbyid(@PathVariable Integer id){
        return addressInfoService.selbyid(id);
    };
}
