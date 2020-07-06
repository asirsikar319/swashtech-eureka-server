package com.swashtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SwashtechEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwashtechEurekaServerApplication.class, args);
	}

}
