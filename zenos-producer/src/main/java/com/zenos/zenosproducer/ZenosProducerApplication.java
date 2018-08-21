package com.zenos.zenosproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZenosProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenosProducerApplication.class, args);
	}
}
