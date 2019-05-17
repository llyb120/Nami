package com.beeasy.easyshop.model;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;
import org.beetl.sql.core.annotatoin.Table;


/* 
* 
* gen by beetlsql 2019-05-17
*/
@Table(name="yoehi.ra_store_class")
public class RaStoreClass   {
	
	// alias
	public static final String ALIAS_sc_id = "sc_id";
	public static final String ALIAS_sc_bail = "sc_bail";
	public static final String ALIAS_sc_sort = "sc_sort";
	public static final String ALIAS_sc_name = "sc_name";
	
	/*
	索引ID
	*/
	private Integer sc_id ;
	/*
	保证金数额
	*/
	private Integer sc_bail ;
	/*
	排序
	*/
	private Integer sc_sort ;
	/*
	分类名称
	*/
	private String sc_name ;
	
	public RaStoreClass() {
	}
	
	/**
	* 索引ID
	*@return 
	*/
	public Integer getSc_id(){
		return  sc_id;
	}
	/**
	* 索引ID
	*@param  sc_id
	*/
	public void setSc_id(Integer sc_id ){
		this.sc_id = sc_id;
	}
	
	/**
	* 保证金数额
	*@return 
	*/
	public Integer getSc_bail(){
		return  sc_bail;
	}
	/**
	* 保证金数额
	*@param  sc_bail
	*/
	public void setSc_bail(Integer sc_bail ){
		this.sc_bail = sc_bail;
	}
	
	/**
	* 排序
	*@return 
	*/
	public Integer getSc_sort(){
		return  sc_sort;
	}
	/**
	* 排序
	*@param  sc_sort
	*/
	public void setSc_sort(Integer sc_sort ){
		this.sc_sort = sc_sort;
	}
	
	/**
	* 分类名称
	*@return 
	*/
	public String getSc_name(){
		return  sc_name;
	}
	/**
	* 分类名称
	*@param  sc_name
	*/
	public void setSc_name(String sc_name ){
		this.sc_name = sc_name;
	}
	

}
