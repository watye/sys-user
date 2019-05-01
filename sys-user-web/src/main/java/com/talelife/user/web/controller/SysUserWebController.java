package com.talelife.user.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.talelife.framework.controller.BaseController;
import com.talelife.framework.entity.Page;
import com.talelife.framework.entity.PageQueryParameter;
import com.talelife.framework.entity.ResponseEntity;
import com.talelife.framework.util.BeanUtils;
import com.talelife.user.dao.entity.SysUser;
import com.talelife.user.web.dto.SysUserDto;
import com.talelife.user.web.service.SysUserWebService;
import com.talelife.user.web.vo.SysUserAdd;
import com.talelife.user.web.vo.SysUserQuery;
import com.talelife.user.web.vo.SysUserUpdate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 用户
 * @author lwy
 *
 */
@Api(value="controller")
@RestController
@RequestMapping("/web/sysUser")
public class SysUserWebController extends BaseController {
	@Resource
	private SysUserWebService sysUserWebService;

	@ApiOperation(value = "分页查询")
	@GetMapping(value = "/page")
	public ResponseEntity<Page<SysUserDto>> page(@Validated PageQueryParameter<SysUserQuery> pageQuery) {
		SysUser sysUser = BeanUtils.map(pageQuery.getQuery(), SysUser.class);
		PageInfo<SysUser> page = sysUserWebService.findListPage(sysUser,pageQuery.getPageNum(), pageQuery.getPageSize());
		List<SysUserDto> sysUserList = BeanUtils.mapAsList(page.getList(), SysUser.class, SysUserDto.class);
		return ResponseEntity.ok(new Page<SysUserDto>(page,sysUserList));
	}

	@ApiOperation(value = "查询单个")
	@GetMapping(value="/{id}")
	public ResponseEntity<SysUserDto> getSysUser(@PathVariable @ApiParam(value="用户id") Long id) {
		SysUser sysUser = sysUserWebService.getById(id);
		return ResponseEntity.ok(BeanUtils.map(sysUser, SysUserDto.class));
	}

	@ApiOperation(value = "新增")
	@PostMapping(value="/add")
	public ResponseEntity<Object> add(@Validated SysUserAdd sysUserAdd) {
		sysUserWebService.save(BeanUtils.map(sysUserAdd,SysUser.class));
		return ResponseEntity.ok();
	}

	@ApiOperation(value = "修改")
	@PutMapping(value="/{id}")
	public ResponseEntity<Object> update(@PathVariable Long id,SysUserUpdate sysUserUpdate) {
		sysUserWebService.updateById(BeanUtils.map(sysUserUpdate,SysUser.class));
		return ResponseEntity.ok();
	}
	
	@ApiOperation(value = "删除")
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Object> delete(@PathVariable @ApiParam(value="id") Long id) {
		sysUserWebService.deleteById(id);
		return ResponseEntity.ok();
	}

}
