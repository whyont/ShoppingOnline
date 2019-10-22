package com.flsm.pojo;

import javax.persistence.Id;

import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

/*
 * 个人信息表
 */
public class pinformation {
	@Id
	@KeySql(sql="select seq_pinformation_piid.nextval from dual",order=ORDER.BEFORE)
	private Integer piid;
	private String piname;
	private String nikname;
	private String sex;
	private String birthday;
	private String tel;
	private String email;
	private Integer user_id;
	private String piimgurl;
	public Integer getPiid() {
		return piid;
	}
	public void setPiid(Integer piid) {
		this.piid = piid;
	}
	public String getPiname() {
		return piname;
	}
	public void setPiname(String piname) {
		this.piname = piname;
	}
	public String getNikname() {
		return nikname;
	}
	public void setNikname(String nikname) {
		this.nikname = nikname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getPiimgurl() {
		return piimgurl;
	}
	public void setPiimgurl(String piimgurl) {
		this.piimgurl = piimgurl;
	}

}
