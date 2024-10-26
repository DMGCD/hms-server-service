package com.hms.hms_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HmsServerApplication {

	public static void main(String[] args) {
		System.out.println("Eureka Server in Online @@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("shfhfjsjsujer");
		SpringApplication.run(HmsServerApplication.class, args);
	}

}
