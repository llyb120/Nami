package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_express")
public class RaExpress   {
	
	/*
	是否支持服务站配送0否1是
	*/
	private Integer eZtState ;
	/*
	索引ID
	*/
	private Integer id ;
	/*
	编号
	*/
	private String eCode ;
	/*
	首字母
	*/
	private String eLetter ;
	/*
	公司名称
	*/
	private String eName ;
	/*
	1常用2不常用
	*/
	private String eOrder ;
	/*
	状态
	*/
	private String eState ;
	/*
	公司网址
	*/
	private String eUrl ;
	
	public RaExpress() {
	}
	
	/**
	* 是否支持服务站配送0否1是
	*@return 
	*/
	public Integer geteZtState(){
		return  eZtState;
	}
	/**
	* 是否支持服务站配送0否1是
	*@param  eZtState
	*/
	public void seteZtState(Integer eZtState ){
		this.eZtState = eZtState;
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
	public String geteCode(){
		return  eCode;
	}
	/**
	* 编号
	*@param  eCode
	*/
	public void seteCode(String eCode ){
		this.eCode = eCode;
	}
	
	/**
	* 首字母
	*@return 
	*/
	public String geteLetter(){
		return  eLetter;
	}
	/**
	* 首字母
	*@param  eLetter
	*/
	public void seteLetter(String eLetter ){
		this.eLetter = eLetter;
	}
	
	/**
	* 公司名称
	*@return 
	*/
	public String geteName(){
		return  eName;
	}
	/**
	* 公司名称
	*@param  eName
	*/
	public void seteName(String eName ){
		this.eName = eName;
	}
	
	/**
	* 1常用2不常用
	*@return 
	*/
	public String geteOrder(){
		return  eOrder;
	}
	/**
	* 1常用2不常用
	*@param  eOrder
	*/
	public void seteOrder(String eOrder ){
		this.eOrder = eOrder;
	}
	
	/**
	* 状态
	*@return 
	*/
	public String geteState(){
		return  eState;
	}
	/**
	* 状态
	*@param  eState
	*/
	public void seteState(String eState ){
		this.eState = eState;
	}
	
	/**
	* 公司网址
	*@return 
	*/
	public String geteUrl(){
		return  eUrl;
	}
	/**
	* 公司网址
	*@param  eUrl
	*/
	public void seteUrl(String eUrl ){
		this.eUrl = eUrl;
	}
	

}
