package com.pengdf;

import java.util.UUID;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pengdf.demo.model.FooVO;
import com.pengdf.demo.service.IFooService;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext ("applicationContext.xml");
		IFooService users = (IFooService) cpx.getBean("fooService");
		FooVO user=new FooVO();
		user.setId(UUID.randomUUID().toString());
		users.addUser(user);
	}
}
