package com.flsm.mapper;

import org.springframework.stereotype.Repository;

import com.flsm.pojo.Users;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IUsersMapper extends Mapper<Users>{
	
}
