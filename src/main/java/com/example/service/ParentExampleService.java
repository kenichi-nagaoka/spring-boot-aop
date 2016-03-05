package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ParentExampleService {

	public void doExecute() {
		System.out.println("parent method");
	}
	
	public String getSomething() {
		return "something";
	}
}
