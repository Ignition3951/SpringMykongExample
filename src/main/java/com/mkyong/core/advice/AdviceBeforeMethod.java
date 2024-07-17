package com.mkyong.core.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class AdviceBeforeMethod implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Method is run before the target method!!!!!!!!!!!!!!!");

	}

}
