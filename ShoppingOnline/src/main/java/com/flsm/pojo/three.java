package com.flsm.pojo;



import javax.persistence.Id;

public class three {
	@Id
	private Integer tid;
	private Integer twid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public Integer getTwid() {
		return twid;
	}
	public String getTname() {
		return tname;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public void setTwid(Integer twid) {
		this.twid = twid;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "three [tid=" + tid + ", twid=" + twid + ", tname=" + tname + "]";
	}
	
	

}
