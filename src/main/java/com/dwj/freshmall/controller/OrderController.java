package com.dwj.freshmall.controller;

import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.model.OrderInfo;
import com.dwj.freshmall.service.AddressInfoService;
import com.dwj.freshmall.service.OrderInfoService;
import com.dwj.freshmall.vo.Myorder;
import com.dwj.freshmall.vo.ResultVO;
import com.dwj.freshmall.vo.ShoppingCart;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderInfoService orderInfoService;

    @RequestMapping("add")
    public ResultVO add(@RequestBody OrderInfo orderInfo){
        orderInfoService.add(orderInfo);
        ResultVO resultVO = new ResultVO(200,"success!");
        return resultVO;
    }

    @PostMapping("/queryMyorder/{userid}")
    public List<Myorder> queryMyorder(@PathVariable("userid") Integer userid){
        return orderInfoService.queryMyorder(userid);
    }

}
