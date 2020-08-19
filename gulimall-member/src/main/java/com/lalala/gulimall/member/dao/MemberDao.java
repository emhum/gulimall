package com.lalala.gulimall.member.dao;

import com.lalala.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 17:53:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}