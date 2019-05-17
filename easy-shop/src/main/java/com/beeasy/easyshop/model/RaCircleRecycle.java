package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_recycle")
public class RaCircleRecycle   {
	
	/*
	回收站id
	*/
	private Integer recycleId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	会员id
	*/
	private Integer memberId ;
	/*
	操作人id
	*/
	private Integer recycleOpid ;
	/*
	类型 1话题，2回复
	*/
	private Integer recycleType ;
	/*
	圈子名称
	*/
	private String circleName ;
	/*
	会员名称
	*/
	private String memberName ;
	/*
	内容
	*/
	private String recycleContent ;
	/*
	操作人名称
	*/
	private String recycleOpname ;
	/*
	操作时间
	*/
	private String recycleTime ;
	/*
	主题名称
	*/
	private String themeName ;
	
	public RaCircleRecycle() {
	}
	
	/**
	* 回收站id
	*@return 
	*/
	public Integer getRecycleId(){
		return  recycleId;
	}
	/**
	* 回收站id
	*@param  recycleId
	*/
	public void setRecycleId(Integer recycleId ){
		this.recycleId = recycleId;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircleId(){
		return  circleId;
	}
	/**
	* 圈子id
	*@param  circleId
	*/
	public void setCircleId(Integer circleId ){
		this.circleId = circleId;
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
	* 操作人id
	*@return 
	*/
	public Integer getRecycleOpid(){
		return  recycleOpid;
	}
	/**
	* 操作人id
	*@param  recycleOpid
	*/
	public void setRecycleOpid(Integer recycleOpid ){
		this.recycleOpid = recycleOpid;
	}
	
	/**
	* 类型 1话题，2回复
	*@return 
	*/
	public Integer getRecycleType(){
		return  recycleType;
	}
	/**
	* 类型 1话题，2回复
	*@param  recycleType
	*/
	public void setRecycleType(Integer recycleType ){
		this.recycleType = recycleType;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircleName(){
		return  circleName;
	}
	/**
	* 圈子名称
	*@param  circleName
	*/
	public void setCircleName(String circleName ){
		this.circleName = circleName;
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
	
	/**
	* 内容
	*@return 
	*/
	public String getRecycleContent(){
		return  recycleContent;
	}
	/**
	* 内容
	*@param  recycleContent
	*/
	public void setRecycleContent(String recycleContent ){
		this.recycleContent = recycleContent;
	}
	
	/**
	* 操作人名称
	*@return 
	*/
	public String getRecycleOpname(){
		return  recycleOpname;
	}
	/**
	* 操作人名称
	*@param  recycleOpname
	*/
	public void setRecycleOpname(String recycleOpname ){
		this.recycleOpname = recycleOpname;
	}
	
	/**
	* 操作时间
	*@return 
	*/
	public String getRecycleTime(){
		return  recycleTime;
	}
	/**
	* 操作时间
	*@param  recycleTime
	*/
	public void setRecycleTime(String recycleTime ){
		this.recycleTime = recycleTime;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getThemeName(){
		return  themeName;
	}
	/**
	* 主题名称
	*@param  themeName
	*/
	public void setThemeName(String themeName ){
		this.themeName = themeName;
	}
	

}
