package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_circle_mldefault")
public class RaCircleMldefault   {
	
	// alias
	public static final String ALIAS_mld_id = "mld_id";
	public static final String ALIAS_mld_exp = "mld_exp";
	public static final String ALIAS_mld_name = "mld_name";
	
	/*
	头衔等级
	*/
	private Integer mld_id ;
	/*
	所需经验值
	*/
	private Integer mld_exp ;
	/*
	头衔名称
	*/
	private String mld_name ;
	
	public RaCircleMldefault() {
	}
	
	/**
	* 头衔等级
	*@return 
	*/
	public Integer getMld_id(){
		return  mld_id;
	}
	/**
	* 头衔等级
	*@param  mld_id
	*/
	public void setMld_id(Integer mld_id ){
		this.mld_id = mld_id;
	}
	
	/**
	* 所需经验值
	*@return 
	*/
	public Integer getMld_exp(){
		return  mld_exp;
	}
	/**
	* 所需经验值
	*@param  mld_exp
	*/
	public void setMld_exp(Integer mld_exp ){
		this.mld_exp = mld_exp;
	}
	
	/**
	* 头衔名称
	*@return 
	*/
	public String getMld_name(){
		return  mld_name;
	}
	/**
	* 头衔名称
	*@param  mld_name
	*/
	public void setMld_name(String mld_name ){
		this.mld_name = mld_name;
	}
	

}
