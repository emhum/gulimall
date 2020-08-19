package com.lalala.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lalala.common.utils.PageUtils;
import com.lalala.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 18:24:52
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

