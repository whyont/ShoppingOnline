package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 商品详情表
 */
public class pramater {
	@Id
	@KeySql(sql="select seq_pramater_id.nextval from dual",order=ORDER.BEFORE)
	private Integer id;
	private String country;
	private String imgurl;
	private Integer did;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	

}
