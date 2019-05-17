package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_mapply")
public class RaCircleMapply   {
	
	// alias
	public static final String ALIAS_mapply_id = "mapply_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_mapply_reason = "mapply_reason";
	public static final String ALIAS_mapply_time = "mapply_time";
	
	/*
	申请id
	*/
	private Integer mapply_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	成员id
	*/
	private Integer member_id ;
	/*
	申请理由
	*/
	private String mapply_reason ;
	/*
	申请时间
	*/
	private String mapply_time ;
	
	public RaCircleMapply() {
	}
	
	/**
	* 申请id
	*@return 
	*/
	public Integer getMapply_id(){
		return  mapply_id;
	}
	/**
	* 申请id
	*@param  mapply_id
	*/
	public void setMapply_id(Integer mapply_id ){
		this.mapply_id = mapply_id;
	}
	
	/**
	* 圈子id
	*@return 
	*/
	public Integer getCircle_id(){
		return  circle_id;
	}
	/**
	* 圈子id
	*@param  circle_id
	*/
	public void setCircle_id(Integer circle_id ){
		this.circle_id = circle_id;
	}
	
	/**
	* 成员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 成员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 申请理由
	*@return 
	*/
	public String getMapply_reason(){
		return  mapply_reason;
	}
	/**
	* 申请理由
	*@param  mapply_reason
	*/
	public void setMapply_reason(String mapply_reason ){
		this.mapply_reason = mapply_reason;
	}
	
	/**
	* 申请时间
	*@return 
	*/
	public String getMapply_time(){
		return  mapply_time;
	}
	/**
	* 申请时间
	*@param  mapply_time
	*/
	public void setMapply_time(String mapply_time ){
		this.mapply_time = mapply_time;
	}
	

}
