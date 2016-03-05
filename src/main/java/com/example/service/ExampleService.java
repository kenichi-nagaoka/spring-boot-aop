package com.example.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.exception.ExampleException;

@Service
public class ExampleService extends ParentExampleService {

	private String something;

	public void doSomething() {
		System.out.println("doSomething");
	}

	public void setSomething(String something) {
		this.something = something;
		System.out.println("setSomething");
	}

	@Bean
	public String getSomething() {
		return this.something;
	}

	public void throwException() throws ExampleException {
		System.out.println("Throw Exception");
		throw new ExampleException();
	}
}
