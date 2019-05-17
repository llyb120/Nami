package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_thpollvoter")
public class RaCircleThpollvoter   {
	
	/*
	成员id
	*/
	private Integer memberId ;
	/*
	话题id
	*/
	private Integer themeId ;
	/*
	成员名称
	*/
	private String memberName ;
	/*
	投票选项
	*/
	private String pollvoOptions ;
	/*
	投票选项
	*/
	private String pollvoTime ;
	
	public RaCircleThpollvoter() {
	}
	
	/**
	* 成员id
	*@return 
	*/
	public Integer getMemberId(){
		return  memberId;
	}
	/**
	* 成员id
	*@param  memberId
	*/
	public void setMemberId(Integer memberId ){
		this.memberId = memberId;
	}
	
	/**
	* 话题id
	*@return 
	*/
	public Integer getThemeId(){
		return  themeId;
	}
	/**
	* 话题id
	*@param  themeId
	*/
	public void setThemeId(Integer themeId ){
		this.themeId = themeId;
	}
	
	/**
	* 成员名称
	*@return 
	*/
	public String getMemberName(){
		return  memberName;
	}
	/**
	* 成员名称
	*@param  memberName
	*/
	public void setMemberName(String memberName ){
		this.memberName = memberName;
	}
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollvoOptions(){
		return  pollvoOptions;
	}
	/**
	* 投票选项
	*@param  pollvoOptions
	*/
	public void setPollvoOptions(String pollvoOptions ){
		this.pollvoOptions = pollvoOptions;
	}
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollvoTime(){
		return  pollvoTime;
	}
	/**
	* 投票选项
	*@param  pollvoTime
	*/
	public void setPollvoTime(String pollvoTime ){
		this.pollvoTime = pollvoTime;
	}
	

}
