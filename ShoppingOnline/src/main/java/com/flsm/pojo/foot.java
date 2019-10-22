package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 足迹表
 */
public class foot {
	@Id
	@KeySql(sql="select seq_foot_id.nextval from dual",order=ORDER.BEFORE)
	private Integer id;
	private Integer userid;
	private Integer pid;
	private String foottime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getFoottime() {
		return foottime;
	}
	public void setFoottime(String foottime) {
		this.foottime = foottime;
	}
	

}
