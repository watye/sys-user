package com.talelife.user.feign.web;

import org.springframework.cloud.openfeign.FeignClient;

import com.talelife.user.feign.web.fallback.SysUserWebFallback;

@FeignClient(name = "sys-user-web", fallback = SysUserWebFallback.class)
public interface SysUserWebService {
}