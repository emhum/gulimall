package com.lalala.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lalala.common.utils.PageUtils;
import com.lalala.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 17:53:28
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

