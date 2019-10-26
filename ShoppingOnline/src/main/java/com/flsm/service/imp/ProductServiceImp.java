package com.flsm.service.imp;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flsm.mapper.IProductMapper;
import com.flsm.pojo.Product;
import com.flsm.service.IProductService;
import com.github.pagehelper.PageHelper;

@Service
public class ProductServiceImp implements IProductService {
	
	@Autowired
	IProductMapper  pmapper;
	


	@Override
	public void selectProductLike(Integer row,String likestring, String type, String brand, String order, Map<String, Object> map) {
		// TODO Auto-generated method stub
		row=row!=null?row:1;
		likestring=likestring!=null&&!"".equals(likestring)?likestring:"手机";
		type="".equals(type)?null:type;
		brand="".equals(brand)?null:brand;
		
		
		int count = pmapper.selectproductLikeCount("%"+likestring+"%", type, brand, order);
		int page =count%12==0?count/12:count/12+1;
		
		row=row>page?page:row;
	
		
		
		PageHelper.startPage(row, 12);
		
		List<Product> list = pmapper.selectproductLike("%"+likestring+"%", type, brand, order);
		
		
		
		
		List<String> likeBrand = pmapper.likeBrand("%"+likestring+"%");
		
		List<String> likeType = pmapper.likeType("%"+likestring+"%");
		
		
		map.put("likestring", likestring);
		map.put("list", list);
		map.put("row", row);
		map.put("type", type);
		map.put("brand", brand);
		map.put("count", count);
		map.put("page", page);
		map.put("likeBrand", likeBrand);
		map.put("likeType", likeType);
		map.put("order", order);
		
	}

}
