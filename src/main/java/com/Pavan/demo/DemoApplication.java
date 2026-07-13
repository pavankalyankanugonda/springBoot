package com.Pavan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Student student = new Student("Teja", 21);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
	}
}