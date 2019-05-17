package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_user_token")
public class RaMbUserToken   {
	
	/*
	令牌编号
	*/
	private Integer tokenId ;
	/*
	登录时间
	*/
	private Integer loginTime ;
	/*
	用户编号
	*/
	private Integer memberId ;
	/*
	客户端类型 android wap
	*/
	private String clientType ;
	/*
	用户名
	*/
	private String memberName ;
	/*
	登录令牌
	*/
	private String token ;
	
	public RaMbUserToken() {
	}
	
	/**
	* 令牌编号
	*@return 
	*/
	public Integer getTokenId(){
		return  tokenId;
	}
	/**
	* 令牌编号
	*@param  tokenId
	*/
	public void setTokenId(Integer tokenId ){
		this.tokenId = tokenId;
	}
	
	/**
	* 登录时间
	*@return 
	*/
	public Integer getLoginTime(){
		return  loginTime;
	}
	/**
	* 登录时间
	*@param  loginTime
	*/
	public void setLoginTime(Integer loginTime ){
		this.loginTime = loginTime;
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
	* 客户端类型 android wap
	*@return 
	*/
	public String getClientType(){
		return  clientType;
	}
	/**
	* 客户端类型 android wap
	*@param  clientType
	*/
	public void setClientType(String clientType ){
		this.clientType = clientType;
	}
	
	/**
	* 用户名
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 用户名
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 登录令牌
	*@return 
	*/
	public String getToken(){
		return  token;
	}
	/**
	* 登录令牌
	*@param  token
	*/
	public void setToken(String token ){
		this.token = token;
	}
	

}
