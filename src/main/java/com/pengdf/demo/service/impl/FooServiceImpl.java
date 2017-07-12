package com.pengdf.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengdf.demo.dao.IFooDao;
import com.pengdf.demo.model.FooVO;
import com.pengdf.demo.service.IFooService;


@Service("fooService")
public class FooServiceImpl implements IFooService {
    @Autowired
    private IFooDao userDao;

    @Override
    public void addUser(FooVO user){
        userDao.addUser(user);
    }
}