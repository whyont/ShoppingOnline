package com.flsm.service;

import java.util.List;

import com.flsm.pojo.Address;

public interface IAddressService {
	/**
	 * 添加地址
	 */
	boolean InsertAddress(Address address);
	
	/**
	 * 通过id查到当前登录用户的地址
	 */
	List<Address> SelectAddress(Integer id);
	
	/**
	 * 根据地址id删除
	 * @param id
	 * @return
	 */
	boolean DeleteAddress(Integer id);
	
	/**
	 * 查到要修改的地址对象
	 * @param id
	 * @return
	 */
	Address SelectUpdateAddressById(Integer id);
	
	/**
	 * 修改地址
	 * @param address
	 * @return
	 */
	boolean UpdateAddress(Address address);

}
