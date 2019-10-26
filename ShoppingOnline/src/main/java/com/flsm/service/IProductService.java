package com.flsm.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.flsm.pojo.Product;

public interface IProductService {
	void  selectProductLike(Integer row,String likestring, String type,String brand,String order,Map<String, Object> map);
}
