package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_mapply")
public class RaCircleMapply   {
	
	/*
	申请id
	*/
	private Integer mapplyId ;
	/*
	圈子id
	*/
	private Integer circleId ;
	/*
	成员id
	*/
	private Integer memberId ;
	/*
	申请理由
	*/
	private String mapplyReason ;
	/*
	申请时间
	*/
	private String mapplyTime ;
	
	public RaCircleMapply() {
	}
	
	/**
	* 申请id
	*@return 
	*/
	public Integer getMapplyId(){
		return  mapplyId;
	}
	/**
	* 申请id
	*@param  mapplyId
	*/
	public void setMapplyId(Integer mapplyId ){
		this.mapplyId = mapplyId;
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
	* 申请理由
	*@return 
	*/
	public String getMapplyReason(){
		return  mapplyReason;
	}
	/**
	* 申请理由
	*@param  mapplyReason
	*/
	public void setMapplyReason(String mapplyReason ){
		this.mapplyReason = mapplyReason;
	}
	
	/**
	* 申请时间
	*@return 
	*/
	public String getMapplyTime(){
		return  mapplyTime;
	}
	/**
	* 申请时间
	*@param  mapplyTime
	*/
	public void setMapplyTime(String mapplyTime ){
		this.mapplyTime = mapplyTime;
	}
	

}
