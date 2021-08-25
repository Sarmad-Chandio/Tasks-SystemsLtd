package com.systems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.systems.payment.PaymentService;


@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootApp 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootApp.class, args);//rest call
		        
	}
}
