package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_complain_talk")
public class RaComplainTalk   {
	
	/*
	投诉对话id
	*/
	private Integer talkId ;
	/*
	投诉id
	*/
	private Integer complainId ;
	/*
	对话管理员，屏蔽对话人的id
	*/
	private Integer talkAdmin ;
	/*
	对话发表时间
	*/
	private Integer talkDatetime ;
	/*
	发言人id
	*/
	private Integer talkMemberId ;
	/*
	发言状态(1-显示/2-不显示)
	*/
	private Integer talkState ;
	/*
	发言内容
	*/
	private String talkContent ;
	/*
	发言人名称
	*/
	private String talkMemberName ;
	/*
	发言人类型(1-投诉人/2-被投诉人/3-平台)
	*/
	private String talkMemberType ;
	
	public RaComplainTalk() {
	}
	
	/**
	* 投诉对话id
	*@return 
	*/
	public Integer getTalkId(){
		return  talkId;
	}
	/**
	* 投诉对话id
	*@param  talkId
	*/
	public void setTalkId(Integer talkId ){
		this.talkId = talkId;
	}
	
	/**
	* 投诉id
	*@return 
	*/
	public Integer getComplainId(){
		return  complainId;
	}
	/**
	* 投诉id
	*@param  complainId
	*/
	public void setComplainId(Integer complainId ){
		this.complainId = complainId;
	}
	
	/**
	* 对话管理员，屏蔽对话人的id
	*@return 
	*/
	public Integer getTalkAdmin(){
		return  talkAdmin;
	}
	/**
	* 对话管理员，屏蔽对话人的id
	*@param  talkAdmin
	*/
	public void setTalkAdmin(Integer talkAdmin ){
		this.talkAdmin = talkAdmin;
	}
	
	/**
	* 对话发表时间
	*@return 
	*/
	public Integer getTalkDatetime(){
		return  talkDatetime;
	}
	/**
	* 对话发表时间
	*@param  talkDatetime
	*/
	public void setTalkDatetime(Integer talkDatetime ){
		this.talkDatetime = talkDatetime;
	}
	
	/**
	* 发言人id
	*@return 
	*/
	public Integer getTalkMemberId(){
		return  talkMemberId;
	}
	/**
	* 发言人id
	*@param  talkMemberId
	*/
	public void setTalkMemberId(Integer talkMemberId ){
		this.talkMemberId = talkMemberId;
	}
	
	/**
	* 发言状态(1-显示/2-不显示)
	*@return 
	*/
	public Integer getTalkState(){
		return  talkState;
	}
	/**
	* 发言状态(1-显示/2-不显示)
	*@param  talkState
	*/
	public void setTalkState(Integer talkState ){
		this.talkState = talkState;
	}
	
	/**
	* 发言内容
	*@return 
	*/
	public String getTalkContent(){
		return  talkContent;
	}
	/**
	* 发言内容
	*@param  talkContent
	*/
	public void setTalkContent(String talkContent ){
		this.talkContent = talkContent;
	}
	
	/**
	* 发言人名称
	*@return 
	*/
	public String getTalkMemberName(){
		return  talkMemberName;
	}
	/**
	* 发言人名称
	*@param  talkMemberName
	*/
	public void setTalkMemberName(String talkMemberName ){
		this.talkMemberName = talkMemberName;
	}
	
	/**
	* 发言人类型(1-投诉人/2-被投诉人/3-平台)
	*@return 
	*/
	public String getTalkMemberType(){
		return  talkMemberType;
	}
	/**
	* 发言人类型(1-投诉人/2-被投诉人/3-平台)
	*@param  talkMemberType
	*/
	public void setTalkMemberType(String talkMemberType ){
		this.talkMemberType = talkMemberType;
	}
	

}
