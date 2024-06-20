package com.mkyong.core.serviceImpl;

import com.mkyong.core.service.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void printHelloWorld(String message) {
		System.out.println("The message for App Config is :" + message);

	}

}
