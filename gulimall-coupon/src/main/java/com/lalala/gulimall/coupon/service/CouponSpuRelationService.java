package com.lalala.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lalala.common.utils.PageUtils;
import com.lalala.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 17:18:16
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

