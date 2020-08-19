package com.lalala.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lalala.common.utils.PageUtils;
import com.lalala.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 17:53:28
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

