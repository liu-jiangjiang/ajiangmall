package com.ajiang.ajiangmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@MapperScan("com.ajiang.ajiangmall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class AjiangProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjiangProductApplication.class, args);
	}

}
