package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_setting")
public class RaSetting   {
	
	/*
	名称
	*/
	private String name ;
	/*
	值
	*/
	private String value ;
	
	public RaSetting() {
	}
	
	/**
	* 名称
	*@return 
	*/
	public String getName(){
		return  name;
	}
	/**
	* 名称
	*@param  name
	*/
	public void setName(String name ){
		this.name = name;
	}
	
	/**
	* 值
	*@return 
	*/
	public String getValue(){
		return  value;
	}
	/**
	* 值
	*@param  value
	*/
	public void setValue(String value ){
		this.value = value;
	}
	

}
