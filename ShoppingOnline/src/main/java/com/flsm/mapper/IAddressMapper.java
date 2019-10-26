package com.flsm.mapper;

import org.springframework.stereotype.Repository;

import com.flsm.pojo.Address;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IAddressMapper extends Mapper<Address>{

}
