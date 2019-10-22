package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 产品表
 */
public class product {
	@Id
	@KeySql(sql="select seq_product_pid.nextval from dual",order=ORDER.BEFORE)
	private Integer pid;
	private String pname;
	private Integer price;
	private String imgurl;
	private Integer inventory;
	private Integer smalltype_id;
	private String chuchandi;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getInventory() {
		return inventory;
	}
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	public Integer getSmalltype_id() {
		return smalltype_id;
	}
	public void setSmalltype_id(Integer smalltype_id) {
		this.smalltype_id = smalltype_id;
	}
	public String getChuchandi() {
		return chuchandi;
	}
	public void setChuchandi(String chuchandi) {
		this.chuchandi = chuchandi;
	}

}
