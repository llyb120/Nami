package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_like")
public class RaCircleLike   {
	
	// alias
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_theme_id = "theme_id";
	
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	主题id
	*/
	private Integer theme_id ;
	
	public RaCircleLike() {
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
	* 会员id
	*@return 
	*/
	public Integer getMember_id(){
		return  member_id;
	}
	/**
	* 会员id
	*@param  member_id
	*/
	public void setMember_id(Integer member_id ){
		this.member_id = member_id;
	}
	
	/**
	* 主题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 主题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
	}
	

}
