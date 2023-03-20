package com.springcore.collectios;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myspring.springcore.Student;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Jayanta");
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\springcore\\collectios\\collectionConfig.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());

	}

}
