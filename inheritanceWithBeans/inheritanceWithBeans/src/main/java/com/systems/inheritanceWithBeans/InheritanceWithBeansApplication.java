package com.systems.inheritanceWithBeans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InheritanceWithBeansApplication {

	public static void main(String[] args) {
		
		//Multi-Level Inheritance proofs-->All concepts are possible  
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Only, Parent-Child relationShip-->Employee(child) and person(parent)
        Employee emp=(Employee) appContext.getBean("employeeBean");
        System.out.println("Employee name:"+emp.getName());
        System.out.println("Employee number:"+emp.getEmployeeNumber());
        
      //Parent having 2nd Child-->selfEmployee(child) and person(parent)
        SelfEmployee selfEmployee=(SelfEmployee) appContext.getBean("selfEmployeeBean");
        System.out.println("Employee Name="+selfEmployee.getName());
        System.out.println("Employee Number="+selfEmployee.getOrganizationName());
        
        //Here Person is parent of two classes 1.Employee, 2.SelfEmployee
        // but we are creating parent of Person : Gender
        
        Person person=(Person)appContext.getBean("personBean");
        System.out.println("Gender:"+person.getGender());
        System.out.println("Person Name:"+person.getName());
        
        //Checking Hybrid Inheritance in Spring A->B,	 A->C, 	A,C-> D {toCheck: Employee,selfEmployee-->
        
        //Answer :Not possible , but it might be possible through interfaces
        
        
        
	}
}
