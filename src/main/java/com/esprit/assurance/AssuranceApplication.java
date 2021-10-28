package com.esprit.assurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AssuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssuranceApplication.class, args);
	}

}
