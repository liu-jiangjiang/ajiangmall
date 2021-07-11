package com.ajiang.ajiangmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ajiang.ajiangmall.product.dao")
@SpringBootApplication
public class AjiangProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(AjiangProductApplication.class, args);
	}

}
