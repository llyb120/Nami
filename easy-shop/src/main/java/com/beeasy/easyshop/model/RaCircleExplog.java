package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_explog")
public class RaCircleExplog   {
	
	/*
	经验日志id
	*/
	private Integer elId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	获得经验
	*/
	private Integer elExp ;
	/*
	类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*/
	private Integer elType ;
	/*
	成员id
	*/
	private Integer memberId ;
	/*
	描述
	*/
	private String elDesc ;
	/*
	信息id
	*/
	private String elItemid ;
	/*
	获得时间
	*/
	private String elTime ;
	/*
	成员名称
	*/
	private String memberName ;
	
	public RaCircleExplog() {
	}
	
	/**
	* 经验日志id
	*@return 
	*/
	public Integer getElId(){
		return  elId;
	}
	/**
	* 经验日志id
	*@param  elId
	*/
	public void setElId(Integer elId ){
		this.elId = elId;
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
	* 获得经验
	*@return 
	*/
	public Integer getElExp(){
		return  elExp;
	}
	/**
	* 获得经验
	*@param  elExp
	*/
	public void setElExp(Integer elExp ){
		this.elExp = elExp;
	}
	
	/**
	* 类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*@return 
	*/
	public Integer getElType(){
		return  elType;
	}
	/**
	* 类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*@param  elType
	*/
	public void setElType(Integer elType ){
		this.elType = elType;
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
	* 描述
	*@return 
	*/
	public String getElDesc(){
		return  elDesc;
	}
	/**
	* 描述
	*@param  elDesc
	*/
	public void setElDesc(String elDesc ){
		this.elDesc = elDesc;
	}
	
	/**
	* 信息id
	*@return 
	*/
	public String getElItemid(){
		return  elItemid;
	}
	/**
	* 信息id
	*@param  elItemid
	*/
	public void setElItemid(String elItemid ){
		this.elItemid = elItemid;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getElTime(){
		return  elTime;
	}
	/**
	* 获得时间
	*@param  elTime
	*/
	public void setElTime(String elTime ){
		this.elTime = elTime;
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
	

}
