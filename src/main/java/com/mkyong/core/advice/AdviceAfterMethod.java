package com.mkyong.core.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AdviceAfterMethod implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Method is run after returning the target method!!!!!!!!!!!!!!!");
		
	}

}
