package com.mkyong.core.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("Get the method name !!!!!!!!!!!!!!!" + invocation.getMethod().getName());
		System.out.println("Get the method arguments !!!!!!!!!!!!!!!" + Arrays.toString(invocation.getArguments()));
		System.out.println("Method before proceed()  !!!!!!!!!!!!!!!");
		
		try {
			Object result = invocation.proceed();
			System.out.println("Method after proceed()  !!!!!!!!!!!!!!!");
		} catch (IllegalArgumentException e) {
			System.out.println("Method after throwing exception!!!!!!!!!!!!!!!");
			throw e;
		}
		return null;
	}

}
