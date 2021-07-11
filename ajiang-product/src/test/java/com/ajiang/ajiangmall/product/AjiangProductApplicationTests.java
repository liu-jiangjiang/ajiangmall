package com.ajiang.ajiangmall.product;

import com.ajiang.ajiangmall.product.entity.BrandEntity;
import com.ajiang.ajiangmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AjiangProductApplicationTests {
	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setDescript("hahahh");
		brandEntity.setFirstLetter("1");
		brandEntity.setName("好的");
		brandService.save(brandEntity);
		System.out.println("出入成功");
	}

}
