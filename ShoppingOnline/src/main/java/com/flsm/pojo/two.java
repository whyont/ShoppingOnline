package com.flsm.pojo;

import java.util.List;

import javax.persistence.Id;

public class two {
	@Id
	private Integer twid;
	@Override
	public String toString() {
		return "two [twid=" + twid + ", otwid=" + otwid + ", twname=" + twname + ", tthrees=" + tthrees + "]";
	}
	private Integer otwid;
	private String twname;
	private List<three> tthrees;
	public Integer getTid() {
		return twid;
	}
	public Integer getOtwid() {
		return otwid;
	}
	public String getTwname() {
		return twname;
	}
	public List<three> getTthrees() {
		return tthrees;
	}
	public void setTid(Integer tid) {
		this.twid = tid;
	}
	public void setOtwid(Integer otwid) {
		this.otwid = otwid;
	}
	public void setTwname(String twname) {
		this.twname = twname;
	}
	public void setTthrees(List<three> tthrees) {
		this.tthrees = tthrees;
	}
	

}
