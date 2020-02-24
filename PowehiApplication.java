package com.cts.Powehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages="com.cts.Powehi.*")
//@EnableJpaRepositories(entityManagerFactoryRef="entityManagerFactory", basePackages="com.cts.*")
public class PowehiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowehiApplication.class, args);
	}

}
