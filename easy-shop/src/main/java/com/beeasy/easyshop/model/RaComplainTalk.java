package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_complain_talk")
public class RaComplainTalk   {
	
	// alias
	public static final String ALIAS_talk_id = "talk_id";
	public static final String ALIAS_complain_id = "complain_id";
	public static final String ALIAS_talk_admin = "talk_admin";
	public static final String ALIAS_talk_datetime = "talk_datetime";
	public static final String ALIAS_talk_member_id = "talk_member_id";
	public static final String ALIAS_talk_state = "talk_state";
	public static final String ALIAS_talk_content = "talk_content";
	public static final String ALIAS_talk_member_name = "talk_member_name";
	public static final String ALIAS_talk_member_type = "talk_member_type";
	
	/*
	投诉对话id
	*/
	private Integer talk_id ;
	/*
	投诉id
	*/
	private Integer complain_id ;
	/*
	对话管理员，屏蔽对话人的id
	*/
	private Integer talk_admin ;
	/*
	对话发表时间
	*/
	private Integer talk_datetime ;
	/*
	发言人id
	*/
	private Integer talk_member_id ;
	/*
	发言状态(1-显示/2-不显示)
	*/
	private Integer talk_state ;
	/*
	发言内容
	*/
	private String talk_content ;
	/*
	发言人名称
	*/
	private String talk_member_name ;
	/*
	发言人类型(1-投诉人/2-被投诉人/3-平台)
	*/
	private String talk_member_type ;
	
	public RaComplainTalk() {
	}
	
	/**
	* 投诉对话id
	*@return 
	*/
	public Integer getTalk_id(){
		return  talk_id;
	}
	/**
	* 投诉对话id
	*@param  talk_id
	*/
	public void setTalk_id(Integer talk_id ){
		this.talk_id = talk_id;
	}
	
	/**
	* 投诉id
	*@return 
	*/
	public Integer getComplain_id(){
		return  complain_id;
	}
	/**
	* 投诉id
	*@param  complain_id
	*/
	public void setComplain_id(Integer complain_id ){
		this.complain_id = complain_id;
	}
	
	/**
	* 对话管理员，屏蔽对话人的id
	*@return 
	*/
	public Integer getTalk_admin(){
		return  talk_admin;
	}
	/**
	* 对话管理员，屏蔽对话人的id
	*@param  talk_admin
	*/
	public void setTalk_admin(Integer talk_admin ){
		this.talk_admin = talk_admin;
	}
	
	/**
	* 对话发表时间
	*@return 
	*/
	public Integer getTalk_datetime(){
		return  talk_datetime;
	}
	/**
	* 对话发表时间
	*@param  talk_datetime
	*/
	public void setTalk_datetime(Integer talk_datetime ){
		this.talk_datetime = talk_datetime;
	}
	
	/**
	* 发言人id
	*@return 
	*/
	public Integer getTalk_member_id(){
		return  talk_member_id;
	}
	/**
	* 发言人id
	*@param  talk_member_id
	*/
	public void setTalk_member_id(Integer talk_member_id ){
		this.talk_member_id = talk_member_id;
	}
	
	/**
	* 发言状态(1-显示/2-不显示)
	*@return 
	*/
	public Integer getTalk_state(){
		return  talk_state;
	}
	/**
	* 发言状态(1-显示/2-不显示)
	*@param  talk_state
	*/
	public void setTalk_state(Integer talk_state ){
		this.talk_state = talk_state;
	}
	
	/**
	* 发言内容
	*@return 
	*/
	public String getTalk_content(){
		return  talk_content;
	}
	/**
	* 发言内容
	*@param  talk_content
	*/
	public void setTalk_content(String talk_content ){
		this.talk_content = talk_content;
	}
	
	/**
	* 发言人名称
	*@return 
	*/
	public String getTalk_member_name(){
		return  talk_member_name;
	}
	/**
	* 发言人名称
	*@param  talk_member_name
	*/
	public void setTalk_member_name(String talk_member_name ){
		this.talk_member_name = talk_member_name;
	}
	
	/**
	* 发言人类型(1-投诉人/2-被投诉人/3-平台)
	*@return 
	*/
	public String getTalk_member_type(){
		return  talk_member_type;
	}
	/**
	* 发言人类型(1-投诉人/2-被投诉人/3-平台)
	*@param  talk_member_type
	*/
	public void setTalk_member_type(String talk_member_type ){
		this.talk_member_type = talk_member_type;
	}
	

}
