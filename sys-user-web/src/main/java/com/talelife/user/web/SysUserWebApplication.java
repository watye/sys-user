package com.talelife.user.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.talelife.user.dao")
@EnableSwagger2
@EnableEurekaClient
public class SysUserWebApplication {

	public static void main(String[] args) throws Exception {
       SpringApplication.run(SysUserWebApplication.class, args);
  }


}