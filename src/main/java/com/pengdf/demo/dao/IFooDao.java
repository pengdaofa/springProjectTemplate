package com.pengdf.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.pengdf.demo.model.FooVO;

public interface IFooDao {
	void addUser(@Param("foo") FooVO foo);
}