package com.zenos.zenosapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class ZenosApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZenosApiGatewayApplication.class, args);
	}
}
