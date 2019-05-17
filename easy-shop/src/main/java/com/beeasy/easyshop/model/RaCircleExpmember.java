package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_expmember")
public class RaCircleExpmember   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_em_exp = "em_exp";
	public static final String ALIAS_em_time = "em_time";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	成员id
	*/
	private Integer member_id ;
	/*
	获得经验
	*/
	private Integer em_exp ;
	/*
	获得时间
	*/
	private String em_time ;
	
	public RaCircleExpmember() {
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
	* 获得经验
	*@return 
	*/
	public Integer getEm_exp(){
		return  em_exp;
	}
	/**
	* 获得经验
	*@param  em_exp
	*/
	public void setEm_exp(Integer em_exp ){
		this.em_exp = em_exp;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getEm_time(){
		return  em_time;
	}
	/**
	* 获得时间
	*@param  em_time
	*/
	public void setEm_time(String em_time ){
		this.em_time = em_time;
	}
	

}
