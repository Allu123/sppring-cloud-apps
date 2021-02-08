package com.jpr.hardwares.jprservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class JprserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JprserviceApplication.class, args);
	}

}
