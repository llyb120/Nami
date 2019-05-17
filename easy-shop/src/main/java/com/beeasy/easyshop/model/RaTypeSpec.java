package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-04-24
*/
@Table(name="yoehi.ra_type_spec")
public class RaTypeSpec   {
	
	/*
	规格id
	*/
	private Integer spId ;
	/*
	类型id
	*/
	private Integer typeId ;
	
	public RaTypeSpec() {
	}
	
	/**
	* 规格id
	*@return 
	*/
	public Integer getSpId(){
		return  spId;
	}
	/**
	* 规格id
	*@param  spId
	*/
	public void setSpId(Integer spId ){
		this.spId = spId;
	}
	
	/**
	* 类型id
	*@return 
	*/
	public Integer getTypeId(){
		return  typeId;
	}
	/**
	* 类型id
	*@param  typeId
	*/
	public void setTypeId(Integer typeId ){
		this.typeId = typeId;
	}
	

}
