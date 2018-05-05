package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.websystique.springboot.configuration.JpaConfiguration;

/*
 * 
 * The annotation @SpringBootApplication is the combination of
 * @EnableAutoConfiguration [automatically configure your Spring application based on the jar dependencies is added in Pom],
 * @Configuration e
 * @ComponentScan
 * 
 */

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})
public class SpringBootCRUDApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApp.class, args);

	}

}
