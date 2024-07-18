package com.mkyong.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.core.config.AppConfig;
import com.mkyong.core.model.CustomerBO;
import com.mkyong.core.model.CustomerService;
import com.mkyong.core.model.SchedulerBO;
import com.mkyong.core.serviceImpl.HelloWorldImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext contextXml = new ClassPathXmlApplicationContext("SpringBeans.xml");
//
//		OutputGeneratorHelper obj = (OutputGeneratorHelper) context.getBean("outputGenerator");
//		obj.generateOutput();

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorldImpl impl = (HelloWorldImpl) context.getBean("helloWorld");
		impl.printHelloWorld("The message is printed with the help of annotation config!!!!!!");

		CustomerBO customerBO = (CustomerBO) context.getBean("customerConfig");
		customerBO.printMsg();

		SchedulerBO schedulerBO = (SchedulerBO) context.getBean("schedulerConfig");
		schedulerBO.printMsg();

		CustomerService customerService = (CustomerService) contextXml.getBean("customerServiceBeanProxy");
		customerService.printName();
		
		customerService.printUrl();
		
		try {
			customerService.printMessage();
		} catch (Exception e) {
		}
		
		contextXml.close();
		context.close();
	}
}
