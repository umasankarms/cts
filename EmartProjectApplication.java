package com.cts.entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.cts.entity")
public class EmartProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmartProjectApplication.class, args);
	}

}
