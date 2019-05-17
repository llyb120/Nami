package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_mb_special")
public class RaMbSpecial   {
	
	/*
	专题编号
	*/
	private Integer specialId ;
	/*
	专题描述
	*/
	private String specialDesc ;
	
	public RaMbSpecial() {
	}
	
	/**
	* 专题编号
	*@return 
	*/
	public Integer getSpecialId(){
		return  specialId;
	}
	/**
	* 专题编号
	*@param  specialId
	*/
	public void setSpecialId(Integer specialId ){
		this.specialId = specialId;
	}
	
	/**
	* 专题描述
	*@return 
	*/
	public String getSpecialDesc(){
		return  specialDesc;
	}
	/**
	* 专题描述
	*@param  specialDesc
	*/
	public void setSpecialDesc(String specialDesc ){
		this.specialDesc = specialDesc;
	}
	

}
