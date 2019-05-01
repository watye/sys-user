package com.talelife.user.web.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
/**
 * 用户
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-05-01 19:06:31
 */
public class SysUserUpdate implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 用户ID
	 */
	@NotNull(message = "用户ID不能为空")
			@ApiModelProperty(value = "用户ID")
	private Long userId;
	/**
	 * 用户名称
	 */
@Length(max = 50,message = "用户名称最大50个字符")
	@ApiModelProperty(value = "用户名称")
	private String userName;

	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：用户名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名称
	 */
	public String getUserName() {
		return userName;
	}
}
