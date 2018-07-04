package com.demo.springboot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.demo.springboot"})
@EnableAutoConfiguration	
public class SpringBootApplicationStarter {

	 
	public static void main(String[] args) {

		SpringApplication.run(SpringBootApplicationStarter.class, args);
		
	}

}
