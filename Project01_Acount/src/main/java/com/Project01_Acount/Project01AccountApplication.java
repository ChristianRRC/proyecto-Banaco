package com.Project01_Acount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Project01AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project01AccountApplication.class, args);
	}

}
