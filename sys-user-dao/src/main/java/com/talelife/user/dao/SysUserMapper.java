package com.talelife.user.dao;

import com.talelife.framework.mapper.CrudMapper;
import org.apache.ibatis.annotations.Mapper;
import com.talelife.user.dao.entity.SysUser;

/**
 * 用户
 * 
 * @author lwy
 * @email watye.qq.com
 * @date 2019-05-01 19:06:31
 */
@Mapper
public interface SysUserMapper extends CrudMapper<SysUser> {
	
}
