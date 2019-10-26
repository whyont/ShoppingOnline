package com.flsm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flsm.mapper.IAddressMapper;
import com.flsm.pojo.Address;
import com.flsm.service.IAddressService;

@Service
public class AddressServiceImp implements IAddressService{
	
	@Autowired
	IAddressMapper addressmapper;

	@Override
	public boolean InsertAddress(Address address) {
		return addressmapper.insert(address)>0;
	}

	@Override
	public List<Address> SelectAddress(Integer id) {
		Address address=new Address();
		address.setUserid(id);
		return addressmapper.select(address);
	}

	@Override
	public boolean DeleteAddress(Integer id) {
		return addressmapper.deleteByPrimaryKey(id)>0;
	}


	@Override
	public boolean UpdateAddress(Address address) {
		return addressmapper.updateByPrimaryKey(address)>0;
	}

	@Override
	public Address SelectUpdateAddressById(Integer id) {
		return addressmapper.selectByPrimaryKey(id);
	}

}
