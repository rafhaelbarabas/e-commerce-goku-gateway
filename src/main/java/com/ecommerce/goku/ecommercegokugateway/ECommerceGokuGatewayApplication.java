package com.ecommerce.goku.ecommercegokugateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ECommerceGokuGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceGokuGatewayApplication.class, args);
	}

}
