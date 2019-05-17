package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_member_msg_setting")
public class RaMemberMsgSetting   {
	
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	用户消息模板编号
	*/
	private String mmtCode ;
	/*
	是否接收 1是，0否
	*/
	private Integer isReceive ;
	
	public RaMemberMsgSetting() {
	}
	
	/**
	* 会员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 会员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 用户消息模板编号
	*@return 
	*/
	public String getMmtCode(){
		return  mmtCode;
	}
	/**
	* 用户消息模板编号
	*@param  mmtCode
	*/
	public void setMmtCode(String mmtCode ){
		this.mmtCode = mmtCode;
	}
	
	/**
	* 是否接收 1是，0否
	*@return 
	*/
	public Integer getIsReceive(){
		return  isReceive;
	}
	/**
	* 是否接收 1是，0否
	*@param  isReceive
	*/
	public void setIsReceive(Integer isReceive ){
		this.isReceive = isReceive;
	}
	

}
