package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 收藏表
 */
public class favorite {
	@Id
	@KeySql(sql="select seq_favorite_fid.nextval from dual",order=ORDER.BEFORE)
	private Integer fid;
	private Integer pid;
	private String pimg;
	private String pname;
	private Integer pprice;
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPprice() {
		return pprice;
	}
	public void setPprice(Integer pprice) {
		this.pprice = pprice;
	}

}
