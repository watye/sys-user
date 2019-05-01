package com.talelife.user.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talelife.framework.mapper.CrudMapper;
import com.talelife.framework.service.CrudServiceImpl;
import com.talelife.user.dao.SysUserMapper;
import com.talelife.user.dao.entity.SysUser;
import com.talelife.user.web.service.SysUserWebService;

@Service
public class SysUserWebServiceImpl extends CrudServiceImpl<SysUser> implements SysUserWebService {
	@Autowired
	private SysUserMapper mapper;

	@Override
	public CrudMapper<SysUser> getDao() {
		return this.mapper;
	}
}
