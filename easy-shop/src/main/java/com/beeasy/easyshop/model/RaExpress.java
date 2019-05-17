package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_express")
public class RaExpress   {
	
	// alias
	public static final String ALIAS_e_zt_state = "e_zt_state";
	public static final String ALIAS_id = "id";
	public static final String ALIAS_e_code = "e_code";
	public static final String ALIAS_e_letter = "e_letter";
	public static final String ALIAS_e_name = "e_name";
	public static final String ALIAS_e_order = "e_order";
	public static final String ALIAS_e_state = "e_state";
	public static final String ALIAS_e_url = "e_url";
	
	/*
	是否支持服务站配送0否1是
	*/
	private Integer e_zt_state ;
	/*
	索引ID
	*/
	private Integer id ;
	/*
	编号
	*/
	private String e_code ;
	/*
	首字母
	*/
	private String e_letter ;
	/*
	公司名称
	*/
	private String e_name ;
	/*
	1常用2不常用
	*/
	private String e_order ;
	/*
	状态
	*/
	private String e_state ;
	/*
	公司网址
	*/
	private String e_url ;
	
	public RaExpress() {
	}
	
	/**
	* 是否支持服务站配送0否1是
	*@return 
	*/
	public Integer getE_zt_state(){
		return  e_zt_state;
	}
	/**
	* 是否支持服务站配送0否1是
	*@param  e_zt_state
	*/
	public void setE_zt_state(Integer e_zt_state ){
		this.e_zt_state = e_zt_state;
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getId(){
		return  id;
	}
	/**
	* 索引ID
	*@param  id
	*/
	public void setId(Integer id ){
		this.id = id;
	}
	
	/**
	* 编号
	*@return 
	*/
	public String getE_code(){
		return  e_code;
	}
	/**
	* 编号
	*@param  e_code
	*/
	public void setE_code(String e_code ){
		this.e_code = e_code;
	}
	
	/**
	* 首字母
	*@return 
	*/
	public String getE_letter(){
		return  e_letter;
	}
	/**
	* 首字母
	*@param  e_letter
	*/
	public void setE_letter(String e_letter ){
		this.e_letter = e_letter;
	}
	
	/**
	* 公司名称
	*@return 
	*/
	public String getE_name(){
		return  e_name;
	}
	/**
	* 公司名称
	*@param  e_name
	*/
	public void setE_name(String e_name ){
		this.e_name = e_name;
	}
	
	/**
	* 1常用2不常用
	*@return 
	*/
	public String getE_order(){
		return  e_order;
	}
	/**
	* 1常用2不常用
	*@param  e_order
	*/
	public void setE_order(String e_order ){
		this.e_order = e_order;
	}
	
	/**
	* 状态
	*@return 
	*/
	public String getE_state(){
		return  e_state;
	}
	/**
	* 状态
	*@param  e_state
	*/
	public void setE_state(String e_state ){
		this.e_state = e_state;
	}
	
	/**
	* 公司网址
	*@return 
	*/
	public String getE_url(){
		return  e_url;
	}
	/**
	* 公司网址
	*@param  e_url
	*/
	public void setE_url(String e_url ){
		this.e_url = e_url;
	}
	

}
