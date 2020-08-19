package com.lalala.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lalala.common.utils.PageUtils;
import com.lalala.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 18:10:31
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

