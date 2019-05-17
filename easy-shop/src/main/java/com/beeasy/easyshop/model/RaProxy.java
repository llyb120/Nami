package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_proxy")
public class RaProxy   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_is_buyer = "is_buyer";
	public static final String ALIAS_is_guest = "is_guest";
	public static final String ALIAS_is_special = "is_special";
	public static final String ALIAS_parent_id = "parent_id";
	public static final String ALIAS_infomation = "infomation";
	public static final String ALIAS_mobile = "mobile";
	public static final String ALIAS_price_formula = "price_formula";
	public static final String ALIAS_time = "time";
	
	private Integer member_id ;
	/*
	是否是一般会员，一般会员无法发展下线
	*/
	private Integer is_buyer ;
	private Integer is_guest ;
	private Integer is_special ;
	private Integer parent_id ;
	private String infomation ;
	private String mobile ;
	private String price_formula ;
	private String time ;
	
	public RaProxy() {
	}
	
	public Integer getMember_id(){
		return  member_id;
	}
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 是否是一般会员，一般会员无法发展下线
	*@return 
	*/
	public Integer getIs_buyer(){
		return  is_buyer;
	}
	/**
	* 是否是一般会员，一般会员无法发展下线
	*@param  is_buyer
	*/
	public void setIs_buyer(Integer is_buyer ){
		this.is_buyer = is_buyer;
	}
	
	public Integer getIs_guest(){
		return  is_guest;
	}
	public void setIs_guest(Integer is_guest ){
		this.is_guest = is_guest;
	}
	
	public Integer getIs_special(){
		return  is_special;
	}
	public void setIs_special(Integer is_special ){
		this.is_special = is_special;
	}
	
	public Integer getParent_id(){
		return  parent_id;
	}
	public void setParent_id(Integer parent_id ){
		this.parent_id = parent_id;
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
	
	public String getPrice_formula(){
		return  price_formula;
	}
	public void setPrice_formula(String price_formula ){
		this.price_formula = price_formula;
	}
	
	public String getTime(){
		return  time;
	}
	public void setTime(String time ){
		this.time = time;
	}
	

}
