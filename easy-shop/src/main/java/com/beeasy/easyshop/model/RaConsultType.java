package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_consult_type")
public class RaConsultType   {
	
	// alias
	public static final String ALIAS_ct_id = "ct_id";
	public static final String ALIAS_ct_sort = "ct_sort";
	public static final String ALIAS_ct_introduce = "ct_introduce";
	public static final String ALIAS_ct_name = "ct_name";
	
	/*
	咨询类型id
	*/
	private Integer ct_id ;
	/*
	咨询类型排序
	*/
	private Integer ct_sort ;
	/*
	咨询类型详细介绍
	*/
	private String ct_introduce ;
	/*
	咨询类型名称
	*/
	private String ct_name ;
	
	public RaConsultType() {
	}
	
	/**
	* 咨询类型id
	*@return 
	*/
	public Integer getCt_id(){
		return  ct_id;
	}
	/**
	* 咨询类型id
	*@param  ct_id
	*/
	public void setCt_id(Integer ct_id ){
		this.ct_id = ct_id;
	}
	
	/**
	* 咨询类型排序
	*@return 
	*/
	public Integer getCt_sort(){
		return  ct_sort;
	}
	/**
	* 咨询类型排序
	*@param  ct_sort
	*/
	public void setCt_sort(Integer ct_sort ){
		this.ct_sort = ct_sort;
	}
	
	/**
	* 咨询类型详细介绍
	*@return 
	*/
	public String getCt_introduce(){
		return  ct_introduce;
	}
	/**
	* 咨询类型详细介绍
	*@param  ct_introduce
	*/
	public void setCt_introduce(String ct_introduce ){
		this.ct_introduce = ct_introduce;
	}
	
	/**
	* 咨询类型名称
	*@return 
	*/
	public String getCt_name(){
		return  ct_name;
	}
	/**
	* 咨询类型名称
	*@param  ct_name
	*/
	public void setCt_name(String ct_name ){
		this.ct_name = ct_name;
	}
	

}
