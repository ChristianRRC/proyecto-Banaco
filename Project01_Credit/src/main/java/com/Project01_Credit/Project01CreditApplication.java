package com.Project01_Credit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Project01CreditApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project01CreditApplication.class, args);
	}

}
