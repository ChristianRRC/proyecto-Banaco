package com.Project01_Client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Project01ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project01ClientApplication.class, args);
	}

}
