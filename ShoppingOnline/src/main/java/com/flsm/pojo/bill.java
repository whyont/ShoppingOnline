package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 账单表
 */

public class bill {
	@Id
	@KeySql(sql="select seq_bill_bid.nextval from dual",order=ORDER.BEFORE)
	private Integer bid;
	private Integer bstatus;
	private String bcz;
	private String btime;
	private Integer bprice;
	private Integer user_uid;
	private Integer bmoney;
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Integer getBstatus() {
		return bstatus;
	}
	public void setBstatus(Integer bstatus) {
		this.bstatus = bstatus;
	}
	public String getBcz() {
		return bcz;
	}
	public void setBcz(String bcz) {
		this.bcz = bcz;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public Integer getBprice() {
		return bprice;
	}
	public void setBprice(Integer bprice) {
		this.bprice = bprice;
	}
	public Integer getUser_uid() {
		return user_uid;
	}
	public void setUser_uid(Integer user_uid) {
		this.user_uid = user_uid;
	}
	public Integer getBmoney() {
		return bmoney;
	}
	public void setBmoney(Integer bmoney) {
		this.bmoney = bmoney;
	}
	

}
