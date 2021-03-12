package com.dwj.freshmall.service.impl;

import com.dwj.freshmall.mapper.AddressInfoMapper;
import com.dwj.freshmall.model.AddressInfo;
import com.dwj.freshmall.service.AddressInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressInfoServiceImpl implements AddressInfoService {

    @Autowired
    private AddressInfoMapper addressInfoMapper;


    @Override
    public List<AddressInfo> selbyuser(Integer userid) {
        return addressInfoMapper.selectByuserid(userid);
    }

    @Override
    public void del(Integer id) {
        addressInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(AddressInfo addressInfo) {
        addressInfoMapper.updateByPrimaryKey(addressInfo);
    }

    @Override
    public void add(AddressInfo addressInfo) {
        addressInfoMapper.insert(addressInfo);
    }

    @Override
    public AddressInfo selbyid(Integer id) {
        return addressInfoMapper.selectByPrimaryKey(id);
    }


}
