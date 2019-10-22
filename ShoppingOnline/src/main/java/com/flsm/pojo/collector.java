package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 收藏夹表
 */
public class collector {
	@Id
	@KeySql(sql="select seq_collector_cid.nextval from dual",order=ORDER.BEFORE)
	private Integer cid;
	private Integer userid;
	private Integer pid;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	

}
