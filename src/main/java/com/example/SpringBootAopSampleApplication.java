package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.ExampleService;

@SpringBootApplication
public class SpringBootAopSampleApplication implements CommandLineRunner {

	@Autowired
	ExampleService exampleService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopSampleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		exampleService.doSomething();
		exampleService.doExecute();
		exampleService.setSomething("something");
		exampleService.getSomething();
		exampleService.throwException();
	}
}
