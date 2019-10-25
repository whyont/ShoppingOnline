package com.flsm.mapper;

import org.springframework.stereotype.Repository;

import com.flsm.pojo.users;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper extends Mapper<users>{
	
	users login(String zhanghao,String pwd);

}
