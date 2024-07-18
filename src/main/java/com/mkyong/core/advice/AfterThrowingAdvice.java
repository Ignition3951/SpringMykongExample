package com.mkyong.core.advice;

import org.springframework.aop.ThrowsAdvice;

public class AfterThrowingAdvice implements ThrowsAdvice {

	public void afterThrowingAdvice(IllegalArgumentException e) throws Throwable {
		System.out.println("Method is run after throwing exception!!!!!!!!!!!!!!!");
	}

}
