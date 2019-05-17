package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_mb_special")
public class RaMbSpecial   {
	
	// alias
	public static final String ALIAS_special_id = "special_id";
	public static final String ALIAS_special_desc = "special_desc";
	
	/*
	专题编号
	*/
	private Integer special_id ;
	/*
	专题描述
	*/
	private String special_desc ;
	
	public RaMbSpecial() {
	}
	
	/**
	* 专题编号
	*@return 
	*/
	public Integer getSpecial_id(){
		return  special_id;
	}
	/**
	* 专题编号
	*@param  special_id
	*/
	public void setSpecial_id(Integer special_id ){
		this.special_id = special_id;
	}
	
	/**
	* 专题描述
	*@return 
	*/
	public String getSpecial_desc(){
		return  special_desc;
	}
	/**
	* 专题描述
	*@param  special_desc
	*/
	public void setSpecial_desc(String special_desc ){
		this.special_desc = special_desc;
	}
	

}
