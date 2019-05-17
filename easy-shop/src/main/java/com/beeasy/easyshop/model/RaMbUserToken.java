package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mb_user_token")
public class RaMbUserToken   {
	
	// alias
	public static final String ALIAS_token_id = "token_id";
	public static final String ALIAS_login_time = "login_time";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_client_type = "client_type";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_token = "token";
	
	/*
	令牌编号
	*/
	private Integer token_id ;
	/*
	登录时间
	*/
	private Integer login_time ;
	/*
	用户编号
	*/
	private Integer member_id ;
	/*
	客户端类型 android wap
	*/
	private String client_type ;
	/*
	用户名
	*/
	private String member_name ;
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
	public Integer getToken_id(){
		return  token_id;
	}
	/**
	* 令牌编号
	*@param  token_id
	*/
	public void setToken_id(Integer token_id ){
		this.token_id = token_id;
	}
	
	/**
	* 登录时间
	*@return 
	*/
	public Integer getLogin_time(){
		return  login_time;
	}
	/**
	* 登录时间
	*@param  login_time
	*/
	public void setLogin_time(Integer login_time ){
		this.login_time = login_time;
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
	* 客户端类型 android wap
	*@return 
	*/
	public String getClient_type(){
		return  client_type;
	}
	/**
	* 客户端类型 android wap
	*@param  client_type
	*/
	public void setClient_type(String client_type ){
		this.client_type = client_type;
	}
	
	/**
	* 用户名
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 用户名
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
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
