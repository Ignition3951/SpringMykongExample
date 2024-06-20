package com.mkyong.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.core.service.OutputGeneratorHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		OutputGeneratorHelper obj = (OutputGeneratorHelper) context.getBean("outputGenerator");
		obj.generateOutput();
    }
}
