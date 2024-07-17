package com.mkyong.core.model;

public class CustomerService {

	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("Printing the name :: " + name);
	}

	public void printUrl() {
		System.out.println("Printing the url :: " + url);
	}

	public void printMessage() {
		throw new IllegalArgumentException();
	}

}
