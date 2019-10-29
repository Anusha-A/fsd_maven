package com.example.spring_hibernate.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_hibernate.service.BiryaniService;

public class MyContextFactory {
	public static BiryaniService getMyContextFactory()
	{
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		BiryaniService service=context.getBean("biryaniService",BiryaniService.class);
		return service;
	}

}
