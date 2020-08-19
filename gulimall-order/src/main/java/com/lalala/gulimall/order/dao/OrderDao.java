package com.lalala.gulimall.order.dao;

import com.lalala.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 18:10:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
