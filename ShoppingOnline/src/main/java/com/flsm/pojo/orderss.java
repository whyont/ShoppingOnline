package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 订单表
 */
public class orderss {
	@Id
	@KeySql(sql="select seq_orderss_oid.nextval from dual",order=ORDER.BEFORE)
	private Integer oid;
	private String nums;
	private String time;
	private Integer id;
	private Integer statu;
	private Integer pid;
	private Integer shuliang;
	private Integer money;
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getNums() {
		return nums;
	}
	public void setNums(String nums) {
		this.nums = nums;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStatu() {
		return statu;
	}
	public void setStatu(Integer statu) {
		this.statu = statu;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getShuliang() {
		return shuliang;
	}
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	

}
