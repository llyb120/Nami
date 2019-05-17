package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_expmember")
public class RaCircleExpmember   {
	
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	成员id
	*/
	private Integer memberId ;
	/*
	获得经验
	*/
	private Integer emExp ;
	/*
	获得时间
	*/
	private String emTime ;
	
	public RaCircleExpmember() {
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
	* 获得经验
	*@return 
	*/
	public Integer getEmExp(){
		return  emExp;
	}
	/**
	* 获得经验
	*@param  emExp
	*/
	public void setEmExp(Integer emExp ){
		this.emExp = emExp;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getEmTime(){
		return  emTime;
	}
	/**
	* 获得时间
	*@param  emTime
	*/
	public void setEmTime(String emTime ){
		this.emTime = emTime;
	}
	

}
