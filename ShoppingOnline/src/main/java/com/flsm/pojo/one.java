package com.flsm.pojo;

import java.util.List;

import javax.persistence.Id;

public class one {
	@Id
	private Integer oid;
	private String iaddress;
	private String oname;
	
	private List<two> otwo;

	public Integer getOid() {
		return oid;
	}

	public String getIaddress() {
		return iaddress;
	}

	public String getOname() {
		return oname;
	}

	public List<two> getOtwo() {
		return otwo;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public void setIaddress(String iaddress) {
		this.iaddress = iaddress;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public void setOtwo(List<two> otwo) {
		this.otwo = otwo;
	}

	@Override
	public String toString() {
		return "one [oid=" + oid + ", iaddress=" + iaddress + ", oname=" + oname + ", otwo=" + otwo + "]";
	}

}
