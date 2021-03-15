package com.dwj.freshmall.controller;

import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.model.CartInfo;
import com.dwj.freshmall.service.AddressInfoService;
import com.dwj.freshmall.service.CartInfoService;
import com.dwj.freshmall.vo.ResultVO;
import com.dwj.freshmall.vo.ShoppingCart;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private CartInfoService cartInfoService;


    @RequestMapping("add")
    public ResultVO add(@RequestBody CartInfo cartInfo){
        cartInfoService.add(cartInfo);
        ResultVO resultVO = new ResultVO(200,"success!");
        return resultVO;
    }


    @PostMapping("/queryMyCart/{userid}")
    public List<ShoppingCart> queryMyCart(@PathVariable("userid") Integer userid){
        return cartInfoService.queryMyShoppingCart(userid);
    }
}
