package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_type_spec")
public class RaTypeSpec   {
	
	// alias
	public static final String ALIAS_sp_id = "sp_id";
	public static final String ALIAS_type_id = "type_id";
	
	/*
	规格id
	*/
	private Integer sp_id ;
	/*
	类型id
	*/
	private Integer type_id ;
	
	public RaTypeSpec() {
	}
	
	/**
	* 规格id
	*@return 
	*/
	public Integer getSp_id(){
		return  sp_id;
	}
	/**
	* 规格id
	*@param  sp_id
	*/
	public void setSp_id(Integer sp_id ){
		this.sp_id = sp_id;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getType_id(){
		return  type_id;
	}
	/**
	* 类型id
	*@param  type_id
	*/
	public void setType_id(Integer type_id ){
		this.type_id = type_id;
	}
	

}
