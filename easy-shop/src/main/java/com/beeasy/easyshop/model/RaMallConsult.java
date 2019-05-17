package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mall_consult")
public class RaMallConsult   {
	
	/*
	平台客服咨询id
	*/
	private Integer mcId ;
	/*
	管理员id
	*/
	private Integer adminId ;
	/*
	是否回复，1是，0否，默认0
	*/
	private Integer isReply ;
	/*
	咨询时间
	*/
	private Integer mcAddtime ;
	/*
	回复时间
	*/
	private Integer mcReplyTime ;
	/*
	咨询类型id
	*/
	private Integer mctId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	管理员名称
	*/
	private String adminName ;
	/*
	咨询内容
	*/
	private String mcContent ;
	/*
	回复内容
	*/
	private String mcReply ;
	/*
	会员名称
	*/
	private String memberName ;
	
	public RaMallConsult() {
	}
	
	/**
	* 平台客服咨询id
	*@return 
	*/
	public Integer getMcId(){
		return  mcId;
	}
	/**
	* 平台客服咨询id
	*@param  mcId
	*/
	public void setMcId(Integer mcId ){
		this.mcId = mcId;
	}
	
	/**
	* 管理员id
	*@return 
	*/
	public Integer getAdminId(){
		return  adminId;
	}
	/**
	* 管理员id
	*@param  adminId
	*/
	public void setAdminId(Integer adminId ){
		this.adminId = adminId;
	}
	
	/**
	* 是否回复，1是，0否，默认0
	*@return 
	*/
	public Integer getIsReply(){
		return  isReply;
	}
	/**
	* 是否回复，1是，0否，默认0
	*@param  isReply
	*/
	public void setIsReply(Integer isReply ){
		this.isReply = isReply;
	}
	
	/**
	* 咨询时间
	*@return 
	*/
	public Integer getMcAddtime(){
		return  mcAddtime;
	}
	/**
	* 咨询时间
	*@param  mcAddtime
	*/
	public void setMcAddtime(Integer mcAddtime ){
		this.mcAddtime = mcAddtime;
	}
	
	/**
	* 回复时间
	*@return 
	*/
	public Integer getMcReplyTime(){
		return  mcReplyTime;
	}
	/**
	* 回复时间
	*@param  mcReplyTime
	*/
	public void setMcReplyTime(Integer mcReplyTime ){
		this.mcReplyTime = mcReplyTime;
	}
	
	/**
	* 咨询类型id
	*@return 
	*/
	public Integer getMctId(){
		return  mctId;
	}
	/**
	* 咨询类型id
	*@param  mctId
	*/
	public void setMctId(Integer mctId ){
		this.mctId = mctId;
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
	* 管理员名称
	*@return 
	*/
	public String getAdminName(){
		return  adminName;
	}
	/**
	* 管理员名称
	*@param  adminName
	*/
	public void setAdminName(String adminName ){
		this.adminName = adminName;
	}
	
	/**
	* 咨询内容
	*@return 
	*/
	public String getMcContent(){
		return  mcContent;
	}
	/**
	* 咨询内容
	*@param  mcContent
	*/
	public void setMcContent(String mcContent ){
		this.mcContent = mcContent;
	}
	
	/**
	* 回复内容
	*@return 
	*/
	public String getMcReply(){
		return  mcReply;
	}
	/**
	* 回复内容
	*@param  mcReply
	*/
	public void setMcReply(String mcReply ){
		this.mcReply = mcReply;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 会员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	

}
