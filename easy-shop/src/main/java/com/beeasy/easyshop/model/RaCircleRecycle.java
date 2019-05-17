package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_recycle")
public class RaCircleRecycle   {
	
	// alias
	public static final String ALIAS_recycle_id = "recycle_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_recycle_opid = "recycle_opid";
	public static final String ALIAS_recycle_type = "recycle_type";
	public static final String ALIAS_circle_name = "circle_name";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_recycle_content = "recycle_content";
	public static final String ALIAS_recycle_opname = "recycle_opname";
	public static final String ALIAS_recycle_time = "recycle_time";
	public static final String ALIAS_theme_name = "theme_name";
	
	/*
	回收站id
	*/
	private Integer recycle_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	会员id
	*/
	private Integer member_id ;
	/*
	操作人id
	*/
	private Integer recycle_opid ;
	/*
	类型 1话题，2回复
	*/
	private Integer recycle_type ;
	/*
	圈子名称
	*/
	private String circle_name ;
	/*
	会员名称
	*/
	private String member_name ;
	/*
	内容
	*/
	private String recycle_content ;
	/*
	操作人名称
	*/
	private String recycle_opname ;
	/*
	操作时间
	*/
	private String recycle_time ;
	/*
	主题名称
	*/
	private String theme_name ;
	
	public RaCircleRecycle() {
	}
	
	/**
	* 回收站id
	*@return 
	*/
	public Integer getRecycle_id(){
		return  recycle_id;
	}
	/**
	* 回收站id
	*@param  recycle_id
	*/
	public void setRecycle_id(Integer recycle_id ){
		this.recycle_id = recycle_id;
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
	* 操作人id
	*@return 
	*/
	public Integer getRecycle_opid(){
		return  recycle_opid;
	}
	/**
	* 操作人id
	*@param  recycle_opid
	*/
	public void setRecycle_opid(Integer recycle_opid ){
		this.recycle_opid = recycle_opid;
	}
	
	/**
	* 类型 1话题，2回复
	*@return 
	*/
	public Integer getRecycle_type(){
		return  recycle_type;
	}
	/**
	* 类型 1话题，2回复
	*@param  recycle_type
	*/
	public void setRecycle_type(Integer recycle_type ){
		this.recycle_type = recycle_type;
	}
	
	/**
	* 圈子名称
	*@return 
	*/
	public String getCircle_name(){
		return  circle_name;
	}
	/**
	* 圈子名称
	*@param  circle_name
	*/
	public void setCircle_name(String circle_name ){
		this.circle_name = circle_name;
	}
	
	/**
	* 会员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 会员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	
	/**
	* 内容
	*@return 
	*/
	public String getRecycle_content(){
		return  recycle_content;
	}
	/**
	* 内容
	*@param  recycle_content
	*/
	public void setRecycle_content(String recycle_content ){
		this.recycle_content = recycle_content;
	}
	
	/**
	* 操作人名称
	*@return 
	*/
	public String getRecycle_opname(){
		return  recycle_opname;
	}
	/**
	* 操作人名称
	*@param  recycle_opname
	*/
	public void setRecycle_opname(String recycle_opname ){
		this.recycle_opname = recycle_opname;
	}
	
	/**
	* 操作时间
	*@return 
	*/
	public String getRecycle_time(){
		return  recycle_time;
	}
	/**
	* 操作时间
	*@param  recycle_time
	*/
	public void setRecycle_time(String recycle_time ){
		this.recycle_time = recycle_time;
	}
	
	/**
	* 主题名称
	*@return 
	*/
	public String getTheme_name(){
		return  theme_name;
	}
	/**
	* 主题名称
	*@param  theme_name
	*/
	public void setTheme_name(String theme_name ){
		this.theme_name = theme_name;
	}
	

}
