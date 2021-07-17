package com.ajiangmall.gateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AjiangGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjiangGatewayApplication.class, args);
	}

}
