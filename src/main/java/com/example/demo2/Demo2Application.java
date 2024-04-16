package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo2Application.class, args);

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Emp emp1=(Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getPhones());
	}

}
