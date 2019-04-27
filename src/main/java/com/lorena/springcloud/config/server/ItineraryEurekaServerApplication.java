package com.lorena.springcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableAutoConfiguration
@EnableConfigServer
@SpringBootApplication
public class ItineraryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItineraryEurekaServerApplication.class, args);
	}

}
