package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_member_common")
public class RaMemberCommon   {
	
	/*
	会员ID
	*/
	private Integer memberId ;
	private Integer authCodeCheckTimes ;
	/*
	短信/邮件验证码发送时间
	*/
	private Integer sendAcodeTime ;
	private Integer sendAcodeTimes ;
	/*
	短信/邮件验证码
	*/
	private String authCode ;
	
	public RaMemberCommon() {
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员ID
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	public Integer getAuthCodeCheckTimes(){
		return  authCodeCheckTimes;
	}
	public void setAuthCodeCheckTimes(Integer authCodeCheckTimes ){
		this.authCodeCheckTimes = authCodeCheckTimes;
	}
	
	/**
	* 短信/邮件验证码发送时间
	*@return 
	*/
	public Integer getSendAcodeTime(){
		return  sendAcodeTime;
	}
	/**
	* 短信/邮件验证码发送时间
	*@param  sendAcodeTime
	*/
	public void setSendAcodeTime(Integer sendAcodeTime ){
		this.sendAcodeTime = sendAcodeTime;
	}
	
	public Integer getSendAcodeTimes(){
		return  sendAcodeTimes;
	}
	public void setSendAcodeTimes(Integer sendAcodeTimes ){
		this.sendAcodeTimes = sendAcodeTimes;
	}
	
	/**
	* 短信/邮件验证码
	*@return 
	*/
	public String getAuthCode(){
		return  authCode;
	}
	/**
	* 短信/邮件验证码
	*@param  authCode
	*/
	public void setAuthCode(String authCode ){
		this.authCode = authCode;
	}
	

}
