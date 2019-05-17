package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_seller")
public class RaSeller   {
	
	// alias
	public static final String ALIAS_seller_id = "seller_id";
	public static final String ALIAS_is_admin = "is_admin";
	public static final String ALIAS_last_login_time = "last_login_time";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_seller_group_id = "seller_group_id";
	public static final String ALIAS_store_id = "store_id";
	public static final String ALIAS_seller_name = "seller_name";
	public static final String ALIAS_seller_quicklink = "seller_quicklink";
	
	/*
	卖家编号
	*/
	private Integer seller_id ;
	/*
	是否管理员(0-不是 1-是)
	*/
	private Integer is_admin ;
	/*
	最后登录时间
	*/
	private Integer last_login_time ;
	/*
	用户编号
	*/
	private Integer member_id ;
	/*
	卖家组编号
	*/
	private Integer seller_group_id ;
	/*
	店铺编号
	*/
	private Integer store_id ;
	/*
	卖家用户名
	*/
	private String seller_name ;
	/*
	卖家快捷操作
	*/
	private String seller_quicklink ;
	
	public RaSeller() {
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getSeller_id(){
		return  seller_id;
	}
	/**
	* 卖家编号
	*@param  seller_id
	*/
	public void setSeller_id(Integer seller_id ){
		this.seller_id = seller_id;
	}
	
	/**
	* 是否管理员(0-不是 1-是)
	*@return 
	*/
	public Integer getIs_admin(){
		return  is_admin;
	}
	/**
	* 是否管理员(0-不是 1-是)
	*@param  is_admin
	*/
	public void setIs_admin(Integer is_admin ){
		this.is_admin = is_admin;
	}
	
	/**
	* 最后登录时间
	*@return 
	*/
	public Integer getLast_login_time(){
		return  last_login_time;
	}
	/**
	* 最后登录时间
	*@param  last_login_time
	*/
	public void setLast_login_time(Integer last_login_time ){
		this.last_login_time = last_login_time;
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 用户编号
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 卖家组编号
	*@return 
	*/
	public Integer getSeller_group_id(){
		return  seller_group_id;
	}
	/**
	* 卖家组编号
	*@param  seller_group_id
	*/
	public void setSeller_group_id(Integer seller_group_id ){
		this.seller_group_id = seller_group_id;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStore_id(){
		return  store_id;
	}
	/**
	* 店铺编号
	*@param  store_id
	*/
	public void setStore_id(Integer store_id ){
		this.store_id = store_id;
	}
	
	/**
	* 卖家用户名
	*@return 
	*/
	public String getSeller_name(){
		return  seller_name;
	}
	/**
	* 卖家用户名
	*@param  seller_name
	*/
	public void setSeller_name(String seller_name ){
		this.seller_name = seller_name;
	}
	
	/**
	* 卖家快捷操作
	*@return 
	*/
	public String getSeller_quicklink(){
		return  seller_quicklink;
	}
	/**
	* 卖家快捷操作
	*@param  seller_quicklink
	*/
	public void setSeller_quicklink(String seller_quicklink ){
		this.seller_quicklink = seller_quicklink;
	}
	

}
