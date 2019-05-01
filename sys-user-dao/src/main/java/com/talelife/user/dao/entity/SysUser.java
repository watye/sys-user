package com.talelife.user.dao.entity;

import com.talelife.framework.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-05-01 19:06:31
 */
public class SysUser extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
		private Long userId;
	/**
	 * 用户名称
	 */
	private String userName;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}
}
