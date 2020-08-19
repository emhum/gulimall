package com.lalala.gulimall.product;

import com.lalala.gulimall.product.entity.BrandEntity;
import com.lalala.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
        brandEntity.setBrandId(1L);
        brandEntity.setDescript("华为666");
//        brandService.save(brandEntity);
        brandService.updateById(brandEntity);
        System.out.println("保存成功");
    }

}
