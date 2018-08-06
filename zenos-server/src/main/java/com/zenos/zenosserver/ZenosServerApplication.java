package com.zenos.zenosserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ZenosServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenosServerApplication.class, args);
	}
}
