package com.pengdf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pengdf.web.demo.service.user.IUserService;
import com.pengdf.web.demo.user.user.UserVO;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext ("applicationContext.xml");
		IUserService users = (IUserService) cpx.getBean("userService");
		UserVO user=new UserVO();
		users.addUser(user);
	}
}
