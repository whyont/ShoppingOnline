package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 新闻表
 */
public class news {
	@Id
	@KeySql(sql="select seq_news_nid.nextval from dual",order=ORDER.BEFORE)
	private Integer nid;
	private String ntype;
	private String ntext;
	private String nimgurl;
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public String getNtype() {
		return ntype;
	}
	public void setNtype(String ntype) {
		this.ntype = ntype;
	}
	public String getNtext() {
		return ntext;
	}
	public void setNtext(String ntext) {
		this.ntext = ntext;
	}
	public String getNimgurl() {
		return nimgurl;
	}
	public void setNimgurl(String nimgurl) {
		this.nimgurl = nimgurl;
	}

}
