package com.example.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Employee employee=context.getBean("employee", Employee.class);
		System.out.println(employee);
		System.out.println(employee.getProject());
		context.registerShutdownHook();
		// customDestroyMethod will not be called if you don't close
		context.close();

	}

}
