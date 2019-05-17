package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_circle_mldefault")
public class RaCircleMldefault   {
	
	/*
	头衔等级
	*/
	private Integer mldId ;
	/*
	所需经验值
	*/
	private Integer mldExp ;
	/*
	头衔名称
	*/
	private String mldName ;
	
	public RaCircleMldefault() {
	}
	
	/**
	* 头衔等级
	*@return 
	*/
	public Integer getMldId(){
		return  mldId;
	}
	/**
	* 头衔等级
	*@param  mldId
	*/
	public void setMldId(Integer mldId ){
		this.mldId = mldId;
	}
	
	/**
	* 所需经验值
	*@return 
	*/
	public Integer getMldExp(){
		return  mldExp;
	}
	/**
	* 所需经验值
	*@param  mldExp
	*/
	public void setMldExp(Integer mldExp ){
		this.mldExp = mldExp;
	}
	
	/**
	* 头衔名称
	*@return 
	*/
	public String getMldName(){
		return  mldName;
	}
	/**
	* 头衔名称
	*@param  mldName
	*/
	public void setMldName(String mldName ){
		this.mldName = mldName;
	}
	

}
