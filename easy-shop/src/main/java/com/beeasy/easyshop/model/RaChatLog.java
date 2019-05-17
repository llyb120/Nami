package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_chat_log")
public class RaChatLog   {
	
	// alias
	public static final String ALIAS_m_id = "m_id";
	public static final String ALIAS_add_time = "add_time";
	public static final String ALIAS_f_id = "f_id";
	public static final String ALIAS_t_id = "t_id";
	public static final String ALIAS_f_ip = "f_ip";
	public static final String ALIAS_f_name = "f_name";
	public static final String ALIAS_t_msg = "t_msg";
	public static final String ALIAS_t_name = "t_name";
	
	/*
	记录ID
	*/
	private Integer m_id ;
	/*
	添加时间
	*/
	private Integer add_time ;
	/*
	会员ID
	*/
	private Integer f_id ;
	/*
	接收会员ID
	*/
	private Integer t_id ;
	/*
	发自IP
	*/
	private String f_ip ;
	/*
	会员名
	*/
	private String f_name ;
	/*
	消息内容
	*/
	private String t_msg ;
	/*
	接收会员名
	*/
	private String t_name ;
	
	public RaChatLog() {
	}
	
	/**
	* 记录ID
	*@return 
	*/
	public Integer getM_id(){
		return  m_id;
	}
	/**
	* 记录ID
	*@param  m_id
	*/
	public void setM_id(Integer m_id ){
		this.m_id = m_id;
	}
	
	/**
	* 添加时间
	*@return 
	*/
	public Integer getAdd_time(){
		return  add_time;
	}
	/**
	* 添加时间
	*@param  add_time
	*/
	public void setAdd_time(Integer add_time ){
		this.add_time = add_time;
	}
	
	/**
	* 会员ID
	*@return 
	*/
	public Integer getF_id(){
		return  f_id;
	}
	/**
	* 会员ID
	*@param  f_id
	*/
	public void setF_id(Integer f_id ){
		this.f_id = f_id;
	}
	
	/**
	* 接收会员ID
	*@return 
	*/
	public Integer getT_id(){
		return  t_id;
	}
	/**
	* 接收会员ID
	*@param  t_id
	*/
	public void setT_id(Integer t_id ){
		this.t_id = t_id;
	}
	
	/**
	* 发自IP
	*@return 
	*/
	public String getF_ip(){
		return  f_ip;
	}
	/**
	* 发自IP
	*@param  f_ip
	*/
	public void setF_ip(String f_ip ){
		this.f_ip = f_ip;
	}
	
	/**
	* 会员名
	*@return 
	*/
	public String getF_name(){
		return  f_name;
	}
	/**
	* 会员名
	*@param  f_name
	*/
	public void setF_name(String f_name ){
		this.f_name = f_name;
	}
	
	/**
	* 消息内容
	*@return 
	*/
	public String getT_msg(){
		return  t_msg;
	}
	/**
	* 消息内容
	*@param  t_msg
	*/
	public void setT_msg(String t_msg ){
		this.t_msg = t_msg;
	}
	
	/**
	* 接收会员名
	*@return 
	*/
	public String getT_name(){
		return  t_name;
	}
	/**
	* 接收会员名
	*@param  t_name
	*/
	public void setT_name(String t_name ){
		this.t_name = t_name;
	}
	

}
