package com.lalala.gulimall.product.dao;

import com.lalala.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 11:31:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
