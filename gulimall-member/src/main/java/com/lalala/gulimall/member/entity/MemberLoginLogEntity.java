package com.lalala.gulimall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员登录记录
 * 
 * @author lalala
 * @email error.intype@gmail.com
 * @date 2020-08-19 17:53:28
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Long id;
	/**
	 * $column.comments
	 */
	private Long memberId;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private String ip;
	/**
	 * $column.comments
	 */
	private String city;
	/**
	 * $column.comments
	 */
	private Integer loginType;

}
