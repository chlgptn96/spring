package com.example.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX1.xml");
		AdminConnection AdminConnection = ctx.getBean("adminConnection", AdminConnection.class);

		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext(ApplicationConfig.class); AdminConnection
		 * connection = ctx.getBean("adminConfig", AdminConnection.class);
		 */
		// AdminConnection sub_adminConnection =
		// ctx.getBean("adminConnection",AdminConnection.class);
		System.out.println("admin ID : " + AdminConnection.getAdminId());
		System.out.println("admin PW : " + AdminConnection.getAdminPw());
		System.out.println("sub_admin ID : " + AdminConnection.getSub_adminId());
		System.out.println("suub_admin PW : " + AdminConnection.getSub_adminPw());
		ctx.close();
	}

}