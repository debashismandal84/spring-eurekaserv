package com.example.microserv.springeurekaserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaservApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaservApplication.class, args);
	}

}
