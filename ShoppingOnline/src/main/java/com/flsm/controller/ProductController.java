package com.flsm.controller;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flsm.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	IProductService productService;
	
	@RequestMapping("productSelectLike")
	public String productSelectLike(Integer row,String likestring,String type,String brand,String order,Map<String,Object> map) {
		productService.selectProductLike(row, likestring, type, brand, order, map);
		Set<Entry<String,Object>> set = map.entrySet();
		
		for (Entry<String, Object> entry : set) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
		return "home/search";
	}
}	
