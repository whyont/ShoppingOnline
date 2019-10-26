package com.flsm.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;
	private String pname;
	private String productType;
	private String productBrand;
	private String pexpress;
	private Integer Pexpressprice;
	private Integer price;
	@Transient
	private Integer Salesvolume;
	
	@Transient
	private String imgurl;
	
	
	
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Integer getSalesvolume() {
		return Salesvolume;
	}
	public void setSalesvolume(Integer salesvolume) {
		Salesvolume = salesvolume;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getPexpress() {
		return pexpress;
	}
	public void setPexpress(String pexpress) {
		this.pexpress = pexpress;
	}
	public Integer getPexpressprice() {
		return Pexpressprice;
	}
	public void setPexpressprice(Integer pexpressprice) {
		Pexpressprice = pexpressprice;
	}
	public Product() {
		super();
	}
	
	

}
