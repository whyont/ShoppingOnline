package com.flsm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.flsm.pojo.Product;

import tk.mybatis.mapper.common.Mapper;

@Repository
public interface IProductMapper extends Mapper<Product> {
	
	List<Product> selectproductLike(@Param("likestring")String likestring, @Param("type")String type,@Param("brand")String brand,@Param("order")String order);	
	Integer selectproductLikeCount(@Param("likestring")String likestring, @Param("type")String type,@Param("brand")String brand,@Param("order")String order);	
	List<String> likeBrand(@Param("likestring") String likestring);
	List<String> likeType(@Param("likestring") String likestring);
	
	
	List<Product> selectproductBycount(int num);

}
