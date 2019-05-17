package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_seller")
public class RaSeller   {
	
	/*
	卖家编号
	*/
	private Integer sellerId ;
	/*
	是否管理员(0-不是 1-是)
	*/
	private Integer isAdmin ;
	/*
	最后登录时间
	*/
	private Integer lastLoginTime ;
	/*
	用户编号
	*/
	private Integer memberId ;
	/*
	卖家组编号
	*/
	private Integer sellerGroupId ;
	/*
	店铺编号
	*/
	private Integer storeId ;
	/*
	卖家用户名
	*/
	private String sellerName ;
	/*
	卖家快捷操作
	*/
	private String sellerQuicklink ;
	
	public RaSeller() {
	}
	
	/**
	* 卖家编号
	*@return 
	*/
	public Integer getSellerId(){
		return  sellerId;
	}
	/**
	* 卖家编号
	*@param  sellerId
	*/
	public void setSellerId(Integer sellerId ){
		this.sellerId = sellerId;
	}
	
	/**
	* 是否管理员(0-不是 1-是)
	*@return 
	*/
	public Integer getIsAdmin(){
		return  isAdmin;
	}
	/**
	* 是否管理员(0-不是 1-是)
	*@param  isAdmin
	*/
	public void setIsAdmin(Integer isAdmin ){
		this.isAdmin = isAdmin;
	}
	
	/**
	* 最后登录时间
	*@return 
	*/
	public Integer getLastLoginTime(){
		return  lastLoginTime;
	}
	/**
	* 最后登录时间
	*@param  lastLoginTime
	*/
	public void setLastLoginTime(Integer lastLoginTime ){
		this.lastLoginTime = lastLoginTime;
	}
	
	/**
	* 用户编号
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 用户编号
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 卖家组编号
	*@return 
	*/
	public Integer getSellerGroupId(){
		return  sellerGroupId;
	}
	/**
	* 卖家组编号
	*@param  sellerGroupId
	*/
	public void setSellerGroupId(Integer sellerGroupId ){
		this.sellerGroupId = sellerGroupId;
	}
	
	/**
	* 店铺编号
	*@return 
	*/
	public Integer getStoreId(){
		return  storeId;
	}
	/**
	* 店铺编号
	*@param  storeId
	*/
	public void setStoreId(Integer storeId ){
		this.storeId = storeId;
	}
	
	/**
	* 卖家用户名
	*@return 
	*/
	public String getSellerName(){
		return  sellerName;
	}
	/**
	* 卖家用户名
	*@param  sellerName
	*/
	public void setSellerName(String sellerName ){
		this.sellerName = sellerName;
	}
	
	/**
	* 卖家快捷操作
	*@return 
	*/
	public String getSellerQuicklink(){
		return  sellerQuicklink;
	}
	/**
	* 卖家快捷操作
	*@param  sellerQuicklink
	*/
	public void setSellerQuicklink(String sellerQuicklink ){
		this.sellerQuicklink = sellerQuicklink;
	}
	

}
