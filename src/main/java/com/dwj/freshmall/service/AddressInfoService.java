package com.dwj.freshmall.service;

import com.dwj.freshmall.model.AddressInfo;

import java.util.List;

public interface AddressInfoService {

    List<AddressInfo> selbyuser(Integer userid);

    void del(Integer id);

    void update(AddressInfo addressInfo);

    void add(AddressInfo addressInfo);

    AddressInfo selbyid(Integer id);

}
