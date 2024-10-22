package com.example.eurekabook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekabookApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekabookApplication.class, args);
	}

}
