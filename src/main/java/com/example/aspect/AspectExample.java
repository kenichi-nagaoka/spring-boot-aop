package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectExample {

	@Before("execution(* com.example.service.*.doSomething(..))")
	public void before() {
		System.out.println("before !!");
	}

	@Before("within(com.example.service.ExampleService)")
	public void beforeWithin() {
		System.out.println("before within!!");
	}

	@Before("target(com.example.service.ParentExampleService)")
	public void beforeTarget() {
		System.out.println("before target!!");
	}

	@Before("within(com.example.service.ExampleService) && args(java.lang.String)")
	public void beforeArgs() {
		System.out.println("before args!!");
	}

	@AfterReturning("within(com.example.service.ExampleService) && args(java.lang.String)")
	public void afterReturning() {
		System.out.println("afterReturning !!");
	}

	@AfterThrowing("within(com.example.service.ExampleService) && args(java.lang.String)")
	public void afterThrowing() {
		System.out.println("afterThrowing !!");
	}

	@After("within(com.example.service.ExampleService) && args(java.lang.String)")
	public void after() {
		System.out.println("after !!");
	}

	@Before("within(com.example.service.ExampleService) && @annotation(org.springframework.context.annotation.Bean)")
	private void annotation() {
		System.out.println("@annotation  !!");
	}

	@Around("within(com.example.service.ExampleService) && args(java.lang.String)")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around - before !!");
		pjp.proceed();
		System.out.println("around - after !!");
	}
}
