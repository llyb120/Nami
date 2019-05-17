package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_explog")
public class RaCircleExplog   {
	
	// alias
	public static final String ALIAS_el_id = "el_id";
	public static final String ALIAS_circle_id = "circle_id";
	public static final String ALIAS_el_exp = "el_exp";
	public static final String ALIAS_el_type = "el_type";
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_el_desc = "el_desc";
	public static final String ALIAS_el_itemid = "el_itemid";
	public static final String ALIAS_el_time = "el_time";
	public static final String ALIAS_member_name = "member_name";
	
	/*
	经验日志id
	*/
	private Integer el_id ;
	/*
	圈子id
	*/
	private Integer circle_id ;
	/*
	获得经验
	*/
	private Integer el_exp ;
	/*
	类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*/
	private Integer el_type ;
	/*
	成员id
	*/
	private Integer member_id ;
	/*
	描述
	*/
	private String el_desc ;
	/*
	信息id
	*/
	private String el_itemid ;
	/*
	获得时间
	*/
	private String el_time ;
	/*
	成员名称
	*/
	private String member_name ;
	
	public RaCircleExplog() {
	}
	
	/**
	* 经验日志id
	*@return 
	*/
	public Integer getEl_id(){
		return  el_id;
	}
	/**
	* 经验日志id
	*@param  el_id
	*/
	public void setEl_id(Integer el_id ){
		this.el_id = el_id;
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
	* 获得经验
	*@return 
	*/
	public Integer getEl_exp(){
		return  el_exp;
	}
	/**
	* 获得经验
	*@param  el_exp
	*/
	public void setEl_exp(Integer el_exp ){
		this.el_exp = el_exp;
	}
	
	/**
	* 类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*@return 
	*/
	public Integer getEl_type(){
		return  el_type;
	}
	/**
	* 类型 1管理员操作 2发表话题 3发表回复 4话题被回复 5话题被删除 6回复被删除
	*@param  el_type
	*/
	public void setEl_type(Integer el_type ){
		this.el_type = el_type;
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
	* 描述
	*@return 
	*/
	public String getEl_desc(){
		return  el_desc;
	}
	/**
	* 描述
	*@param  el_desc
	*/
	public void setEl_desc(String el_desc ){
		this.el_desc = el_desc;
	}
	
	/**
	* 信息id
	*@return 
	*/
	public String getEl_itemid(){
		return  el_itemid;
	}
	/**
	* 信息id
	*@param  el_itemid
	*/
	public void setEl_itemid(String el_itemid ){
		this.el_itemid = el_itemid;
	}
	
	/**
	* 获得时间
	*@return 
	*/
	public String getEl_time(){
		return  el_time;
	}
	/**
	* 获得时间
	*@param  el_time
	*/
	public void setEl_time(String el_time ){
		this.el_time = el_time;
	}
	
	/**
	* 成员名称
	*@return 
	*/
	public String getMember_name(){
		return  member_name;
	}
	/**
	* 成员名称
	*@param  member_name
	*/
	public void setMember_name(String member_name ){
		this.member_name = member_name;
	}
	

}
