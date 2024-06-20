package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.core.config.AppConfig;
import com.mkyong.core.service.OutputGeneratorHelper;
import com.mkyong.core.serviceImpl.HelloWorldImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//     	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//				"SpringBeans.xml");
//
//		OutputGeneratorHelper obj = (OutputGeneratorHelper) context.getBean("outputGenerator");
//		obj.generateOutput();
    	
    	ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
    	HelloWorldImpl impl = (HelloWorldImpl) context.getBean("helloWorld");
    	impl.printHelloWorld("The message is printed with the help of annotation config!!!!!!");
    }
}
