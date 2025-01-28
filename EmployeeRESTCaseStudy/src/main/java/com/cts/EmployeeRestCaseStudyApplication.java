package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class EmployeeRestCaseStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestCaseStudyApplication.class, args);
	}

}
