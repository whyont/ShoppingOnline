package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 评价表
 */
public class evealuate {
	@Id
	@KeySql(sql="select seq_evealuate_eid.nextval from dual",order=ORDER.BEFORE)
	private Integer eid;
	private String ename;
	private String etime;
	private String etext;
	private Integer product_pid;
	private Integer estatus;
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getEtext() {
		return etext;
	}
	public void setEtext(String etext) {
		this.etext = etext;
	}
	public Integer getProduct_pid() {
		return product_pid;
	}
	public void setProduct_pid(Integer product_pid) {
		this.product_pid = product_pid;
	}
	public Integer getEstatus() {
		return estatus;
	}
	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}
	

}
