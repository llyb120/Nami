package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_member_common")
public class RaMemberCommon   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_auth_code_check_times = "auth_code_check_times";
	public static final String ALIAS_send_acode_time = "send_acode_time";
	public static final String ALIAS_send_acode_times = "send_acode_times";
	public static final String ALIAS_auth_code = "auth_code";
	
	/*
	会员ID
	*/
	private Integer member_id ;
	private Integer auth_code_check_times ;
	/*
	短信/邮件验证码发送时间
	*/
	private Integer send_acode_time ;
	private Integer send_acode_times ;
	/*
	短信/邮件验证码
	*/
	private String auth_code ;
	
	public RaMemberCommon() {
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员ID
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	public Integer getAuth_code_check_times(){
		return  auth_code_check_times;
	}
	public void setAuth_code_check_times(Integer auth_code_check_times ){
		this.auth_code_check_times = auth_code_check_times;
	}
	
	/**
	* 短信/邮件验证码发送时间
	*@return 
	*/
	public Integer getSend_acode_time(){
		return  send_acode_time;
	}
	/**
	* 短信/邮件验证码发送时间
	*@param  send_acode_time
	*/
	public void setSend_acode_time(Integer send_acode_time ){
		this.send_acode_time = send_acode_time;
	}
	
	public Integer getSend_acode_times(){
		return  send_acode_times;
	}
	public void setSend_acode_times(Integer send_acode_times ){
		this.send_acode_times = send_acode_times;
	}
	
	/**
	* 短信/邮件验证码
	*@return 
	*/
	public String getAuth_code(){
		return  auth_code;
	}
	/**
	* 短信/邮件验证码
	*@param  auth_code
	*/
	public void setAuth_code(String auth_code ){
		this.auth_code = auth_code;
	}
	

}
