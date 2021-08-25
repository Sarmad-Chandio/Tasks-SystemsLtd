package com.systems.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@After("execution(public void makePayment())")
	public void printAfter() {
		System.out.println("after payment");
	}
	
}
