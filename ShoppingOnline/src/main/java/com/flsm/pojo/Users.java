package com.flsm.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="users")
public class Users {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer uid;
	private String uname;
	private String upwd;
	private String usex;
	private String ubirthday;
	private String uphone;
	private String uemail;
	private String utime;
	private String uheadimgurl;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUbirthday() {
		return ubirthday;
	}
	public void setUbirthday(String ubirthday) {
		this.ubirthday = ubirthday;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUtime() {
		return utime;
	}
	public void setUtime(String utime) {
		this.utime = utime;
	}
	public String getUheadimgurl() {
		return uheadimgurl;
	}
	public void setUheadimgurl(String uheadimgurl) {
		this.uheadimgurl = uheadimgurl;
	}
	public Users(Integer uid, String uname, String upwd, String usex, String ubirthday, String uphone, String uemail,
			String utime, String uheadimgurl) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.usex = usex;
		this.ubirthday = ubirthday;
		this.uphone = uphone;
		this.uemail = uemail;
		this.utime = utime;
		this.uheadimgurl = uheadimgurl;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
