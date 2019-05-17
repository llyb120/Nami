package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_proxy")
public class RaProxy   {
	
	private Integer memberId ;
	/*
	是否是一般会员，一般会员无法发展下线
	*/
	private Integer isBuyer ;
	private Integer isGuest ;
	private Integer isSpecial ;
	private Integer parentId ;
	private String infomation ;
	private String mobile ;
	private String priceFormula ;
	private String time ;
	
	public RaProxy() {
	}
	
	public Integer getMemberId(){
		return  memberId;
	}
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 是否是一般会员，一般会员无法发展下线
	*@return 
	*/
	public Integer getIsBuyer(){
		return  isBuyer;
	}
	/**
	* 是否是一般会员，一般会员无法发展下线
	*@param  isBuyer
	*/
	public void setIsBuyer(Integer isBuyer ){
		this.isBuyer = isBuyer;
	}
	
	public Integer getIsGuest(){
		return  isGuest;
	}
	public void setIsGuest(Integer isGuest ){
		this.isGuest = isGuest;
	}
	
	public Integer getIsSpecial(){
		return  isSpecial;
	}
	public void setIsSpecial(Integer isSpecial ){
		this.isSpecial = isSpecial;
	}
	
	public Integer getParentId(){
		return  parentId;
	}
	public void setParentId(Integer parentId ){
		this.parentId = parentId;
	}
	
	public String getInfomation(){
		return  infomation;
	}
	public void setInfomation(String infomation ){
		this.infomation = infomation;
	}
	
	public String getMobile(){
		return  mobile;
	}
	public void setMobile(String mobile ){
		this.mobile = mobile;
	}
	
	public String getPriceFormula(){
		return  priceFormula;
	}
	public void setPriceFormula(String priceFormula ){
		this.priceFormula = priceFormula;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
