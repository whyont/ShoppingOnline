package com.flsm.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.flsm.mapper.OneMapper;
import com.flsm.pojo.one;
import com.flsm.service.IOneService;
@Service
@Repository 

public class OneServiceImp implements IOneService{
@Autowired
OneMapper onemapper;
	@Override
	public List<one> findall() {
		// TODO Auto-generated method stub
		return onemapper.findall();
	}
	

}
