package com.dwj.freshmall.service;

import com.dwj.freshmall.model.AddressInfo;

import java.util.List;

public interface AddressInfoService {

    List<AddressInfo> selbyuser(Integer userid);

}
