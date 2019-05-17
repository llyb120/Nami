package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_thpollvoter")
public class RaCircleThpollvoter   {
	
	// alias
	public static final String ALIAS_member_id = "member_id";
	public static final String ALIAS_theme_id = "theme_id";
	public static final String ALIAS_member_name = "member_name";
	public static final String ALIAS_pollvo_options = "pollvo_options";
	public static final String ALIAS_pollvo_time = "pollvo_time";
	
	/*
	成员id
	*/
	private Integer member_id ;
	/*
	话题id
	*/
	private Integer theme_id ;
	/*
	成员名称
	*/
	private String member_name ;
	/*
	投票选项
	*/
	private String pollvo_options ;
	/*
	投票选项
	*/
	private String pollvo_time ;
	
	public RaCircleThpollvoter() {
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
	* 话题id
	*@return 
	*/
	public Integer getTheme_id(){
		return  theme_id;
	}
	/**
	* 话题id
	*@param  theme_id
	*/
	public void setTheme_id(Integer theme_id ){
		this.theme_id = theme_id;
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
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollvo_options(){
		return  pollvo_options;
	}
	/**
	* 投票选项
	*@param  pollvo_options
	*/
	public void setPollvo_options(String pollvo_options ){
		this.pollvo_options = pollvo_options;
	}
	
	/**
	* 投票选项
	*@return 
	*/
	public String getPollvo_time(){
		return  pollvo_time;
	}
	/**
	* 投票选项
	*@param  pollvo_time
	*/
	public void setPollvo_time(String pollvo_time ){
		this.pollvo_time = pollvo_time;
	}
	

}
